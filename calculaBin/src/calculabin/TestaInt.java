package calculabin;

public class TestaInt {
    
    public static int result;
            
    public static void testeSoma() {
        // soma de dois inteiros positivos
        IntBinario pos1 = new IntBinario(37);
        IntBinario pos2 = new IntBinario(61);
        
        result = pos1.soma(pos2).paraInt();
        if (result == 98){
            System.out.println("acerto - soma de dois inteiros positivos");
        } else {
            System.out.println("erro - soma de dois inteiros positivos" + result);
        }
        // soma de dois inteiros negativos
        IntBinario neg1 = new IntBinario(-37);
        IntBinario neg2 = new IntBinario(-61);
        result = neg1.soma(neg2).paraInt();
        if (result == -98){
            System.out.println("acerto - soma de dois inteiros negativos");
        } else {
            System.out.println("erro - soma de dois inteiros negativos" + result);
        }
        // soma de um inteiro positivos e um inteiro negativo
        IntBinario int1 = new IntBinario(37);
        IntBinario int2 = new IntBinario(-61);
        result = int1.soma(int2).paraInt();
        if (result == -24){
            System.out.println("acerto - soma de um inteiro positivo e um inteiro negativo");
        } else {
            System.out.println("erro - soma de um inteiro positivo e um inteiro negativo" + result);
        }
        // soma de um inteiro negativo e  um inteiro positivo
        IntBinario intN1 = new IntBinario(-37);
        IntBinario intP2 = new IntBinario(61);
        result = intN1.soma(intP2).paraInt();
        if (result == 24){
            System.out.println("acerto - soma de um inteiro negativo e  um inteiro positivo");
        } else {
            System.out.println("erro - soma de um inteiro negativo e  um inteiro positivo" + result);
        }
        // OVERFLOW soma dos dois maiores inteiros positivos 2.147.483.648 
        IntBinario intm1 = new IntBinario(2144748364);
        IntBinario intm2 = new IntBinario(2144748364);
        result = intm1.soma(intm2).paraInt();
        if (result == -1){
            System.out.println("acerto - soma dos dois maiores inteiros positivos");
        } else {
            System.out.println("erro - dois maiores int positivo:" + result);
        }
        // soma dos dois menores inteiros positivos 0
        IntBinario intmen1 = new IntBinario(0);
        IntBinario intmen2 = new IntBinario(0);
        result = intmen1.soma(intmen2).paraInt();
        if (result == 0){
            System.out.println("acerto - soma dos dois menores inteiros positivos");
        } else {
            System.out.println("erro - soma dos dois menores inteiros positivos" + result);
        }
        
        // soma dos dois maiores inteiros negativos 
        IntBinario intmaiN1 = new IntBinario(-1);
        IntBinario intmaiN2 = new IntBinario(-1);
        result = intmaiN1.soma(intmaiN2).paraInt();
        if (result == -2){
            System.out.println("acerto - soma dos dois maiores inteiros negativos");
        } else {
            System.out.println("erro - soma dos dois maiores inteiros negativos: " + result);
        }
        
        // OVERFLOW soma dos dois menores inteiros negativos
        IntBinario intmenN1 = new IntBinario(-2147483648);
        IntBinario intmenN2 = new IntBinario(-2147483648);
        result = intmenN1.soma(intmenN2).paraInt();
        if (result == -1){
            System.out.println("acerto - soma dos dois menores inteiros negativos");
        } else {
            System.out.println("erro - soma dos dois menores inteiros negativos: " + result);
        }
        
        // soma o maior inteiro positivo com o menor inteiro negativo
        IntBinario intmaio = new IntBinario(2047483648);
        IntBinario intmeno = new IntBinario(-2047483648);
        result = intmaio.soma(intmeno).paraInt();
        if (result == 0){
            System.out.println("acerto - soma o maior inteiro positivo com o menor inteiro negativo");
        } else {
            System.out.println("erro - soma o maior inteiro positivo com o menor inteiro negativo: " + result);
        }
    } 
    
