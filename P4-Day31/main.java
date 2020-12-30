import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("~ Find Mode of an Array ~");
        int[] array = {1, 3, 5, 3, 2, 6, 3, 8, 3, 2, 5, 3};

        int[] result = (findMode(array));

        System.out.print("Array:");
        for (int num : array) {
            System.out.print(" " + num + " ");
        }
        System.out.println("\nMode: " + result[0] + "\nFrequency: " + result[1]);

    }

    public static int[] findMode(int array[]) {
        int counter = 0;
        int mode = 0;
        int tempCounter = 0;

        for (int i = 0; i < array.length; i++) {
            counter = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter += 1;
                }
            }
            if (counter > tempCounter) {
                tempCounter = counter;
                mode = array[i];
            }
        }
        int[] retArray = {mode, tempCounter};
        
        return retArray;
    }
}
