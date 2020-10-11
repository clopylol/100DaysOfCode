import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        //3 different functions do the same job: (charPyramid() - salihCharAt() - berkayCharAt())   

        charPyramid("BerkayErtugrul");
        System.out.println("");
        salihCharAt("SalihAcr");

        berkayCharAt();
    }

    /*        
        charAt() used in this function.    
     */
    static void charPyramid(String word) {
        String wordNew = "";
        int len = word.length();
        for (int i = 0; i < len; i++) {
            System.out.println(wordNew += word.charAt(i));
        }
    }

    static void salihCharAt(String word) {
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            char k[] = word.toCharArray();
            System.out.println(newWord += k[i]);
        }
    }

    static void berkayCharAt() {
        int wordArrayLen = 0;
        String newWord = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("\nHow many character does the your name consist of ?");
        wordArrayLen = sc.nextInt();
        System.out.println("Please write the character after entering them one by one.");
        String[] wordArray = new String[wordArrayLen + 1];

        // Characters from the user are taken one by one
        for (int i = 0; i <= wordArrayLen; i++) {
            wordArray[i] = sc.nextLine();
        }
        // After, the desired character pyramid is printing to console.
        for (int i = 0; i <= wordArrayLen; i++) {
            System.out.println(newWord += wordArray[i]);
        }
    }

}