    public static void testeSubtracao() {
        // subtracao de dois inteiros positivos que resulta positivo
        IntBinario sub1 = new IntBinario(61);
        IntBinario sub2 = new IntBinario(37);
        int r1 = sub1.subtracao(sub2).paraInt();
        if (r1 == 24){
            System.out.println("acerto - subtracao de dois inteiros positivos que resulta positivo");
        } else {
            System.out.println(r1);
        }
        // subtracao de dois inteiros positivos que resulta negativo
        IntBinario sb1 = new IntBinario(37);
        IntBinario sb2 = new IntBinario(61);
        int r2 = sb1.subtracao(sb2).paraInt();
        if (r2 == -24){
            System.out.println("acerto - subtracao de dois inteiros positivos que resulta negativo");
        } else {
            System.out.println(r2);
        }
        // subtracao de dois inteiros negativos
        IntBinario sbI1 = new IntBinario(-37);
        IntBinario sbI2 = new IntBinario(-61);
        int rs2 = sbI1.subtracao(sbI2).paraInt();
        if (rs2 == 24){
            System.out.println("acerto - subtracao de dois inteiros negativos");
        } else {
            System.out.println(rs2);
        }
        // subtracao de um inteiro positivos e um inteiro negativo
        IntBinario sbIp1 = new IntBinario(37);
        IntBinario sbIn2 = new IntBinario(-61);
        int rsl2 = sbIp1.subtracao(sbIn2).paraInt();
        if (rsl2 == 98){
            System.out.println("acerto - subtracao de um inteiro positivos e um inteiro negativo");
        } else {
            System.out.println(rsl2);
        }
        // subtracao de um inteiro negativo e  um inteiro positivos
        IntBinario sbIn1 = new IntBinario(-37);
        IntBinario sbIp2 = new IntBinario(61);
        result = sbIn1.subtracao(sbIp2).paraInt();
        if (result == -98){
            System.out.println("acerto - subtracao de um inteiro negativo e  um inteiro positivo");
        } else {
            System.out.println(result);
        }
        
        // subtracao dos dois maiores inteiros positivos
        IntBinario sbMai1 = new IntBinario(2144748364);
        IntBinario sbMai2 = new IntBinario(2144748364);
        result = sbMai1.subtracao(sbMai2).paraInt();
        if (result == 0){
            System.out.println("acerto - subtracao dos dois maiores inteiros positivos");
        } else {
            System.out.println(result);
        }
        // subtracao dos dois menores inteiros positivos 
        IntBinario sbImen1 = new IntBinario(0);
        IntBinario sbImen2 = new IntBinario(0);
        result = sbImen1.subtracao(sbImen2).paraInt();
        if (result == 0){
            System.out.println("acerto - subtracao dos dois menores inteiros positivos");
        } else {
            System.out.println(result);
        }
        // subtracao dos dois maiores inteiros negativos 
        IntBinario sbInM1 = new IntBinario(-1);
        IntBinario sbIpM2 = new IntBinario(-1);
        result = sbInM1.subtracao(sbIpM2).paraInt();
        if (result == 0){
            System.out.println("acerto - subtracao dos dois maiores inteiros negativos");
        } else {
            System.out.println(result);
        }
        // subtracao dos dois menores inteiros negativos 
        IntBinario sbInMen1 = new IntBinario(-2144748364);
        IntBinario sbinMen2 = new IntBinario(-2144748364);
        result = sbInMen1.subtracao(sbinMen2).paraInt();
        if (result == 0){
            System.out.println("acerto - subtracao dos dois menores inteiros negativos");
        } else {
            System.out.println(result);
        }
    }
    
