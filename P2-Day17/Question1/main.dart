import 'dart:math';

void main() {
  //DATE Format: 19.10.2020

  //Valid Dates
  dateIsValid(25, 12, 2020);
  dateIsValid(02, 08, 2020);

  //Invalid Dates
  dateIsValid(31, 02, 2020);
  dateIsValid(29, 02, 2021);
  dateIsValid(34, 08, 1975);
  dateIsValid(05, 13, 2101);

  //How many random years ?
  randomDate(5);
}

/*
  This function using for checks validity for the date.
*/

void dateIsValid(int day, int month, int year) {
  bool leapYear;
  var isValid = true;

  /*
    What's Leap Year ?
    Years that are a multiple of 4 and not a multiple of 100 are leap years.
    Years that are multiple of 400 are leap years.
  */
  if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
    leapYear = true;
  }

  //Month Check
  if (month > 0 && month <= 12) {
    //February
    if (month == 2) {
      if (leapYear == true && day == 29) {
        isValid = true;
      } else if (day > 28) {
        isValid = false;
        print(
            'ERROR ! - This year is February, the month cannot be more than 28 days');
      }
    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
      //April, June, September, November
      if (day > 30) {
        isValid = false;
        print('ERROR ! - This month cannot be more than 30 days.');
      }
    } else if (day > 31) {
      //Other months
      print('ERROR ! - This month cannot be more than 31 days.');
      isValid = false;
    }
  } else {
    print('ERROR ! - You Have Entered an Invalid Month!');
    isValid = false;
  }

  print('-------------------------------------------------------');
  print('$day $month $year');
  if (isValid == true) {
    print('Date is Valid.');
  } else {
    print('Date is Invalid !!!');
  }
}

/*
  This function using for create random dates.
*/
void randomDate(int howMany) {
  var random = Random();
  var day = 0;
  var month = 0;
  var year = 0;

  for (var i = 0; i < howMany; i++) {
    day = random.nextInt(31) + 1;
    month = random.nextInt(12) + 1;
    year = random.nextInt(250) + 1800;
    dateIsValid(day, month, year);
  }
}
