package learningjava.introducao;
/*
operador ternario ? :

 */
public class A05EstruturaCondicionais03 {
    public static void main(String[] args) {
        double salary = 1500;
        String mensagemDoar = "Eu vou doar 100 reais";
        String mensagemNaoDoar = "Eu não vou doar 100 reais";

        String resultado = salary>= 1000 ?mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