    public static void testaDivisao() {
        int quociente;
        int resto;
        // dois inteiros positivos iguais
        IntBinario um1 = new IntBinario(100);
        IntBinario um2 = new IntBinario(100);
        quociente = um1.divisao(um2)[0].paraInt();
        resto = um1.divisao(um2)[1].paraInt();
        if (quociente == 1 && resto == 0){
            System.out.println("acerto - divisao dois inteiros positivos iguais");
        } else {
            System.out.println("1. quociente: "+ quociente + " resto: " + resto);
        }
        // Inteiro positivo dividido por inteiro positivo divisor de entrada 1
        IntBinario dois1 = new IntBinario(100);
        IntBinario dois2 = new IntBinario(10);
        quociente = dois1.divisao(dois2)[0].paraInt();
        resto = dois1.divisao(dois2)[1].paraInt();
        if (quociente == 10 && resto == 0){
            System.out.println("acerto - divisao de inteiro positivo dividido por inteiro positivo divisor");
        } else {
            System.out.println("1. quociente: "+ quociente + " resto: " + resto);
        }
        
        // Inteiro positivo dividido por inteiro positivo divisor de entrada 1
        IntBinario tres1 = new IntBinario(100);
        IntBinario tres2 = new IntBinario(3);
        quociente = tres1.divisao(tres2)[0].paraInt();
        resto = tres1.divisao(tres2)[1].paraInt();
        if (quociente == 33 && resto == 1){
            System.out.println("acerto - divisao de inteiro positivo dividido por inteiro positivo nao divisor");
        } else {
            System.out.println("1. quociente: "+ quociente + " resto: " + resto);
        }
        
        // Inteiro positivo dividido por inteiro positivo por zero
        IntBinario quatro1 = new IntBinario(100);
        IntBinario quatro2 = new IntBinario(0);
        try {
            quociente = quatro1.divisao(quatro2)[0].paraInt();
        } catch (IllegalArgumentException e) {
           System.out.println("acerto - divisao de inteiro positivo dividido por zero"); 
        }
        
        // Inteiro positivo dividido por inteiro negativo
        IntBinario seis1 = new IntBinario(100);
        IntBinario seis2 = new IntBinario(-3);
        quociente = seis1.divisao(seis2)[0].paraInt();
        resto = seis1.divisao(seis2)[1].paraInt();
        if (quociente == -33 && resto == 1){
            System.out.println("acerto - divisao de Inteiro positivo dividido por inteiro negativo");
        } else {
            System.out.println("quociente: "+ quociente + " resto: " + resto);
        }
        
        // dois inteiros negativos iguais
        IntBinario sete1 = new IntBinario(-100);
        IntBinario sete2 = new IntBinario(-100);
        quociente = sete1.divisao(sete2)[0].paraInt();
        resto = sete1.divisao(sete2)[1].paraInt();
        if (quociente == 1 && resto == 0){
            System.out.println("acerto - divisao dois inteiros negativos iguais");
        } else {
            System.out.println("quociente: "+ quociente + " resto: " + resto);
        }
        
        // inteiro negativo e inteiro negativo divisor de entrada 1
        IntBinario oito1 = new IntBinario(-100);
        IntBinario oito2 = new IntBinario(-10);
        quociente = oito1.divisao(oito2)[0].paraInt();
        resto = oito1.divisao(oito2)[1].paraInt();
        if (quociente == 10 && resto == 0){
            System.out.println("acerto - divisao de inteiro negativo e inteiro negativo divisor de entrada 1");
        } else {
            System.out.println("quociente: "+ quociente + " resto: " + resto);
        }
        
        // inteiro negativo e inteiro negativo nao divisor de entrada 1
        IntBinario nove1 = new IntBinario(-100);
        IntBinario nove2 = new IntBinario(-3);
        quociente = nove1.divisao(nove2)[0].paraInt();
        resto = nove1.divisao(nove2)[1].paraInt();
        if (quociente == 33 && resto == 1){
            System.out.println("acerto - divisao de inteiro negativo e inteiro negativo nao divisor de entrada 1");
        } else {
            System.out.println("quociente: "+ quociente + " resto: " + resto);
        }
        
        // Inteiro negativo dividido por inteiro positivo por zero
        IntBinario dez1 = new IntBinario(100);
        IntBinario dez2 = new IntBinario(0);
        try {
            quociente = dez1.divisao(dez2)[0].paraInt();
        } catch (IllegalArgumentException e) {
           System.out.println("acerto - divisao de inteiro negativo dividido por zero"); 
        }
        
        // inteiros positivos muito grandes iguais
        IntBinario onze1 = new IntBinario(2144748364);
        IntBinario onze2 = new IntBinario(2144748364);
        quociente = onze1.divisao(onze2)[0].paraInt();
        resto = onze1.divisao(onze2)[1].paraInt();
        if (quociente == 1 && resto == 0){
            System.out.println("acerto - inteiros positivos muito grandes iguais");
        } else {
            System.out.println("quociente: "+ quociente + " resto: " + resto);
        }
        
        // menores inteiros positivos
        IntBinario doze1 = new IntBinario(0);
        IntBinario doze2 = new IntBinario(0);
        try {
            quociente = doze1.divisao(doze2)[0].paraInt();
        } catch (IllegalArgumentException e) {
           System.out.println("acerto - menores inteiros positivos (0 e 0)"); 
        }
        
        // maiores inteiros negativos
        IntBinario treze1 = new IntBinario(-1);
        IntBinario treze2 = new IntBinario(-1);
        quociente = treze1.divisao(treze2)[0].paraInt();
        resto = treze1.divisao(treze2)[1].paraInt();
        if (quociente == 1 && resto == 0){
            System.out.println("acerto - maiores inteiros negativos");
        } else {
            System.out.println("quociente: "+ quociente + " resto: " + resto);
        }
        
        // maiores inteiros negativos
        IntBinario quatorze1 = new IntBinario(2144748364);
        IntBinario quatorze2 = new IntBinario(-2144748364);
        quociente = quatorze1.divisao(quatorze2)[0].paraInt();
        resto = quatorze1.divisao(quatorze2)[1].paraInt();
        if (quociente == -1 && resto == 0){
            System.out.println("acerto - maiores inteiros negativos");
        } else {
            System.out.println("quociente: "+ quociente + " resto: " + resto);
        }
        
        // menor positivo com maior negativo
        IntBinario quinze1 = new IntBinario(0);
        IntBinario quinze2 = new IntBinario(-1);
        quociente = quinze1.divisao(quinze2)[0].paraInt();
        resto = quinze1.divisao(quinze2)[1].paraInt();
        if (quociente == 0 && resto == 0){
            System.out.println("acerto - menor positivo com maior negativo");
        } else {
            System.out.println("quociente: "+ quociente + " resto: " + resto);
        }
        
        // inteiro negativo mt pequeno inteiro positivo muito grande
        IntBinario dezesseis1 = new IntBinario(-2144748364);
        IntBinario dezesseis2 = new IntBinario(2144748364);
        quociente = dezesseis1.divisao(dezesseis2)[0].paraInt();
        resto = dezesseis1.divisao(dezesseis2)[1].paraInt();
        if (quociente == -1 && resto == 0){
            System.out.println("acerto - inteiro negativo mt pequeno inteiro positivo muito grande");
        } else {
            System.out.println("quociente: "+ quociente + " resto: " + resto);
        }
    }
    
