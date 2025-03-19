package learningjava.introducao;
/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>.
 */
public class A03TiposPrimitivosExercício {
    public static void main(String[] args) {
        String name = "Rebecca";
        String address = "Street 21";
        double salary = 1500.00;
        String salaryReceiptDate = "19/03/2025";
        String report = "I "+name+ " residing at address "+address+" confirmo que recebi o salário de " +salary+" na data de "+salaryReceiptDate;
        System.out.print(report);




    }
}
