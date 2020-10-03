public class Main
{
	public static void main(String[] args) {
	    
		System.out.println("--- Hayyam Triangle ---\n");

        
        //Creates a Hayyam Triangle of 8 lines.
	    hayyamTriangle(8);
	
	    /* 
	    
        These lines are used to test functions.
	    
		//0.Row
		System.out.println((int) calculateBinomal(0,0));
		
		//1.Row
		System.out.println((int) calculateBinomal(1,0) +  (int) calculateBinomal(1,1));
		
		//2.Row
		System.out.println((int) calculateBinomal(2,0) + (int) calculateBinomal(2,1) + (int) calculateBinomal(2,2));
		
		//3.Row
		System.out.println((int) calculateBinomal(3,0) + (int) calculateBinomal(3,1) + (int) calculateBinomal(3,2) + (int) calculateBinomal(3,3));
		
		//4.Row
		System.out.println((int) calculateBinomal(4,0) + (int) calculateBinomal(4,1) +  (int) calculateBinomal(4,2) +  (int) calculateBinomal(4,3) + (int) calculateBinomal(4,4));
		
	   */
	  
	}
	
	/*
        This function using for create Hayyam Triangle.
    */
	
	public static void hayyamTriangle(int lineNumber){
	    for (int i = 0; i <= lineNumber ; i++ ){
	        for (int x = 0 ; x <= i; x++ ){
	            System.out.print(" " + (int) calculateBinomal(i,x));
	        } 
	    System.out.println("");
	    }
	}

	/*
        This function using for calculate factorial.
    */
	
	public static double calculateFactorial(int number){
	    double factorial = 1;
	    
		for (int i = 1; i < number ; i++ ) {
		    factorial += i * factorial;
		}
		
		return factorial;
	}
	
	/*
        This function using for calculate binomial expansions.
    */
    
	public static double calculateBinomal(int lineNumber, int indexNumber){
	   double binomal;
	   
	   binomal = calculateFactorial(lineNumber) / (calculateFactorial(indexNumber) * (calculateFactorial(lineNumber - indexNumber)));
	   
	   return binomal;
	}
	
}

