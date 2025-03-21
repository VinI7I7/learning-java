package learningjava.introducao;
/*
dado o valor de um carro , descubra em quantas vezes ele pode ser parcelado
condicao valorparcela>=1000;
 */

public class A06RepetitionStructureExercise03 {
    public static void main(String[] args) {
        float valueCar = 10000;
        float MinInstallment = 1000;


        for (int i = (int) (valueCar / MinInstallment); i >= 1; i--) {
            float installmentValue = valueCar / i;
            if (installmentValue >= MinInstallment) {
                System.out.println("Pode ser dividido em até " + i + " vezes de R$ " + installmentValue);
                break;
            }
        }
    }
}
