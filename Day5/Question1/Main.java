import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {   
	    boolean state;
	    int number;    
		System.out.println("---is a Prime---");

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter number: ");
		number = sc.nextInt();	
	    state = isPrime(number);

	    if(state){
	    	System.out.print(number + " is a Prime !");
	    }
	    else{
            System.out.print(number + " is a NOT Prime !");
	    }
	}
	
	/* 
        This function using for is Prime check.
	*/
	
	static boolean isPrime(int number){
	    int counter = 0;
	    String x;
	    for (int i = 2; i < number; i++) {
            if(number % i == 0){
                counter++;
            }
        }
        // is Prime !
        if(counter == 0){
            return true;
        }
        // is Not Prime !
        else{
            return false;    
        }
	}
}

