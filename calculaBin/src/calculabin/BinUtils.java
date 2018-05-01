package calculabin;


public class BinUtils {
    
    public static int[] paraBin(int numero, int numeroDeBits) {
        int resultado[] = new int[numeroDeBits];
        String strNum = Integer.toBinaryString(numero);
        for (int x=1; x <= strNum.length(); x++) {
            resultado[numeroDeBits-x] = Character.getNumericValue(strNum.charAt(strNum.length()-x)); 
        }
        return resultado;
    }
    
    public static void deslocaDireita(int bin[]) {
        for(int i=bin.length-1; i>0; i--)
            bin[i] = bin[i-1];
        bin[0] = 0;
    }
    
    public static int[] soma(int bin1[], int bin2[]) {
        int numeroDeBits = bin1.length;
        int resultado[] = new int[numeroDeBits];
        int sobe = 0;
         
        for (int i=numeroDeBits-1; i >= 0; i--) {
            int bit1 = bin1[i];
            int bit2 = bin2[i];
            int soma = bit1 + bit2 + sobe;
            resultado[i] = soma % 2;
            sobe = soma / 2;
            
        }
        return resultado;
    }
    
    public static void imprime(int bin[]) {
        for(int i=0; i < bin.length; i++) {
            System.out.printf("%d", bin[i]);
        }
        System.out.println();
    }
    
    public static int[] complementoDeDois(int bin[]) {
        int complementoDeDois[] = new int[bin.length];
        
        //copia todos os zeros e o primeiro um
        int i = bin.length-1;
        while (bin[i] == 0 && i > 0) {
            complementoDeDois[i] = bin[i];
            i--;
        }
        
        complementoDeDois[i] = bin[i];
        i--;
        
        // onde tem 0 coloco 1 onde tem 1 coloco 0 
        while (i>=0) {
            if (bin[i] == 1)
                complementoDeDois[i] = 0;
            else
                complementoDeDois[i] = 1;
            i--;
        }
        
        return complementoDeDois;
    }
}
