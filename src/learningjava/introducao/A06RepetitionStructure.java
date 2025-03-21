package learningjava.introducao;
/*
while, do while, for
 */
public class A06RepetitionStructure {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 10) {
            System.out.println(count++);
        }
        count = 0;
        do {
            System.out.println("run at least once" + ++count);
        } while (count < 10);
        {
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <5; j++) {
                System.out.println("For i" + i);
                System.out.println("For j" + j);
            }

        }
    }
}

