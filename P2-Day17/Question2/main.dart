import 'dart:math';

void main() => lottoResult();

/*
  This funtion using for Generate Lotto Coupon
*/

void lottoResult() {
  var randomNum = 0;
  var columnNumber = 1;
  var random = Random();

  while (columnNumber <= 8) {
    var column = [];
    while (column.length < 6) {
      randomNum = random.nextInt(49) + 1;
      //Check value in column exists ?
      if (column.contains(randomNum)) {
        randomNum = random.nextInt(49) + 1;
      } else {
        column.add(randomNum);
      }
    }
    //Column Sorting...
    column.sort();
    print('Column $columnNumber: $column');
    columnNumber++;
  }
}
