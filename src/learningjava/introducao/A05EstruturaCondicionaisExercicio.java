package learningjava.introducao;
/*
    I want to know how much I have to pay in the
    netherlands 2020 based on my annual salary
 */
public class A05EstruturaCondicionaisExercicio {
    public static void main(String[] args) {
        double salary = 68508;

        if(salary >= 0 && salary <= 34712) {
            System.out.println("You have to pay € "+salary*0.0970+"\nTax is 9,70%");
        } else if (salary > 34712 && salary <= 68507 ) {
            System.out.println("You have to pay € "+salary*0.3735+"\nTax is 37,35%" );
        } else
            System.out.println("You have to pay € "+salary*0.4950+" \nTax is 49,50%");
    }
}
