public class Main
{
	public static void main(String[] args) {	    
		System.out.println("Number of Digits: " + countDigit(1071));
	}
	
	/*
        This function using for number of digits
    */
	public static int countDigit(int num){
	    int digitNumber = 1;
        while(num >= 10){
            num = num / 10;
            digitNumber++;
        }
        digitNumber++;
        return digitNumber;       
    }

}