    public static void testeMultiplicacao() { 
        // multiplicacao de dois inteiros positivos
        IntBinario um1 = new IntBinario(100);
        IntBinario um2 = new IntBinario(100);
        result = um1.multiplicacao(um2).paraInt();
        if (result == 10000){
            System.out.println("acerto - multiplicacao de dois inteiros positivos");
        } else {
            System.out.println(result);
        }
        
        // multiplicacao inteiro positivo e de inteiro negativo
        IntBinario dois1 = new IntBinario(100);
        IntBinario dois2 = new IntBinario(-100);
        result = dois1.multiplicacao(dois2).paraInt();
        if (result == -10000){
            System.out.println("acerto - multiplicacao inteiro positivo e de inteiro negativo");
        } else {
            System.out.println(result);
        }
        
        // multiplicacao de inteiro positivo e zero
        IntBinario tres1 = new IntBinario(100);
        IntBinario tres2 = new IntBinario(0);
        result = tres1.multiplicacao(tres2).paraInt();
        if (result == 0){
            System.out.println("acerto - multiplicacao de inteiro positivo e zero");
        } else {
            System.out.println(result);
        }
        
        // multiplicacao inteiro positivo e inteiro negativo
        IntBinario quatro1 = new IntBinario(100);
        IntBinario quatro2 = new IntBinario(-100);
        result = quatro1.multiplicacao(quatro2).paraInt();
        if (result == -10000){
            System.out.println("acerto - multiplicacao inteiro positivo e inteiro negativo");
        } else {
            System.out.println(result);
        }
        
        // multiplicacao de inteiro negativo por zero
        IntBinario cinco1 = new IntBinario(-100);
        IntBinario cinco2 = new IntBinario(0);
        result = cinco1.multiplicacao(cinco2).paraInt();
        if (result == 0){
            System.out.println("acerto - multiplicacao de inteiro negativo por zero");
        } else {
            System.out.println(result);
        }
        
        // multiplicacao de inteiro negativo por inteiro negativo
        IntBinario seis1 = new IntBinario(-100);
        IntBinario seis2 = new IntBinario(-100);
        result = seis1.multiplicacao(seis2).paraInt();
        if (result == 10000){
            System.out.println("acerto - multiplicacao de inteiro negativo por inteiro negativo");
        } else {
            System.out.println(result);
        }
        
        // dois inteiro positivo muito grande
        IntBinario sete1 = new IntBinario(2144748364);
        IntBinario sete2 = new IntBinario(2144748364);
        try {
            result = sete1.multiplicacao(sete2).paraInt();
        } catch (IllegalArgumentException e) {
           System.out.println("acerto - multiplicacao de dois inteiro positivo muito grande"); 
        }
        
        // dois menores inteiros positivos 
        IntBinario oito1 = new IntBinario(0);
        IntBinario oito2 = new IntBinario(0);
        result = oito1.multiplicacao(oito2).paraInt();
        if (result == 0){
            System.out.println("acerto - multiplicacao de dois menores inteiros positivos");
        } else {
            System.out.println(result);
        }
        
        // dois maiores inteiros negativos
        IntBinario nove1 = new IntBinario(-1);
        IntBinario nove2 = new IntBinario(-1);
        result = nove1.multiplicacao(nove2).paraInt();
        if (result == 1){
            System.out.println("acerto - multiplicacao de dois maiores inteiros negativos");
        } else {
            System.out.println(result);
        }
        
        // dois maiores inteiros negativos
        IntBinario dez1 = new IntBinario(-2144748364);
        IntBinario dez2 = new IntBinario(-2144748364);
        result = dez1.multiplicacao(dez2).paraInt();
        try {
            result = dez1.multiplicacao(dez2).paraInt();
        } catch (IllegalArgumentException e) {
           System.out.println("acerto - multiplicacao de dois maiores inteiros negativos"); 
        }
    }
}
