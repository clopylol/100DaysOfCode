public class Main
{
    public static void main(String[] args) {
        areHarshed(111, 112);
        areHarshed(171, 200);
        areHarshed(2620, 2924);
        areHarshed(10634085, 14084763);
        areHarshed(23389695, 25132545);
        
        areHarshed(170508026, 170508017);
    }

    static void areHarshed(int num1, int num2) {
        double sumNum1 = sumOfDigits(num1);
        double sumNum2 = sumOfDigits(num2);

        if ((num1 % sumNum1 == 0) && (num2 % sumNum2 == 0)) {
            System.out.println(num1 + " and " + num2 + " are HARSHED Numbers !");
        } else {
            System.out.println(num1 + " and " + num2 + " aren’t Harshed Numbers !");
        }
    }

    static int sumOfDigits(int num) {
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
