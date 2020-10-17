void main() {
  greatestCommonDivisor(41, 42);
  greatestCommonDivisor(60, 41);
  greatestCommonDivisor(5, 25);
  greatestCommonDivisor(32, 128);
  greatestCommonDivisor(12, 256);
  greatestCommonDivisor(1024, 128);
}

//Calculate GCD
greatestCommonDivisor(int num1, int num2) {
  var counter = 1;
  var smallNum = 0;

  if (num1 < num2) {
    smallNum = num1;
  } else {
    smallNum = num2;
  }

  List list = List();

  while (counter <= smallNum) {
    if (num1 % counter == 0 && num2 % counter == 0) {
      list.add(counter);
    }
    counter++;
  }

  list.sort;
  var len = list.length;
  var gcd = list[len - 1];

  print("\n--------- GCD($num1 and $num2) ---------");
  print("Common Divisors: $list");
  print("GCD: $gcd");
}
