
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int epochNumber = 1000;
        int i = 0;
        int winNumber = 0;
        double winRate = 0.0;

        while (i < epochNumber) {
            if (playCraps()) {
                winNumber += 1;
            }
            i++;
        }
        winRate = ((double) winNumber / epochNumber);
        System.out.println("Epoch Number: " + epochNumber + "\nWin Counter: " + winNumber + "\nLose Counter: " + (epochNumber - winNumber) + "\nWin Rate: " + winRate);

    }

    public static boolean playCraps() {
        int zarToplamlari;
        int yeniZarToplamlari;

        zarToplamlari = rollDice();

        if (zarToplamlari == 7 || zarToplamlari == 11) {
            //System.out.println("1.Tur:" + zarToplamlari + " geldi. Oyuncu Kazandı !");
        } else if (zarToplamlari == 2 || zarToplamlari == 3 || zarToplamlari == 12) {
            //System.out.println("1.Tur: " + zarToplamlari + " geldi. Oyuncu Kaybetti !");
        } //4-5-6-8-9-10 gelme durumu.
        else {
            //System.out.println("1.Tur: " + zarToplamlari + " geldi. \nSonuç Belli Değil. 7 gelmeden yine " + zarToplamlari + " atarsa kazanacak !\n");
            int gelecekZar = zarToplamlari;
            for (int i = 2; i < 100; i++) {

                yeniZarToplamlari = rollDice();

                if (yeniZarToplamlari == 7) {
                    //System.out.println(i + ".Tur: Zar Toplamları 7 Geldi ! OYUN BİTTİ. \n----------LOSE-------------");
                    return false;
                }
                if (yeniZarToplamlari == gelecekZar) {
                    //System.out.println(i + ".Tur: " + yeniZarToplamlari + " geldi. OYUNCU KAZANDI ! \n++++++++++WIN++++++++++");
                    return true;
                }
                if (yeniZarToplamlari != gelecekZar || yeniZarToplamlari != 7) {
                    //System.out.println(i + ".Tur: " + yeniZarToplamlari + " geldi. Sonuç Belli Değil.  Oyuncu Yeniden Zar Atacak!\n");
                }
            }
        }
        return true;
    }

    public static int rollDice() {
        int min = 1;
        int max = 7;
        int zarToplam = 0;
        Random r = new Random();

        for (int i = 1; i <= 2; i++) {
            int zarNum = (int) (Math.random() * 6) + 1;
            //System.out.println(i + ". Zar " + zarNum + " geldi.");
            zarToplam += zarNum;
        }
        return zarToplam;
    }
}
