import 'dart:io';

void main() {
  isSmith(728);

  for (var i = 10; i < 1000; i++) {
    if (isSmithForLoop(i)) {
      print('$i is a Smith Number');
    }
  }
}

/*
  This function using for isPrime check.
*/
bool isPrime(int sayi) {
  if (sayi == 1) {
    print('$sayi Asal Değildir.');
    return false;
  }
  var counter = 0;
  for (var i = 1; i < sayi; i++) {
    if (sayi % i == 0) {
      counter++;
    }
  }

  if (counter > 1) {
    return false; //not prime
  } else {
    return true; // prime
  }
}

/*
  This function using for Sum of Digits
*/
int digit(int num) {
  var printNum = num;
  var digit = 0;
  var total = 0;

  while (num > 0) {
    digit = num % 10;
    total += digit;
    num = (num / 10).toInt();
  }
  return total;
}

/*
  This function used to find the prime divisors of the number.
*/
List findDivisors(int num) {
  var printNum = num;
  var divisorsList = [];
  var primeDivisorsList = [];

  //Number's Multipliers
  var i = 2;
  while (i <= num) {
    if (num % i == 0) {
      num = (num / i).toInt();
      divisorsList.add(i);
      if (isPrime(i)) {
        primeDivisorsList.add(i);
      }
    } else {
      i++;
    }
  }
  //print('Multipliers => $divisorsList');
  //print("$printNum's Prime Multipliers => $primeDivisorsList");
  return primeDivisorsList;
}

/*
  This function using for Smith number check.
*/
void isSmith(int num) {
  if (isPrime(num) != true) {
    var digitTotal = digit(num);
    print("$num's sum of digits => $digitTotal");
    var divisorsList = [];
    var divisorsTotal = 0;
    divisorsList = findDivisors(num);

    for (var i = 0; i < divisorsList.length; i++) {
      if (divisorsList[i] < 10) {
        divisorsTotal += divisorsList[i];
      } else {
        divisorsTotal += digit(divisorsList[i]);
      }
    }
    print("$num's sum of prime divisors => $divisorsTotal");

    if (digitTotal == divisorsTotal) {
      print('$num is a Smith Number !');
    } else {
      print('$num is not a Smith Number !');
    }
  } else {
    print('$num is a prime. Please enter a non-prime number.');
  }
  print('----------------------------------------------');
}

/*
  This function using for Smith number check /w loop.
*/
bool isSmithForLoop(int num) {
  if (isPrime(num) != true) {
    var digitTotal = digit(num);
    var divisorsList = [];
    var divisorsTotal = 0;
    divisorsList = findDivisors(num);

    for (var i = 0; i < divisorsList.length; i++) {
      if (divisorsList[i] < 10) {
        divisorsTotal += divisorsList[i];
      } else {
        divisorsTotal += digit(divisorsList[i]);
      }
    }

    if (digitTotal == divisorsTotal) {
      return true;
    } else {
      return false;
    }
  } else {
    return false;
  }
}
