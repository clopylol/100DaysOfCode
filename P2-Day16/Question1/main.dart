void main() {
  calculateLcd(12, 8);
  calculateLcd(15, 25);
  calculateLcd(41, 42);
  calculateLcd(60, 42);
  calculateLcd(120, 20);
}

/*  
  This function is used to calculate the Greatest Common Divisor
*/

dynamic gcd(int num1, int num2) {
  var counter = 1;
  var bigNumber = 0;

  var gcdList = [];

  if (num1 > num2) {
    bigNumber = num1;
  } else {
    bigNumber = num2;
  }

  while (counter < bigNumber) {
    if (num1 % counter == 0 && num2 % counter == 0) {
      gcdList.add(counter);
    }
    counter++;
  }
  var len = gcdList.length;
  var gcd = gcdList[len - 1];
  print('GCD= $gcd');
  return gcd;
}

/*  
  This function is used to calculate the Least Common Multiplier
*/

void calculateLcd(int num1, int num2) {
  var gcdCal = 0;
  gcdCal = gcd(num1, num2);
  var lcd = (num1 * num2) / gcdCal;
  print('LCD = $lcd');
  print('***************');
}
