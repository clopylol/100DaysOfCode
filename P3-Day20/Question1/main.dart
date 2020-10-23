import 'dart:io';

void main() {
  isTriangle(6, 8, 10);
  isTriangle(8, 15, 17);
  isTriangle(41, 42, 60);
  isTriangle(1, 5, 42);
  isTriangle(12, 10, 81);
}

void isTriangle(int a, b, c) {
  if (((b - c).abs() < a && a < (b + c)) &&
      ((a - c).abs() < b && b < (a + c)) &&
      ((a - b).abs() < c && c < (a + b))) {
    print('$a, $b and $c can be Triangle.');
  } else {
    print("$a, $b and $c can't be Triangle !");
  }
}
