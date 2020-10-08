public class Main
{
    public static void main(String[] args) {

        int[] array = {1, 2, 4, 5, 8, 8, 2, 9, 8, 6, 8};
        
        int mode = modeOfArray(array);
        System.out.println("Mode of Array = " + mode);
    }
    
    /*
        This function using for Finding Mode of an Array
    */

    public static int modeOfArray(int[] array) {
        int modeOfArray = 0;
        int counter = 0;
        int tempCounter = 0;

        for (int i = 0; i < array.length; i++) {
            tempCounter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    tempCounter++;
                }
            }
            if (tempCounter > counter) {
                counter = tempCounter;
                modeOfArray = array[i];
            }
        }
        return modeOfArray;
    }
}
