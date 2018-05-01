package calculabin;

public class FloatBinario {

    final int numeroDeBits = 32;
    final int bitsExpoente = 8;
    final int bitsMantissa = 23;
    final int bias = 127;
    final int inicioMantissa = bitsExpoente + 1;

    protected int[] binario = new int[numeroDeBits];

    public FloatBinario() {
    }

    public FloatBinario(float numero) {
        int intBits = Float.floatToIntBits(numero);
        String strNum = Integer.toBinaryString(intBits);

        for (int x = 1; x <= strNum.length(); x++) {
            this.binario[numeroDeBits - x] = Character.getNumericValue(strNum.charAt(strNum.length() - x));
        }
    }

    public void imprime() {
        BinUtils.imprime(this.binario);
    }

    public boolean ehNegativo() {
        return this.binario[0] == 1;
    }

    public float paraFloat() {
        String stringBin = new String();
        for (int i = 1; i < numeroDeBits; i++) {
            stringBin += this.binario[i];
        }

        int intBits = Integer.parseInt(stringBin, 2);
        float myFloat = Float.intBitsToFloat(intBits);

        if (this.ehNegativo()) {
            return -1 * myFloat;
        }
        return myFloat;
    }

    public int expoente() {
        String stringBin = new String();
        for (int i = 1; i < bitsExpoente + 1; i++) {
            stringBin += this.binario[i];
        }
        return Integer.parseInt(stringBin, 2);
    }

    public int sinal() {
        return this.binario[0];
    }    
    
    public int[] mantissa() {
        int[] mantissa = new int[bitsMantissa + 2];

        // restaura o 1 implicito, pois ele será necessário
        if (this.expoente() != 0) {
            mantissa[1] = 1;
        }

        // copia os bits da mantissa
        for (int i = 0; i < bitsMantissa; i++) {
            mantissa[i + 2] = this.binario[inicioMantissa + i];
        }

        return mantissa;
    }

    public int compara(FloatBinario outro) {
        return BinUtils.compara(this.binario, outro.binario, 1);
    }

    public FloatBinario soma(FloatBinario outro) {
        // primeiro descobre qual possui maior expoente
        FloatBinario maior, menor;
        int menorExpoente, maiorExpoente, menorMantissa[], maiorMantissa[];

        if (this.compara(outro) <= 0) {
            menor = this;
            menorExpoente = this.expoente();
            menorMantissa = this.mantissa();

            maior = outro;
            maiorExpoente = outro.expoente();
            maiorMantissa = outro.mantissa();
        } else {
            menor = outro;
            menorExpoente = outro.expoente();
            menorMantissa = outro.mantissa();

            maior = this;
            maiorExpoente = this.expoente();
            maiorMantissa = this.mantissa();
        }

        // desloca o menor para a direita até igualar os expoentes
        while (menorExpoente < maiorExpoente) {
            BinUtils.deslocaDireita(menorMantissa);
            menorExpoente++;
        }

        // se os sinais nao batem, tem que subtrair
        if (this.ehNegativo() != outro.ehNegativo()) {
            menorMantissa = BinUtils.complementoDeDois(menorMantissa);
        }

        // soma as duas mantissas
        FloatBinario resultado = new FloatBinario();
        int soma[] = BinUtils.soma(maiorMantissa, menorMantissa);

        int resultadoExpoente = maiorExpoente + 1;

        // encontra o primeiro 1 da mantissa e acerta o expoente de acordo
        int iMantissa = 0;
        while (iMantissa < bitsMantissa + 2 && soma[iMantissa] == 0) {
            iMantissa++;
            resultadoExpoente--;
        }
        iMantissa++;

        // se a soma é zero, o expoente tem de ser zero
        if (iMantissa == bitsMantissa + 3) {
            resultadoExpoente = 0;
        }

        // copia a mantissa
        for (int i = 0; i < bitsMantissa + 1 - iMantissa; i++) {
            resultado.binario[inicioMantissa + i] = soma[iMantissa + i];
        }

        // seta o expoente
        resultado.setExpoente(resultadoExpoente);

        // acerta o sinal
        if (maior.ehNegativo()) {
            resultado.binario[0] = 1;
        } else {
            resultado.binario[0] = 0;
        }

        return resultado;
    }

    public FloatBinario oposto() {
        FloatBinario oposto = new FloatBinario();
        System.arraycopy(this.binario, 1, oposto.binario, 1, numeroDeBits - 1);
        oposto.binario[0] = 1;
        return oposto;
    }

    public FloatBinario subtracao(FloatBinario outro) {
        return this.soma(outro.oposto());
    }

    public FloatBinario multiplicacao(FloatBinario outro) {
        return new FloatBinario(this.paraFloat() + outro.paraFloat());
    }

    public boolean ehZero() {
        for (int i = 1; i < numeroDeBits; i++)
            if (this.binario[i] == 1)
                return false;
        return true;
    }

    public FloatBinario divisao(FloatBinario divisor) { 
        FloatBinario dividendo = this;

        if (divisor.ehZero()) {
            throw new IllegalArgumentException("Nao eh possivel dividir por zero");
        }

        int sinal = dividendo.sinal() ^ divisor.sinal();
        
        int exp;
        int quociente[] = new int[bitsMantissa];
        int m1[] = new int[numeroDeBits];
        int m2[] = new int[numeroDeBits];
                
        // armazena as mantissas em 32 bits
        System.arraycopy(dividendo.binario, inicioMantissa, m1, inicioMantissa, bitsMantissa);
        System.arraycopy(divisor.binario, inicioMantissa, m2, inicioMantissa, bitsMantissa);
        
        // seta o 1 implicito
        m1[inicioMantissa-1] = 1;
        m2[inicioMantissa-1] = 1;
        
        // mantissa = m1/m2
        for (int i=0; i<bitsMantissa; i++) {
            if (BinUtils.compara(m1, m2) < 0) {
                quociente[i] = 0;
            } else {
                quociente[i] = 1;
                m1 = BinUtils.subtrai(m1, m2);
            }
            BinUtils.deslocaEsquerda(m1);
        }
        
        exp = dividendo.expoente() - divisor.expoente();
        
        // normalizar        
        int iMantissa = 0;
        while (iMantissa < bitsMantissa && quociente[iMantissa] == 0) {
            iMantissa++;
            exp--;
        }
        iMantissa++;
        
        FloatBinario resultado = new FloatBinario();
        // copia a mantissa
        System.arraycopy(quociente, iMantissa, resultado.binario, inicioMantissa, bitsMantissa-iMantissa);
        
        // seta o expoente
        resultado.setExpoente(exp + bias);
        
        // seta o sinal
        resultado.binario[0] = sinal;
        
        return resultado;
    }

    private void setExpoente(int expoente) {
        int expoenteBin[] = BinUtils.paraBin(expoente, bitsExpoente);
        for (int i = 1; i <= bitsExpoente; i++) {
            this.binario[i] = expoenteBin[i - 1];
        }
    }
}
