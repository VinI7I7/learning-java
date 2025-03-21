package learningjava.introducao;

/*
learning switch with day of week
 */
public class A05EstruturasCondicionaisSwitch {
    public static void main(String[] args) {
        byte day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}
