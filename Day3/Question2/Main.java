public class Main
{
	public static void main(String[] args) {
		/*
		    Friendly numbers are two different numbers so related that the sum of the proper divisors of each is equal to the other number.
            Examples: (220, 284), (1184, 1210), (2620, 2924)
		*/
	
		System.out.println("---Friendly (Amicable) Numbers Check---");
		
		int num1 = 220;
		int num2 = 284;
		
		int sum1 = factoringNumber(num1);
		int sum2 = factoringNumber(num2);
		
		areFriends(num1, num2, sum1, sum2);
	}
	
	/* 
	    This function using for Sum of the Factors
	*/
	
	public static int factoringNumber(int num){
	    int sum = 0;
	    
	    for (int i = 1; i < num ; i++){
	        if (num % i == 0){
	            sum += i;
	        } 
	    } 
	    return sum;
	}
	
	/*
	    This function using for check friends number.
	*/
	
	public static void areFriends(int num1, int num2, int sum1, int sum2){
	
	    if((sum1 == num2) || (sum2 == num1)){
	        System.out.println(num1 + " and " + num2 +" are FRIENDS !");
	    }
	    else{
	        System.out.println(num1 + " and " + num2 +" NOT Friends !");
	    }
	    
	}
}
