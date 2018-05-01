package calculabin;

public class FloatBinario {

    final int numeroDeBits = 32;
    final int bitsExpoente = 8;
    final int bitsMantissa = 23;
    final int inicioMantissa = bitsExpoente + 1;

    protected int[] binario = new int[numeroDeBits];

    public FloatBinario() {}
    
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
        for(int i=1; i < numeroDeBits; i++) {
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
        for(int i=1; i < bitsExpoente+1; i++) {
            stringBin += this.binario[i];
        }
        return Integer.parseInt(stringBin, 2);
    }
    
    public int[] mantissa() { 
        int[] mantissa = new int[bitsMantissa+2];
        
        // restaura o 1 implicito, pois ele será necessário
        if (this.expoente() != 0)
            mantissa[1] = 1;
        
        // copia os bits da mantissa
        for(int i=0; i<bitsMantissa; i++) {
            mantissa[i+2] = this.binario[inicioMantissa+i];
        }
        
        return mantissa;
    }
    
    public int compara(FloatBinario outro) {
        for (int i=1; i<numeroDeBits; i++) {
            if (outro.binario[i] != this.binario[i]){
                return this.binario[i] - outro.binario[i];
            }
        }
        
        return 0;
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
        while (iMantissa < bitsMantissa+2 && soma[iMantissa] == 0) {
            iMantissa++;
            resultadoExpoente--;
        }
        iMantissa++;
        
        // se a soma é zero, o expoente tem de ser zero
        if (iMantissa == bitsMantissa+3)
            resultadoExpoente = 0;

        // copia a mantissa
        for (int i=0; i < bitsMantissa + 1 - iMantissa; i++)
            resultado.binario[inicioMantissa+i] = soma[iMantissa+i];

        // seta o expoente
        resultado.setExpoente(resultadoExpoente);
        
        // acerta o sinal
        if (maior.ehNegativo())
            resultado.binario[0] = 1;
        else
            resultado.binario[0] = 0;
        
        return resultado;
    }
    
    public FloatBinario oposto() {
        FloatBinario oposto = new FloatBinario();
        System.arraycopy(this.binario, 1, oposto.binario, 1, numeroDeBits-1);
        oposto.binario[0] = 1;
        return oposto;
    }
    
    public FloatBinario subtracao(FloatBinario outro) {
        return this.soma(outro.oposto());
    }
    
    public FloatBinario multiplicacao(FloatBinario outro) {
        return new FloatBinario(this.paraFloat() + outro.paraFloat());
    }
    
    public FloatBinario divisao(FloatBinario outro) {
        return new FloatBinario(this.paraFloat() + outro.paraFloat());
    }

    private void setExpoente(int expoente) {
        int expoenteBin[] = BinUtils.paraBin(expoente, bitsExpoente);
        for (int i=1; i<=bitsExpoente; i++) {
            this.binario[i] = expoenteBin[i-1];
        }
    }
}
