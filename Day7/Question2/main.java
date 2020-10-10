public class Main
{
    public static void main(String[] args) {

        int[] array = {10, 71, 14, 53, 19, 23, 41, 42, 1, 8, 5, 9, 12};
        //Array Seperented of Even or Odd Numbers
        arraySeperented(array);
    }

    /*
        This function using for find even and odd number
     */
    static void arraySeperented(int[] array) {
        int[] arraySize = arrayLenCounter(array);
        //ArraySize[0] = Even Number Size
        //ArraySize[1] = Add Number Size
        int[] evenNumber = new int[arraySize[0]];
        int[] oddNumber = new int[arraySize[1]];

        int j = 0, x = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                if (j <= i) {
                    evenNumber[j] = array[i];
                    j++;
                }
            } else if (array[i] % 2 != 0) {
                if (x <= i) {
                    oddNumber[x] = array[i];
                    x++;
                }
            }
        }

        //Print Even and Odd Number
        System.out.println("Even Numbers");
        printEvenOrOdd(evenNumber);

        System.out.println("\nOdd Numbers");
        printEvenOrOdd(oddNumber);

        //Print Sorted Even and Sorted Odd Number
        System.out.println("\nSorted Even Numbers");
        sortBySelectionSort(evenNumber);

        System.out.println("\nSorted Odd Numbers");
        sortBySelectionSort(oddNumber);

    }

    /*
        This function Selection Sort Algorithm
     */
    static void sortBySelectionSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }

        //Print sorted array
        printEvenOrOdd(array);
    }

    /*
        This function using for print even or odd number.
     */
    static void printEvenOrOdd(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ".index: " + array[i]);
        }
    }

    /*
        This function using for calculate dynamic array size
     */
    static int[] arrayLenCounter(int array[]) {
        int j = 0, x = 0;
        //Array Size[0] = Even, Array Size[1] = Odd
        int[] arraySize = new int[2];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                if (j <= i) {
                    j++;
                }
            } else if (array[i] % 2 != 0) {
                if (x <= i) {
                    x++;
                }
            }
        }

        //Array Size[0] = Even, Array Size[1] = Odd
        arraySize[0] = j;
        arraySize[1] = x;

        return arraySize;
    }
}
