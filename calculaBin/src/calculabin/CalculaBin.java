
package calculabin;

public class CalculaBin {

    public static void testeSoma() {
    // soma de dois inteiros positivos
        IntBinario pos1 = new IntBinario(37);
        IntBinario pos2 = new IntBinario(61);
        int result1 = pos1.soma(pos2).paraInt();
        if (result1 == 98){
            System.out.println("acerto - soma de dois inteiros positivos");
        } else {
            System.out.println(result1);
        }
        // soma de dois inteiros negativos
        IntBinario neg1 = new IntBinario(-37);
        IntBinario neg2 = new IntBinario(-61);
        int result2 = neg1.soma(neg2).paraInt();
        if (result2 == -98){
            System.out.println("acerto - soma de dois inteiros negativos");
        } else {
            System.out.println(result2);
        }
        // soma de um inteiro positivos e um inteiro negativo
        IntBinario int1 = new IntBinario(37);
        IntBinario int2 = new IntBinario(-61);
        int res2 = int1.soma(int2).paraInt();
        if (res2 == -24){
            System.out.println("acerto - soma de um inteiro positivo e um inteiro negativo");
        } else {
            System.out.println(res2);
        }
        // soma de um inteiro negativo e  um inteiro positivo
        IntBinario intN1 = new IntBinario(-37);
        IntBinario intP2 = new IntBinario(61);
        int resu2 = intN1.soma(intP2).paraInt();
        if (resu2 == 24){
            System.out.println("acerto - soma de um inteiro negativo e  um inteiro positivo");
        } else {
            System.out.println(resu2);
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
    }
    
    
    public static void main(String[] args) {
        // testeSoma();
        // testeSubtracao();
        
        IntBinario num1 = new IntBinario(-81);
        IntBinario num2 = new IntBinario(9);
        IntBinario result[] = num1.divisao(num2);
        result[0].imprime();
        result[1].imprime();
        int quociente = result[0].paraInt();
        int resto = result[1].paraInt();
        System.out.println(quociente);
        System.out.println(resto);
    }
}
