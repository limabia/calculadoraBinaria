package calculabin;

public class IntBinario implements Numero<IntBinario> {

    public IntBinario(Integer numero) {
        String strNum = Integer.toBinaryString(numero);
        for (int x = 1; x <= strNum.length(); x++) {
            this.binario[numeroDeBits - x] = Character.getNumericValue(strNum.charAt(strNum.length() - x));
        }
    }

    final int numeroDeBits = 32;
    protected int[] binario = new int[numeroDeBits];    // sempre o primeiro bit vai ser o de sinal

    // construtor padrao
    public IntBinario() {
    }

    public boolean ehNegativo() {
        return this.binario[0] == 1;
    }

    public boolean ehZero() {
        for (int i = 1; i < numeroDeBits; i++) {
            if (this.binario[i] == 1) {
                return false;
            }
        }
        return true;
    }

    public void imprime() {
        for (int i = 0; i < numeroDeBits; i++) {
            System.out.printf("%d", this.binario[i]);
        }
        System.out.println();
    }

    public int paraInt() {
        IntBinario bin = this;
        String sinal = "";

        if (this.ehNegativo()) {
            bin = this.complementoDeDois();
            sinal = "-";
        }

        String stringBin = new String();
        for (int i = 0; i < numeroDeBits; i++) {
            stringBin += bin.binario[i];
        }
        return Integer.parseInt(sinal + stringBin, 2);
    }

    public int compara(IntBinario outro) {
        for (int i = 0; i < numeroDeBits; i++) {
            if (outro.binario[i] != this.binario[i]) {
                return this.binario[i] - outro.binario[i];
            }
        }
        // retorna 0 para divisor == dividendo,  1 para this maior que outro, -1 para divisor maior que dividendo
        return 0;
    }

    public IntBinario soma(IntBinario outro) {
        IntBinario resultadoSoma = new IntBinario();
        int sobe = 0;

        for (int i = numeroDeBits - 1; i >= 0; i--) {
            int bit1 = this.binario[i];
            int bit2 = outro.binario[i];
            int soma = bit1 + bit2 + sobe;
            resultadoSoma.binario[i] = soma % 2;
            sobe = soma / 2;

        }
        return resultadoSoma;
    }

    public IntBinario complementoDeDois() {
        IntBinario complementoDeDois = new IntBinario();
        // onde tem 0 coloco 1 onde tem 1 coloco 0 
        for (int i = 0; i < numeroDeBits; i++) {
            if (this.binario[i] == 1) {
                complementoDeDois.binario[i] = 0;
            } else if (this.binario[i] == 0) {
                complementoDeDois.binario[i] = 1;
            }
        }
        complementoDeDois = complementoDeDois.soma(new IntBinario(1));
        return complementoDeDois;
    }

    @Override
    public IntBinario subtracao(IntBinario outro) {
        IntBinario resultadoSub = this.soma(outro.complementoDeDois());
        return resultadoSub;
    }

    @Override
    public IntBinario[] divisao(IntBinario divisor) {
        IntBinario dividendo = this;

        if (divisor.ehZero()) {
            throw new IllegalArgumentException("Nao eh possivel dividir por zero");
        }

        IntBinario quociente = new IntBinario(0);
        IntBinario resto = dividendo;

        boolean dividendoNeg = false, divisorNeg = false;
        if (resto.ehNegativo()) {
            dividendoNeg = true;
            resto = resto.complementoDeDois();
        }
        if (divisor.ehNegativo()) {
            divisorNeg = true;
            divisor = divisor.complementoDeDois();
        }

        while (!(resto.subtracao(divisor)).ehNegativo()) {
            quociente = quociente.soma(new IntBinario(1));
            resto = resto.subtracao(divisor);
        }

        // casos onde a divisao eh por um numero negativo ou o dividendo eh negativo o quociente deve ser tbm
        if (dividendoNeg ^ divisorNeg) {
            quociente = quociente.complementoDeDois();
        }

        // VERIFICAR o que precisa fazer com o resto da divisao por inteiros 
        // se eh pra exibir ou nao pro usuario
        return new IntBinario[]{quociente, resto};
    }

    public IntBinario deslocaDireita() {
        IntBinario deslocado = this;

        for (int i = numeroDeBits - 1; i > 0; i--) {
            deslocado.binario[i] = this.binario[i - 1];
        }
        return deslocado;
    }

    @Override
    public IntBinario multiplicacao(IntBinario multiplicador) {
        //utilizando o algoritmo de Booth
        IntBinario resultado = new IntBinario();
        int booth[] = BinUtils.multiplica(this.binario, multiplicador.binario);
        // ignora overflow
        System.arraycopy(booth, numeroDeBits, resultado.binario, 0, numeroDeBits);
        return resultado;
    }

    @Override
    public String paraStringDecimal() {
        return String.valueOf(this.paraInt());
    }
    
    @Override
    public String paraStringBinario() {
        return BinUtils.paraString(this.binario);
    }
}
