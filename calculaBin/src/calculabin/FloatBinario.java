package calculabin;

public class FloatBinario {

    final int numeroDeBits = 32;
    final int bitsExpoente = 8;
    final int bitMantissa = 23;

    protected int[] binario = new int[numeroDeBits];

    public FloatBinario(float numero) {
        int intBits = Float.floatToIntBits(numero);
        String strNum = Integer.toBinaryString(intBits);

        for (int x = 1; x <= strNum.length(); x++) {
            this.binario[numeroDeBits - x] = Character.getNumericValue(strNum.charAt(strNum.length() - x));
        }
    }

    public void imprime() {
        for (int i = 0; i < numeroDeBits; i++) {
            System.out.printf("%d", this.binario[i]);
        }
        System.out.println();
    }

    public boolean ehNegativo() {
        return this.binario[0] == 1;
    }
    
    public float paraFloat() {
        String sinal = "";
        
        if(this.ehNegativo()){
            sinal = "-";
        }
        
        String stringBin = new String();
        for(int i=0; i < numeroDeBits; i++) {
            stringBin += this.binario[i];
        }
        
        float myFloat = Float.intBitsToFloat(intBits);
        return myFloat;
    }
}
