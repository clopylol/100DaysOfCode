import 'dart:io';

void main() {
  var cardNum = '5492968795874876';
  isValid(cardNum);
}

/*
  This function using sum of digits
*/
int sumOfDigit(int num) {
  var toplam = 0;
  while (num != 0) {
    toplam += num % 10;
    num = (num / 10).toInt();
  }
  return toplam;
}

/*
  This function using Luhn Algorthim for Card number is Valid ?
*/
void isValid(String cardNum) {
  if (cardNum.length == 16) {
    var totalOdd = 0, total = 0;
    var digitx2 = 0, totalEvan = 0;
    for (var i = 0; i < cardNum.length; i++) {
      if (i % 2 == 0) {
        digitx2 = int.parse(cardNum[i]) * 2;
        print(cardNum[i]);
        if (digitx2 < 9) {
          totalOdd += digitx2;
        }
        if (digitx2 > 9) {
          totalOdd += sumOfDigit(digitx2);
        }
      } else {
        totalEvan += int.parse(cardNum[i]);
      }
    }
    total = totalEvan + totalOdd;

    if (total % 10 == 0) {
      print('$cardNum => Card number is valid !');
    } else {
      print('$cardNum => Card number is not valid!');
    }
  } else {
    print('$cardNum => Card number is not 16');
  }
}
