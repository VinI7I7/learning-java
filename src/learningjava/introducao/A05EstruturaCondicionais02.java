package learningjava.introducao;

public class A05EstruturaCondicionais02 {
    public static void main(String[] args) {
        // age <15 print categoria infantil
        // age >= 15 && idade <18 categoria juvenil
        // age > 18 categoria adulto
        int age = 17;
        if(age < 15 ) {
            System.out.println("Categoria infantil");
        }else if(age >=15 && age <18) {
            System.out.println("Categoria juvenil");
        }else {
            System.out.println("Categoria adulto");

            }
        }
    }

