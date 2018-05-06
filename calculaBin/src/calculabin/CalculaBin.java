
package calculabin;

import static calculabin.TestaInt.*;


public class CalculaBin { 
    
    public static void main(String[] args) {
        //testeSoma();
        // testeSubtracao();
          testeMultiplicacao();
//        IntBinario num1 = new IntBinario(8);
//        IntBinario num2 = new IntBinario(10);
//        IntBinario result[] = num1.divisao(num2);
//        int quociente = result[0].paraInt();
//        int resto = result[1].paraInt();
//        System.out.println(quociente);
//        System.out.println(resto);
//        
        
        FloatBinario f1 = new FloatBinario(91.34375f);
        FloatBinario f2 = new FloatBinario(0.14453125f);
        
        FloatBinario r = f1.divisao(f2)[0];
        
    }
}
