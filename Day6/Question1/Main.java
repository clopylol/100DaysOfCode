public class Main
{
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 3, 8, 10};
        
        boolean sequentialCheck = isSequential(array);     
        if (sequentialCheck) {
            System.out.println("This Array is Sequential");
        }
        else{
            System.out.println("This Array is a NOT Sequential !!!");
        }
    }
    
    /*
        This function using for, array is sequential 
    */

    static boolean isSequential(int [] array) {
        int i = 0;
        boolean response = true; 
        for (int j = 1; j < array.length; j++) {
            if (array[i] < array[j]) {
                System.out.println(array[i] + " < " + array[j]);            
                System.out.println("Next Step");
                response = true;
                
            } else if (array[i] > array[j]) {
                System.out.println(array[i] + " > " + array[j]);
                System.out.println("STOP");
                response = false;
                break;
            }
            i++;
        }
        return response;
    }
