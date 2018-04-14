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
        return this.binario[1] == 1;  //alterei apenas para testes de divisao
    }
    
    public boolean ehZero(){
        for(int i=0; i < 32; i++){
            if(this.binario[i] == 0)  contaZeros++;
            if(contaZeros == numeroDeBits)  return true;
        }
        return false;
    }
    
    public void imprime(){
        for(int i=0; i < numeroDeBits; i++) {
            System.out.printf("%d", this.binario[i]);
        }
        System.out.println();
    }
    
    public IntBinario soma(IntBinario outro) {
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
        for(int i=0; i < numeroDeBits; i++) {
            if(outro.binario[i] == 1) {
                complementoDeDois.binario[i] = 0;
            }
            else if (outro.binario[i] == 0) {
                complementoDeDois.binario[i] = 1;
            }
        }
        complementoDeDois = complementoDeDois.soma(new IntBinario(1));
        IntBinario resultadoSub = this.soma(complementoDeDois);
        return resultadoSub;
    }
    
    public int compara(IntBinario outro) {
        for(int i=0; i < numeroDeBits; i++){
            if (outro.binario[i] != this.binario[i]){
                return this.binario[i] - outro.binario[i];
            }
        }
        // retorna 0 para divisor == dividendo,  1 para dividendo maior que divisor, -1 para divisor maior que dividendo
        return 0;
    }

    public IntBinario divisao(IntBinario divisor) {
        
        IntBinario resultadoDiv;
        IntBinario dividendo = this;
         
        if(divisor.ehZero())    
            System.out.println("A divisão por zero não é permitida aqui."); //bloqueia divisao por 0 (ok)
        
        if(dividendo.ehZero())  
            return dividendo;
            
        // tem que retornar o quociente e o resto da divisao

        IntBinario quociente = new IntBinario(0);
        IntBinario resto = dividendo;
            
        while(!(dividendo.subtracao(divisor)) .ehNegativo()){
                quociente = quociente.soma(new IntBinario(1));
                dividendo = dividendo.subtracao(divisor);   
                
                resto = resto.subtracao(divisor);
      
        }
        return quociente;   //Blz para divisão de positivos  
    }
    
    public IntBinario multBooth(){
        return this;
    } 
}
