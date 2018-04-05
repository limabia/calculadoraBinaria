package calculabin;

public class IntBinario {
    final int numeroDeBits = 32; 
    protected int[] binario = new int[numeroDeBits];
    // sempre o primeiro bit vai ser o bit de sinal
    
    public IntBinario(){
    }
    
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
        IntBinario resultado = new IntBinario();
        int sobe = 0;
        
        for (int i=numeroDeBits-1; i > 0; i--) {
            int bit1 = this.binario[i];
            int bit2 = outro.binario[i];
            int soma = bit1 + bit2 + sobe;
            resultado.binario[i] = soma % 2;
            sobe = soma / 2;
        }
        return resultado;
    }
}
