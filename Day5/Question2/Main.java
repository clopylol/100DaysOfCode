public class Main {
    public static void main(String[] args) {
        System.out.println("Sum of Digits");

        int number = 12345;

        // sum of Digits w/ for loop
        System.out.println(number + " - Sum of Digits = " + sumOfDigits(number));

        // sum of Digits w/ while loop
        System.out.println(number + " - Sum of Digits = " + sumOfDigits2(number));
    }

    /*
        This function using for Sum of Digits with for loop.
    */

    static int sumOfDigits(int num) {
        int total = 0;
        int counter = 0;

        for (int i = 1; i <= num; i++) {
            total += num % 10;
            num /= 10;
            counter++;
        }
        total++;
        return total;

    }

    /*
        This function using for Sum of Digits with while loop.
    */

    static int sumOfDigits2(int num) {
        int counter = 0;
        int total = 0;

        while (num != 0) {
            total += num % 10;
            num /= 10;
            counter++;
        }
        return total;
    }
}