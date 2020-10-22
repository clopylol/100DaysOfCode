import 'dart:io';
import 'dart:math';

void main() {
  reverseNumber(123);
  reverseNumber(1071);
}

/*
  This function used to calculate the digit value of the number.
*/
List numDigit(int num) {
  var numList = [];
  while (num > 0) {
    numList.add(num % 10);
    num = (num / 10).toInt();
  }
  return numList;
}

/*
  This function used reversed the number.
*/
void reverseNumber(int num) {
  var numList = [];
  var total = 0;
  var digit = 0;
  var calc = 0;

  numList = numDigit(num);
  var len = numList.length;
  var backLen = numList.length - 1;
  for (var i = 0; i < len; i++) {
    calc = 0;
    digit = pow(10, backLen).toInt();
    backLen--;
    calc = digit * numList[i];
    total += calc;
  }
  print('$num reverse => $total');
}
