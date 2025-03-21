package learningjava.introducao;
/*
print the first 25 numbers of a given value. for example 50
 */
public class A06RepetitionStructureExercise02 {
    public static void main(String[] args) {

        int MaxValue = 50;
        for (int i =0; i <= MaxValue; i++){
            System.out.println(i);
            if (i == 25){
                break;
            }
        }
    }
}
