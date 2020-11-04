import 'dart:io';
import 'dart:math';

void main() {
  var i = 0;
  var win = 0;
  var turSayisi = 1000;
  double rate;

  //Belirtilen tur sayısı kadar 60 Taş oyunu oynatılır.
  while (i < turSayisi) {
    if (tombalaOynat()) {
      win += 1;
    }
    i++;
  }
  print(
      "Tur Sayısı: $turSayisi \nKazanma Sayısı: $win \nKazanma Olasılığı: ${rate = win / 1000}");
}

//60 Taş Simulasyonu
tombalaOynat() {
/*
  Önce 1'den 90'a kadar numaralı taşlar oluşturulur. => torbayiOlustur();
  Daha sonra torba içerisinden 60 tane taş çekilir. => torbadanSayiCek();
  Üzerinde 5 sayı bulunan tombala kartları oluşturulur. => kartlariOlustur();
  Bu kartlardan rastgele bir tanesi seçilir. => kartSec();
  Daha sonra aşağıdaki adımlar takip edilir. 
  Eğer seçilen kartın üzerindeki 5 sayı, çekilen 60 taş içerisinde varsa oyuncu kazanır. 

*/
  var torba = [];
  var kartlar = [];
  var cekilenSayilar = [];
  var secilenKart = [];

  torba = torbayiOlustur();
  cekilenSayilar = torbadanSayiCek(torba);
  kartlar = kartlariOlustur();
  secilenKart = kartSec(kartlar);

  var counter = 0;
  for (var i = 0; i < secilenKart.length; i++) {
    for (var y = 0; y < cekilenSayilar.length; y++) {
      if (secilenKart[i] == cekilenSayilar[y]) {
        //print('${secilenKart[i]} == ${cekilenSayilar[y]}');
        counter += 1;
      }
    }
  }
  if (counter == 5) {
    return true;
  }
  return false;
}

//1'den 90'a kadar sayıları oluşturalım.
List torbayiOlustur() {
  var torbaSayilar = [];
  for (var i = 1; i <= 90; i++) {
    torbaSayilar.add(i);
  }
  //Torbadaki sayıları karıştıralım.
  torbaSayilar.shuffle();
  return torbaSayilar;
}

//Torbadan 60 sayı çekilir.
List torbadanSayiCek(List torba) {
  var cekilenSayilar = [];
  var cekilensayi = 0;
  var random = Random();
  for (var i = 0; i < 60; i++) {
    cekilensayi = random.nextInt(60) + 1;
    cekilenSayilar.add(cekilensayi);
  }
  //print('Torbadan Çekilen Sayılar: $cekilenSayilar');
  return cekilenSayilar;
}

//10 Tane kart oluşturalım, kartların üzerinde 1-90 arası 5 sayı olacak.
List kartlariOlustur() {
  var kartlar = List(10);
  var geciciKart = List(5);
  var random = Random();
  var randomSayi = 0;
  for (var i = 0; i < kartlar.length; i++) {
    for (var y = 0; y < 5; y++) {
      randomSayi = random.nextInt(90) + 1;
      //Kartta her sayıdan en fazla 1 tane olmak zorunda.
      while (true) {
        if (geciciKart.contains(random)) {
          randomSayi = random.nextInt(90) + 1;
        } else {
          geciciKart[y] = randomSayi;
          break;
        }
      }
    }
    kartlar[i] = [
      geciciKart[0],
      geciciKart[1],
      geciciKart[2],
      geciciKart[3],
      geciciKart[4]
    ];
  }
  //print('------Kartlar Oluşturuldu------');
  for (var i = 0; i < kartlar.length; i++) {
    //print('${i + 1}. kart:  ${kartlar[i]}');
  }
  return kartlar;
}

//Oluşturulan kartlardan rastgele 1 tanesi seçilir.
List kartSec(List kartlar) {
  var random = Random();
  var secilenKart;
  secilenKart = random.nextInt(kartlar.length - 1);
  //print("Seçilen Kart ${kartlar[secilenKart]}");
  return kartlar[secilenKart];
}
