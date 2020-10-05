public class Main
{
	public static void main(String[] args) {
	    System.out.println("Sum Factoring: " + sumOfFactoring(32));
	}
	
	/* 
	    This function using for Sum of the Factors
	*/
	
	public static int sumOfFactoring(int num){
        int sum = 0;
	    for (int i = 1 ; i < num ; i++ ){
	        if (num % i == 0){
	            sum +=i;    
	        } 
	    } 
	    return sum;
	}
}

