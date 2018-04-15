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
        
        if(this.ehNegativo() && outro.ehNegativo()){
            resultadoSoma.binario[0] = 1;
            
            for (int i= numeroDeBits-1; i > 0; i--) {
            int bit1 = this.binario[i];
            int bit2 = outro.binario[i];
            int soma = bit1 + bit2 + sobe;
            
            resultadoSoma.binario[i] = soma % 2;
            sobe = soma / 2;
        }
            return resultadoSoma;
        }           
        
        /*else if (!outro.ehNegativo() && this.ehNegativo()){
         
            //resultadoSoma = this.subtracao(outro);
            
            if(this.compara(outro) == 1)
                resultadoSoma.binario[0] = this.binario[0];
            else
                resultadoSoma.binario[0] = outro.binario[0];
            return resultadoSoma;
        }
        */       
        
        for (int i=numeroDeBits-1; i > 0; i--) {
            int bit1 = this.binario[i];
            int bit2 = outro.binario[i];
            int soma = bit1 + bit2 + sobe;
            resultadoSoma.binario[i] = soma % 2;
            sobe = soma / 2;
            
        }
        return resultadoSoma;
     
    }
    
    public IntBinario subtracao(IntBinario outro){
        IntBinario complementoDeDois = new IntBinario();
        // onde tem 0 coloco 1 onde tem 1 coloco 0 
        for(int i=0; i < numeroDeBits; i++) {
            if(outro.binario[i] == 1) {
                complementoDeDois.binario[i] = 0;
            }
            else if (outro.binario[i] == 0) {
                complementoDeDois.binario[i] = 1;
            }
        }
        complementoDeDois = complementoDeDois.soma(new IntBinario(1));
        IntBinario resultadoSub = this.soma(complementoDeDois);
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
        this.imprime();
        for(int i = 0; i < numeroDeBits; i++){
            deslocado.binario[i] = this.binario[i+1]; 
        }
        deslocado.imprime();
        return deslocado;
    }
    
    public IntBinario multiplicacao(IntBinario multiplicador){
    //utilizando algoritmo de Booth:
    IntBinario resultadoMult = multiplicador;
    
    IntBinario y = multiplicador;
    IntBinario x = this;
    
    // 0 x qualquer coisa == 0
    if(multiplicador.ehZero()) return multiplicador;
    if(this.ehZero()) return this;
       
    int ultimo = this.binario[31];
    int penultimo = this.binario[30];
    
    for(int i = 0; i < this.numeroDeBits; i++){
    
        if(penultimo == 0 && ultimo == 1){
            // P termina em [0 1] -> P = P + A
            resultadoMult = resultadoMult.soma(this);
        }
        else if(penultimo == 1 && ultimo == 0){
            // P termina en [1 0] -> P = P + S = P - A
            resultadoMult = resultadoMult.subtracao(this);
        }
    }        
    resultadoMult.deslocaDireita();
    
    return resultadoMult;
    } 
}
