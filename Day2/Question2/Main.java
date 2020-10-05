import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("--- Temperature Conversion ---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Pls Enter the Temperature: ");
        double temperature = sc.nextInt();

        System.out.println("Select Your Choice \n > Celsius to Fahrenheit = 0 \n > Fahrenheit to Celsius = 1 ");
        double choice = sc.nextInt();


        if (choice == 0) {
            System.out.println("Transaction Successful ! \nTemperature is: " + celciusToFahrenheit(temperature) + " Fahrenheit");

        } else if (choice == 1) {
            System.out.println("Transaction Successful ! \nTemperature is: " + fahrenheitToCelcius(temperature) + " Celsius");

        } else {
            System.out.println("Error: Pls Select 0 or 1 !");
        }

    }


    /*
	    This function using for Celsius to Fahrenheit
        Formula = Celsius * 1.8 + 32 
    */

    public static double celciusToFahrenheit(double temperature) {
        double celToFah;
        celToFah = ((temperature * 1.8) + 32);
        return celToFah;
    }


    /* 
        This function using for Fahrenheit to Celsius
        Formula = (Fahrenheit - 32) / 1.8 
    */
    
    public static double fahrenheitToCelcius(double temperature) {
        double fahToTem;
        fahToTem = ((temperature - 32) / 1.8);
        return fahToTem;
    }


}