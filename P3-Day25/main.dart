import 'dart:io';
import 'dart:math';

void main() {
//Cullen Number Formule = 2^n x n + 1
//Prime Cullen Numbers n=1,141,4713,5795
  isCullen(1);
}

/*
  This function using for calculate Prime Cullen Number
*/
void isCullen(int num) {
  var cullenNum;
  cullenNum = (pow(2, num) * num) + 1;
  if (isPrime(cullenNum)) {
    print('$num is a Prime Cullen => $cullenNum !');
  }
}

/*
  This function using for is Prime check.
*/
bool isPrime(int num) {
  var i = 2;
  var check = true;
  while (i < num) {
    if (num % i == 0) {
      check = false;
    }
    i++;
  }
  return check;
}
