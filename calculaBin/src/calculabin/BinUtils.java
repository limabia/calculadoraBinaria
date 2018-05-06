package calculabin;

public class BinUtils {

    public static int[] paraBin(int numero, int numeroDeBits) {
        int resultado[] = new int[numeroDeBits];
        String strNum = Integer.toBinaryString(numero);
        for (int x = 1; x <= strNum.length(); x++) {
            resultado[numeroDeBits - x] = Character.getNumericValue(strNum.charAt(strNum.length() - x));
        }
        return resultado;
    }

    public static void deslocaDireita(int bin[]) {
        for (int i = bin.length - 1; i > 0; i--) {
            bin[i] = bin[i - 1];
        }
        bin[0] = 0;
    }

    public static void deslocaEsquerda(int bin[]) {
        for (int i = 0; i < bin.length - 1; i++) {
            bin[i] = bin[i + 1];
        }
        bin[bin.length - 1] = 0;
    }

    public static int[] soma(int bin1[], int bin2[]) {
        int numeroDeBits = bin1.length;
        int resultado[] = new int[numeroDeBits];
        int sobe = 0;

        for (int i = numeroDeBits - 1; i >= 0; i--) {
            int bit1 = bin1[i];
            int bit2 = bin2[i];
            int soma = bit1 + bit2 + sobe;
            resultado[i] = soma % 2;
            sobe = soma / 2;

        }
        return resultado;
    }

    public static int[] somaUm(int bin1[]) {
        int numeroDeBits = bin1.length;
        int resultado[] = new int[numeroDeBits];

        int soma = bin1[numeroDeBits - 1] + 1;
        resultado[numeroDeBits - 1] = soma % 2;
        int sobe = soma / 2;

        for (int i = numeroDeBits - 1; i >= 0; i--) {
            int bit1 = bin1[i];
            soma = bit1 + sobe;
            resultado[i] = soma % 2;
            sobe = soma / 2;

        }
        return resultado;
    }

    public static void imprime(int bin[]) {
        for (int i = 0; i < bin.length; i++) {
            System.out.printf("%d", bin[i]);
        }
        System.out.println();
    }

    public static int[] complementoDeDois(int bin[]) {
        int complementoDeDois[] = new int[bin.length];

        //copia todos os zeros e o primeiro um
        int i = bin.length - 1;
        while (bin[i] == 0 && i > 0) {
            complementoDeDois[i] = bin[i];
            i--;
        }

        complementoDeDois[i] = bin[i];
        i--;

        // onde tem 0 coloco 1 onde tem 1 coloco 0 
        while (i >= 0) {
            if (bin[i] == 1) {
                complementoDeDois[i] = 0;
            } else {
                complementoDeDois[i] = 1;
            }
            i--;
        }

        return complementoDeDois;
    }

    public static int[] subtrai(int bin1[], int bin2[]) {
        return soma(bin1, complementoDeDois(bin2));
    }

    public static int compara(int a[], int b[], int inicio) {
        for (int i = inicio; i < a.length; i++) {
            if (a[i] != b[i]) {
                return a[i] - b[i];
            }
        }

        return 0;
    }

    public static int compara(int a[], int b[]) {
        return compara(a, b, 0);
    }
    
    public static void deslocaDireitaBooth(int bin[]) {
        // Nao pode zerar o bit inicial
        for (int i = bin.length - 1; i > 0; i--) {
            bin[i] = bin[i - 1];
        }
    }


    public static int[] multiplica(int num1[], int num2[]) {
        //utilizando o algoritmo de Booth
        int numeroDeBits = num1.length;
        int a[] = new int[numeroDeBits];
        int m[] = new int[numeroDeBits];
        int q[] = new int[numeroDeBits];
        System.arraycopy(num1, 0, m, 0, numeroDeBits);
        System.arraycopy(num2, 0, q, 0, numeroDeBits);
        int bitAux = 0;
        
        imprime(a);
        imprime(q);
        for (int contador = numeroDeBits; contador > 0; contador--) {
            int ultimo = bitAux;
            int penultimo = q[numeroDeBits - 1];

            if (ultimo == 1 && penultimo == 0) {
                a = soma(a, m);
            } else if (ultimo == 0 && penultimo == 1) {
                a = subtrai(a, m);
            }
            
            bitAux = q[numeroDeBits - 1];
            deslocaDireitaBooth(q);
            q[0] = a[numeroDeBits - 1];
            deslocaDireitaBooth(a);
            imprime(a);
            imprime(q);
        }

        if (soma(a, q)[0] == 1) {
            return somaUm(soma(a, q));
        }
        return soma(a, q);
    }
}
