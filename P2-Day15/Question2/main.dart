void main() {
  isWritable(1071, 7001);
  isWritable(753, 375);
  isWritable(456, 412);
  isWritable(369, 852);
  isWritable(198, 197);
  isWritable(150, 150000);
  isWritable(1, 111111);
  isWritable(242, 4422);
  isWritable(42, 41);
}

digits(int num) {
  List list = List();
  var digit;
  while (num > 0) {
    digit = num % 10;
    list.add(digit);
    num = (num / 10).toInt();
  }
  return list;
}

isWritable(int num, int num2) {
  List split = List();
  List split2 = List();

  split = digits(num);
  split2 = digits(num2);

  var len = split.length;
  var state = true;
  var temp = 0;
  for (int i = 0; i < split2.length; i++) {
    for (int j = 0; j < split.length; j++) {
      if (split2[i] != split[j]) {
        temp++;
      }
    }
    if (temp >= len) {
      state = false;
      print("\n$num with $num2 <<Unwritable>>");
      break;
    }
    temp = 0;
  }

  if (state == true) {
    print("\n$num with $num2 <<Writable>>");
  }
}
