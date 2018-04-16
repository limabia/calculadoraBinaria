package calculabin;

public class IntBinario {
   
    public IntBinario(Integer numero) {
        String strNum = Integer.toBinaryString(numero);
        for (int x=1; x <= strNum.length(); x++) {
            this.binario[numeroDeBits-x] = Character.getNumericValue(strNum.charAt(strNum.length()-x)); 
        }
    }
    
    final int numeroDeBits = 32; 
    protected int[] binario = new int[numeroDeBits];    // sempre o primeiro bit vai ser o de sinal
    public int contaZeros = 0;   
    
    // construtor padrao
    public IntBinario(){
    }
    
    public boolean ehNegativo() {
        return this.binario[1] == 1;
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
    
    public int paraInt(){
        IntBinario bin = this;
        String sinal = "";
        
        if(this.ehNegativo()){
            bin = this.complementoDeDois();
            sinal = "-";
        }
        
        String stringBin = new String();
        for(int i=0; i < numeroDeBits; i++) {
            stringBin += bin.binario[i];
        }
        return Integer.parseInt(sinal + stringBin, 2);
    }
    
    public int compara(IntBinario outro) {
        for(int i=0; i < numeroDeBits; i++){
            if (outro.binario[i] != this.binario[i]){
                return this.binario[i] - outro.binario[i];
            }
        }
        // retorna 0 para divisor == dividendo,  1 para this maior que outro, -1 para divisor maior que dividendo
        return 0;
    }
    
    public IntBinario soma(IntBinario outro){
        IntBinario resultadoSoma = new IntBinario();
        int sobe = 0;
         
        for (int i=numeroDeBits-1; i >= 0; i--) {
            int bit1 = this.binario[i];
            int bit2 = outro.binario[i];
            int soma = bit1 + bit2 + sobe;
            resultadoSoma.binario[i] = soma % 2;
            sobe = soma / 2;
            
        }
        return resultadoSoma;
    }
    
    public IntBinario complementoDeDois(){
        IntBinario complementoDeDois = new IntBinario();
        // onde tem 0 coloco 1 onde tem 1 coloco 0 
        for(int i=0; i < numeroDeBits; i++) {
            if(this.binario[i] == 1) {
                complementoDeDois.binario[i] = 0;
            }
            else if (this.binario[i] == 0) {
                complementoDeDois.binario[i] = 1;
            }
        }
        complementoDeDois = complementoDeDois.soma(new IntBinario(1));
        return complementoDeDois;
    }
    
    public IntBinario subtracao(IntBinario outro){
        IntBinario resultadoSub = this.soma(outro.complementoDeDois());
        return resultadoSub;
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
        
        //divindo numeros positivos:
        if(!dividendo.ehNegativo() && !divisor.ehNegativo()){    
            while(!(dividendo.subtracao(divisor)) .ehNegativo()){
                quociente = quociente.soma(new IntBinario(1));
                dividendo = dividendo.subtracao(divisor);   
                
                resto = resto.subtracao(divisor);
      
            }
        }   else{
            
            while((dividendo.soma(divisor)) .ehNegativo() || dividendo.soma(divisor) .ehZero()){
                quociente = quociente.soma(new IntBinario(1));
                dividendo = dividendo.soma(divisor);   
                dividendo.imprime();
                resto = resto.soma(divisor);
            }
        } 
        System.out.print("Resto da divisão: ");
            resto.imprime();
            return quociente;   //Blz para divisão exata
    }
}
    public IntBinario deslocaDireita(){
        IntBinario deslocado = new IntBinario();
        //this.imprime();
        for(int i = 32; i > numeroDeBits+1; i--){
            deslocado.binario[i] = this.binario[i-1]; 
        }
            //deslocado.binario[32] = 0;
        deslocado.imprime();
        return deslocado;
    }
    
    public IntBinario deslocaDireita(){
        IntBinario deslocado = new IntBinario();
        System.out.print("a ser deslocado: ");
        this.imprime();
        for(int i = 32; i > numeroDeBits+1; i--){
            for(int j = 31; j > numeroDeBits; j--)
            deslocado.binario[i] = this.binario[i-1]; 
        }
            //deslocado.binario[32] = 0;
        System.out.print("numero deslocado: ");
        deslocado.imprime();
        return deslocado;
    }
    
    public IntBinario multiplicacao(IntBinario multiplicador){
    //utilizando algoritmo de Booth:
        IntBinario resultadoMult = multiplicador;
        IntBinario A = this;
        IntBinario S = this.complementoDeDois();
        contaZeros = 0;
        System.out.println("debug1");    
        int ultimo = this.binario[31];
        int penultimo = this.binario[30];

        System.out.println("ultimo: " + ultimo + "  penultimo: " + penultimo);  
        System.out.print("prim resultadoMult: ");
        resultadoMult.imprime();

        for(int i = 0; i < multiplicador.numeroDeBits-1; i++){
            if(multiplicador.binario[i] == 0) contaZeros++;
            else break;
            System.out.println(contaZeros); //debug
        }

        for(int i = contaZeros; i < multiplicador.numeroDeBits; i++){

            if(penultimo == 0 && ultimo == 1){
                // P termina em [0 1] -> P = P + A
                resultadoMult = resultadoMult.soma(this);
                System.out.println("debug2");
            }
            else if(penultimo == 1 && ultimo == 0){
                // P termina en [1 0] -> P = P + S = P - A
                resultadoMult = resultadoMult.subtracao(this);
                System.out.println("debug3");
            }
                System.out.print("seg resultadoMult: ");
                resultadoMult.imprime();
            resultadoMult.deslocaDireita();
        
               
    }        
        
    return resultadoMult;
    } 
}
