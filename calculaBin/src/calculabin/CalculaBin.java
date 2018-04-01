
package calculabin;

public class CalculaBin {
    
    // recebe o numero do usuario e verifica se eh int ou float
    
    // se for int so manda pra converte_int, se float manda pra recebe_float
    
    // recebe_float : func recebe numero float, converte binario, manda matissas dos dois numeros para as demais (+,-,*,/)
    
    // func converte_int : converte int em bin 
    
    // func soma int 
    
    // func subtrai int
    
    // func divide int 
    
    // func multiplica int algoritmo de booth
    
    // retorna o resultado em binario
    public static void main(String args[]) {
        int[] num = {};
        // int n = decimalParaBinario(18, num);
        binario(3);
        // System.out.println(n);
    }
    public static int binario(int numero) {
        int d = numero;
        StringBuilder num = new StringBuilder(); // StringBuilder: string mutavel
        while (d > 0) {
                int b = d % 2;
                num.append(b);
                d = d >> 1;   // deslocamento logico, preenche sempre com zero a esquerda
        }
        String binarioS = num.reverse().toString();
        int binario = Integer.parseInt(binarioS);
        System.out.println(binario);
        return(binario);
    }
}
