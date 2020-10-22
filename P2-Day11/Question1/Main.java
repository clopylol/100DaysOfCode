public class Main
{
    public static void main(String[] args) {
        int[] doors = new int[100];
        int[] keys = new int[20];
        boolean[] doorsState = new boolean[100];

        System.out.println("Door Numbers");
        AddDoorsAndKeysNumber(doors);

        System.out.println("\nKey Numbers");
        AddDoorsAndKeysNumber(keys);

        System.out.println("\nTrying keys, please wait\n...\n...\n...");
        System.out.println("\nAll keys are used !!!\n");
        useKeys(doors, keys, doorsState);

        //Show the status of the doors after the keys is used
        PrintDoorState(doorsState);

    }

    /* 
        This function is used to number all doors and keys.
     */
    public static void AddDoorsAndKeysNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    /*    
        This function is used to close all doors.
     */
    public static void AddDoorsState(boolean[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = false;
        }
    }

    /*
        This function, using keys are trying on the doors
     */
    public static void useKeys(int[] doors, int[] keys, boolean[] doorsState) {
        for (int i = 0; i < doors.length; i++) {
            for (int j = 0; j < keys.length; j++) {
                if (doors[i] % keys[j] == 0) {
                    doorsState[i] = doorsState[i] == false;

                    /* 
                        doorsState[i] = doorsState[i] == false;

                        provides the same function

                        if (doorsState[i] == false) {
                            doorsState[i] = true;
                        } else {
                            doorsState[i] = false;
                        }
                    */
                }
            }
        }
    }


    /* 
        This function using show the status of the doors after the key is used
     */
    public static void PrintDoorState(boolean[] doorsState) {
        System.out.println("Opened Doors");
        for (int i = 0; i < doorsState.length; i++) {
            if (doorsState[i] == true) {
                System.out.print(i + 1 + " ");
            }
        }

        System.out.println("\n\nLocked Doors");
        for (int i = 0; i < doorsState.length; i++) {
            if (doorsState[i] == false) {
                System.out.print(i + 1 + " ");
            }
        }
    }
}
