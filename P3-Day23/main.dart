import 'dart:io';
import 'dart:math';

void main() {
  var mersenneNum;
  for (var i = 1; i < 25; i++) {
    mersenneNum = isMersenne(i);
    if (isPrimeMersenne(mersenneNum) == true) {
      print('$mersenneNum is a Mersenne Prime Number ! ');
    }
  }
}

// Mersenne = (num ^ 2)- 1
num isMersenne(int num) {
  var mersenne = (pow(2, num) - 1);
  return mersenne;
}

bool isPrimeMersenne(int num) {
  var primeCheck = true;
  if (num < 2) {
    primeCheck = false;
  } else {
    for (var i = 2; i < num; i++) {
      if (num % i == 0) {
        primeCheck = false;
      }
    }
    return primeCheck;
  }
}
