import 'dart:io';

void main() {
  decimalToBinary(120);
  decimalToBinary(1071);

  for (var i = 4142; i < 4160; i++) {
    decimalToBinary(i);
  }
}

/*
  This function using for decimal to binary convert.
*/
void decimalToBinary(int num) {
  var printNum = num;
  var list = [];
  var reverseList = [];
  var temp = 0;
  while (num > 0) {
    temp = num % 2;
    list.add(temp);
    num = (num / 2).toInt();
  }
  var counter = list.length - 1;
  for (; counter >= 0; counter--) {
    reverseList.add(list[counter]);
  }
  print('$printNum converted to binary => $reverseList');
}
