package calculabin;

public class IntBinario {
    final int numeroDeBits = 32; 
    // lembrar que sempre o primeiro bit vai ser o bit de sinal (1 para negativo, 0 para positivo)
    protected int[] binario = new int[numeroDeBits];    
    
    // construtor padrao da classe
    public IntBinario(){
    }
    
    // construtor que converte um int para a forma binaria
    public IntBinario(Integer numero) {
        String strNum = Integer.toBinaryString(numero);
        for (int x=1; x <= strNum.length(); x++) {
            this.binario[numeroDeBits-x] = Character.getNumericValue(strNum.charAt(strNum.length()-x)); 
        }
    }
    
    public boolean ehNegativo() {
        return this.binario[0] == 1;
    }
    
    public void imprime(){
        for(int i=0; i < numeroDeBits; i++) {
            System.out.printf("%d", this.binario[i]);
        }
        System.out.println();
    }
    
    public IntBinario soma(IntBinario outro){
        IntBinario resultadoSoma = new IntBinario();
        int sobe = 0;
        
        for (int i=numeroDeBits-1; i > 0; i--) {
            int bit1 = this.binario[i];
            int bit2 = outro.binario[i];
            int soma = bit1 + bit2 + sobe;
            resultadoSoma.binario[i] = soma % 2;
            sobe = soma / 2;
        }
        return resultadoSoma;
    }
    
    public IntBinario subtracao(IntBinario outro){
        IntBinario complementoDeDois = new IntBinario();
        // onde tem 0 coloco 1 onde tem 1 coloco 0 
        for(int i=0; i < numeroDeBits-1; i++) {
            if(outro.binario[i] == 1){
                complementoDeDois.binario[i] = 0;
            }
            else if (outro.binario[i] == 0){
                complementoDeDois.binario[i] = 1;
            }
        }
        // calcula a soma para o complemento de dois
        IntBinario resultadoSub = soma(complementoDeDois.soma(new IntBinario(1)));
        return resultadoSub;
    }
    
    public int compara(IntBinario outro){
        for(int i=0; i < numeroDeBits-1; i++){
            if (outro.binario[i] != this.binario[i]){
                return this.binario[i] - outro.binario[i];
            }
        }
        // retorna 0 para divisor == dividendo
        //  1 para dividendo maior que divisor 
        // -1 para divisor maior que dividendo
        return 0;
    }

    public IntBinario divisao(IntBinario divisor){
        // ajeitar a verificacao de divisao por zero
        
        // tem que retornar o quociente e o resto da divisao
        IntBinario quociente = new IntBinario();
        IntBinario resto = new IntBinario();
        
        int verificador = compara(divisor);
        System.out.println(verificador);       
        
        IntBinario resultadoDiv = new IntBinario();
        
        return resultadoDiv; 
    }
    
    public IntBinario multBooth(){
        return this;
    } 
}
