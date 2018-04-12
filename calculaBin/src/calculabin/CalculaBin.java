
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

    public static void main(String[] args) {
        IntBinario numero1 = new IntBinario(20);
        IntBinario numero2 = new IntBinario(4);
        // numero1.imprime();
        // numero2.imprime();
        IntBinario resultado = numero1.soma(numero2);
        // resultado.imprime();
        IntBinario prova = resultado.subtracao(numero2);
        // prova.imprime();
        numero2.divisao(prova);
    }
}
