
import java.util.Random;
public class Main

{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		//Fonksiyonumuz bize zarToplamlarini döndürecek.
		int zarToplamlari;
		int yeniZarToplamlari;
        zarToplamlari = zarAt();
        
	    //System.out.println("Zarların Toplamı: " + zarToplamlari + "\n");
		
		if (zarToplamlari == 7 || zarToplamlari == 11){
		    System.out.println("1.Tur:" + zarToplamlari + " geldi. Oyuncu Kazandı !");
		    System.out.println("Akıyo bu akşam, Maşallah");
		    //break;
		}
		else if (zarToplamlari == 2 || zarToplamlari == 3 || zarToplamlari == 12){
		    System.out.println("1.Tur: " + zarToplamlari + " geldi. Oyuncu Kaybetti !");
		    System.out.println("Bari zardan düşseydik Ekrem Abi");
		    //break;
		}
		//4-5-6-8-9-10 gelme durumu.
		else{
		    System.out.println("1.Tur: " + zarToplamlari + " geldi. \nSonuç Belli Değil. 7 gelmeden yine " + zarToplamlari + " atarsa kazanacak !\n");
		    int gelecekZar = zarToplamlari;
		    for (int i = 2; i < 100 ; i++){
		    
		        
		            yeniZarToplamlari = zarAt();
		            
		            if(yeniZarToplamlari == 7){
		                System.out.println(i +".Tur: Zar Toplamları 7 Geldi ! OYUN BİTTİ. \n----------LOSE-------------");
		                break;
		            }
	            
		            if(yeniZarToplamlari == gelecekZar){
		                System.out.println(i +".Tur: " + yeniZarToplamlari + " geldi. OYUNCU KAZANDI ! \n+++++++++ WİN +++++++++");
		                break;
		            }
		            
		            if(yeniZarToplamlari != gelecekZar || yeniZarToplamlari != 7){
		                System.out.println(i +".Tur: " + yeniZarToplamlari + " geldi. Sonuç Belli Değil.  Oyuncu Yeniden Zar Atacak!\n");
		            }
		        } 
		        
		    }

	}
	
	public static int zarAt(){
		int min = 1;
		int max = 7;
		int zarToplam = 0;
		Random r = new Random();
		
		for (int i = 1; i <= 2; i++){
		    
		    //int zarNum = r.nextInt((max - min) + 1)) + min;
		    
		    int zarNum = (int)(Math.random()*6) + 1;
		    System.out.println(i + ". Zar " + zarNum + " geldi.");
		    zarToplam += zarNum;
		}
		return zarToplam;
	}
	
}


