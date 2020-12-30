import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("~ Dizinin Elmanları Eşsiz Mi ? (Unique) ~\n");
        int[] array = {1, 3, 5, 7, 41, 42};

        for (int num : array) {
            System.out.print(" " + num + " ");
        }

        if (isUnique(array)) {
            System.out.println(" => Dizisinin Elmanları Eşsizdir !");
        } else {
            System.out.println(" => Dizisinin Elmanları Eşsiz Değildir...");
        }
    }

    public static boolean isUnique(int array[]) {
        boolean isUnique = true;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter += 1;
                }
                if (counter > 1) {
                    isUnique = false;
                }
            }
        }
        return isUnique;
    }
}
