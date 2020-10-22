import java.util.Random;

public class Main
{
    public static void main(String[] args) {
        //Kendime Not: Yorum satırı sayısı ile Clean Kod arasında doğru bir orantı yoktur... 
        //Aslında bu kadar çok yorum satırı kullanarak kodun Clean olmadığını kendim de fark etmiş durumdayım...
        
        //Player1 = Berkay, Player2  = Salih
        int berkay = 100000, salih = 100000;
        int sonuc, oyunDevamMı, printState = 0;
        int[] sonDurumlar = new int[500];

        // İlk para atılıyor. Diziyi patlatmamak için bu şekilde kullandım.
        berkay += 10000;
        salih -= 10000;
        sonuc = paraAt();
        System.out.print("  Güncel Kasalar: Berkay:" + berkay + " ~ Salih :" + salih + "\n");
        if (sonuc == 0) {
            sonDurumlar[0] = 0;
        } else {
            sonDurumlar[0] = 1;
        }
        int i = 1;
        //for (int i = 1; i < sonDurumlar.length; i++)'da kullanılabilir. 
        while (true) {
            //Her para atılmadan önce 2. oyuncu, 1. oyuncuya 10k veriyor.
            berkay += 10000;
            salih -= 10000;
            /*
            Print State, Kasaların güncel durumunu göstermek amacıyla kullanılıyor. 
            Bu şekilde kullanılmasının sebebi para sıfırdan düşük olduğu zamanlarda döngüyü kırıyoruz. 
            Bu yüzden ekranda oyun sonunda kasaların güncel durumunu göremiyoruz. Bunun önüne geçmek amacıyla yapıldı.
            Bunu kullanmazsak, hem if durumlarında hemde döngü sonunda kasa durumunu basıyor.
             */
            printState = 0;

            //Para havaya atılır.
            sonuc = paraAt();
            //Paranın durumu, son durumlar dizisine aktarılır. Burada dizi kullanmamdaki amaç, ard arda gelen paraları karşılaştırmaktır.
            sonDurumlar[i] = sonuc;

            //Üst Üste 2 Kez Yazı Gelme Durumu...
            if (sonDurumlar[i] == 0 && sonDurumlar[i - 1] == 0) {
                System.out.println("\n>> 2X Yazı Geldi. Berkay >> Salih'e 35K Attı.");
                berkay -= 35000;
                salih += 35000;
                printState++;
                System.out.println("    Güncel Kasalar: Berkay:" + berkay + " ~ Salih :" + salih);
                //Dizi elmanı silmek yerine elemanı karşılaştırmayı etkilemeyecek bir sayıya atadım.
                sonDurumlar[i] = 2;
                sonDurumlar[i - 1] = 2;

                oyunDevamMı = oyunBitir(berkay, salih);
                if (oyunDevamMı == 0) {
                    break;
                }
            }
            /*
            Üst üste 3 Kez Tura Gelme Durumu... Buradaki i > 1 kontrolü hata almamak için kullanılmıştır.
            Çünkü dizinin 0. indisi yani ilk parayı döngü dışarısında attık, Döngü içersinde de bir zar attık yani şuan dizimizde 
            atılmış 2 zar tutuluyor. (sonDurumlar[0] ve sonDurumlar[1] Bu şekilde aşağıdaki kontrole sonDurumlar[i - 2] şartında hata alırız.
            i değeri 1'den büyük, yani en az 2 olduğu zaman dizimizde; sonDurumlar[0], sonDurumlar[1], sonDurumlar[2] şeklinde 3 tane geçmiş para atışı sonucu tutuluyor.
            Yani buradakai kontrol girdiğinde herhangi bir sorun yaratmaz. 
            */
            if (i > 1) {
                if ((sonDurumlar[i] == 1) && (sonDurumlar[i - 1] == 1) && (sonDurumlar[i - 2] == 1)) {
                    System.out.println("\n>>> 3X Tura Geldi. Berkay >> Salih'e 60K Attı.");
                    berkay -= 60000;
                    salih += 60000;
                    //Dizi elmanı silmek yerine elemanı karşılaştırmayı etkilemeyecek bir sayıya atadım.
                    sonDurumlar[i] = 2;
                    sonDurumlar[i - 1] = 2;
                    printState++;
                    System.out.println("    Güncel Kasalar: Berkay:" + berkay + " ~ Salih :" + salih);
                    oyunDevamMı = oyunBitir(berkay, salih);
                    //Kasa kontrolü
                    if (oyunDevamMı == 0) {
                        break;
                    }
                }
            }
            if (printState == 0) {
                System.out.println("    Kasalar: Berkay:" + berkay + " ~ Salih :" + salih);
            }           
            oyunDevamMı = oyunBitir(berkay, salih);
            //Oyunculardan herhangi birisinin parası bitti mi ? Kontrolü sağlanır.
            if (oyunDevamMı == 0) {
                break;
            }
            i++;
        }
    }

    /*
        Kazanma Oranı Eklenecektir...
    */


    /*
        Yazı - Tura atmak için kullandığımız fonksiyon.
     */
    public static int paraAt() {
        Random rand = new Random();
        int sayi = rand.nextInt(2);
        if (sayi == 0) {
            System.out.print("Yazi Geldi !");
            return 0;
        } else {
            System.out.print("Tura Geldi !");
            return 1;
        }
    }
    /*
        Oyuncuların kasalarındaki para eksiye düştüğü zaman oyunu bitirmek için kull. fonksiyon
     */
    public static int oyunBitir(int p1, int p2) {
        if (p1 < 0) {
            System.out.println("\nBerkay Patladı ! Oyun Bitti - Kazanan Salih");
            return 0;
        } else if (p2 < 0) {
            System.out.println("\nSalih Patladı ! Oyun Bitti - - Kazanan Berkay ");
            return 0;
        } else {
            return 1;
        }
    }
}
