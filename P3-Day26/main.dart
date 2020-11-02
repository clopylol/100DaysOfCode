import 'dart:io';
import 'dart:math';

void main() {
  for (var num = 1002; num < 2000; num++) {
    if (digitControl(num)) {
      print("$num is avalible.");
    }
  }
}

/*
  This function controls all number's digits different ?
*/
digitControl(int number) {
  int digit = 0;
  int counter = 0;
  bool check = true;
  var numList = [];

  while (number > 0) {
    if (number <= 9) {
      numList.add(number);
      number = 0;
    } else {
      digit = number % 10;
      numList.add(digit);
      number = (number / 10).toInt();
    }
  }

  for (var i = 0; i < 4; i++) {
    for (var y = 0; y < 4; y++) {
      if (numList[i] == numList[y]) {
        counter++;
        if (counter > 1) {
          check = false;
        }
      }
    }
    counter = 0;
  }
  return check;
}
