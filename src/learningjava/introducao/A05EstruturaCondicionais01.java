package learningjava.introducao;

public class A05EstruturaCondicionais01 {
    public static void main(String[] args) {
        int idade = 19;
        boolean isAutorizadoComprarBebida = idade >=18;
        if(isAutorizadoComprarBebida) {
            System.out.println("Maior de idade");
        } else{
            System.out.println("Menor de idade");
        }

        }
    }
