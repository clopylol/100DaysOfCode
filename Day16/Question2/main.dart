void main() {
  isPrimeX(19001);
  isPrimeX(111);
  isPrimeX(19139);
  isPrimeX(6041);
  isPrimeX(19157);
  isPrimeX(17);
  isPrimeX(19289);
  isPrimeX(19319);
}

/* 
  This function using for number is Prime check.
*/

bool isPrime(int sayi) {
  var counter = 0;
  var check = false;

  for (var i = 1; i < sayi; i++) {
    if (sayi % i == 0) {
      counter++;
    }
  }

  if (counter > 1) {
    check = false; //Not Prime
  } else {
    check = true; //Prime
  }
  return check;
}

/*
  This function using for Sum of Digits with while.
*/

int digits(int num) {
  //List list = List();
  var tempNum = num;
  var digit = 0;
  var total = 0;

  while (num > 0) {
    digit = num % 10;
    total += digit;
    num = (num / 10).toInt(); //num = (num ~/ 10);
  }
  print("$tempNum's Sum of digits = $total");
  return total;
}

/*
  What is PrimeX ?
  If number is prime, new number = prime number's sum of digit.
  This loop continues until the number is single digit.
*/

void isPrimeX(int num) {
  print('--- Check is PrimeX: $num ? --- ');
  var tempNumber = num; //For Print after
  var isPrimeCheck = false;
  var flag = true;

  while (flag) {
    isPrimeCheck = isPrime(num);
    if (isPrimeCheck == true) {
      print('$num is a Prime.');
      if (num > 10) {
        num = digits(num);
        print('New Number =  $num');
      } else {
        print('The number $num is a single digit. Process completed.');
        print('$tempNumber provided requirements for PrimeX !');
        flag = false;
      }
    } else {
      print('$num isn’t Prime !');
      flag = false;
    }
  }
  print('\n*************************************************************\n');
}
