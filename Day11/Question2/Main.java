public class Main
{
    public static void main(String[] args) {
        String text = "losing is essentially giving up";
        reverseText(text);
    }

    /* 
        This function using for splitting the sentence into words
    */
    static void reverseText(String text) {
        String[] splitText;
        splitText = text.split(" ");

        //Print Split Text
        System.out.print("Split Text: ");
        for (int i = 0; i < splitText.length; i++) {
            System.out.print(splitText[i] + " ");
        }

        //Print Reverse Text
        System.out.print("\nReverse Split Text: ");
        for (int i = splitText.length - 1; i >= 0; i--) {
            System.out.print(splitText[i] + " ");
        }
    }
}
