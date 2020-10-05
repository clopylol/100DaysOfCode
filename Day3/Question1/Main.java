public class Main
{
	public static void main(String[] args) {
		System.out.println("---Clock Angle---");
		
		System.out.println("Clock Angle: " + calculateAngle(9,00));
		System.out.println("Clock Angle: " + calculateAngle(12,00));
		System.out.println("Clock Angle: " + calculateAngle(9,15));
	}
	
	/*
	    This function is used to calculate the Angle between hour and minute hands.
	*/
	
	public static double calculateAngle(double hour, double min){
	    double angle = 0, absAngle = 0;
	    angle = (0.5  * (60 * hour + min) - 6 * min);
        absAngle = Math.abs(angle);
	    
	    if (angle > 180){
	       absAngle = 360 - absAngle; 
	    } 
	    
	    return absAngle;
	}
}

