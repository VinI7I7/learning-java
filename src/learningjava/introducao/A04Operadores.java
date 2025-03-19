package learningjava.introducao;

public class A04Operadores {
    public static void main(String[] args) {
        // + - / *
        double number01 = 10;
        double number02 = 20;
        double result = number01 / number02;
        System.out.println(result);

        // % operador de resto da divisao
        int resto = 20 % 7;
        System.out.println(resto);

        // < > <= >= == != retorna valores booleanos
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte "+isDezIgualQueVinte);
        System.out.println("isDezDiferenteQueVinte "+isDezDiferenteQueVinte);

        // && (AND) || (OR) !
        //Dutch
        int age = 35;
        float salary = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = age > 30 && salary >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = age < 30 && salary >= 3381;
        System.out.println(isDentroDaLeiMenorQueTrinta);
        System.out.println(isDentroDaLeiMaiorQueTrinta);
    }
}
