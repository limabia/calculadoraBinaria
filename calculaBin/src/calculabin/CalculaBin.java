
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
        int binario = binario(-3);
        System.out.println(binario);
    }
    
    // TODO trocar para retornar um array de inteiros com o numero
    // array de 8 posicoes, sendo o primeiro bit o de sinal
    public static int binario(int numero) {
        int binario;
        if(numero > 0){
            int d = numero;
            StringBuilder num = new StringBuilder(); // StringBuilder: string mutavel
            while (d > 0) {
                    int b = d % 2;
                    num.append(b);
                    d = d >> 1;   // deslocamento logico, preenche sempre com zero a esquerda
            }
            String binarioS = num.reverse().toString();
            binario = Integer.parseInt(binarioS);
        }
        else{
            // aplicar complemento de dois no numero
            binario = 0;
        }
        return(binario);
    }
}
