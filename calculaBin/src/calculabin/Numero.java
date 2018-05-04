package calculabin;

public interface Numero<T extends Numero> {
    
    T soma(T outro);
    
    T subtracao(T outro);
    
    T multiplicacao(T outro);
    
    T[] divisao(T divisor);
    
    String paraStringDecimal();
}
