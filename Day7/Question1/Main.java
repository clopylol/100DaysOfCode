public class Main
{
    public static void main(String[] args) {

        int[] array = {10, 71, 14, 53, 19, 23};

        int maxNumber = arrayMaxNum(array);       
        int maxSecondNumber = arrayMaxSecondNum(array, maxNumber);
        
        System.out.println("Max Number: " + maxNumber);
        System.out.println("Second Max Number: " + maxSecondNumber);

    }

    /*
        This function using for find FIRST max number an array
    */
    
    static int arrayMaxNum(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > counter) {
                counter = array[i];
            }
        }
        return counter;
    }
    
    /*
         This function using for find SECOND max number an array
    */
    
    static int arrayMaxSecondNum(int[] array, int maxNumber) {
        int counter2 = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] > counter2) && (array[i] < maxNumber)) {
                counter2 = array[i];
            }
        }
        return counter2;
    }
}
