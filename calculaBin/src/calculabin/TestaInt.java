package calculabin;

public class TestaInt {
    
    public static void testeSoma() {
        int result;
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
        int rst2 = sbIn1.subtracao(sbIp2).paraInt();
        if (rst2 == -98){
            System.out.println("acerto - subtracao de um inteiro negativo e  um inteiro positivo");
        } else {
            System.out.println(rst2);
        }
        
        // subtracao dos dois maiores inteiros positivos 
        // subtracao dos dois menores inteiros positivos 
        // subtracao dos dois maiores inteiros negativos 
        // subtracao dos dois menores inteiros negativos 
    }
    
    
    public static void testeMultiplicacao() {}
    public static void testaDivisao() {}
}
