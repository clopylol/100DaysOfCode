import 'dart:io';

void main() {
  timeConvert(3600);
  timeConvert(240);
  timeConvert(310);
  timeConvert(7205);
  timeConvert(14520);
  timeConvert(4212);
}

/*
   This function using for converts given seconds to hours, minutes, and seconds.
*/
void timeConvert(int second) {
  var list = [];
  var sec = (second % 60).toInt();
  var min = ((second / 60) % 60).toInt();
  var hours = ((second / 60) / 60).toInt();

  list.add(sec);
  list.add(min);
  list.add(hours);

  for (var i = 1; i <= 3; i++) {
    stdout.write('$second Sec => ');
    if (list[2] != 0) {
      stdout.write('${list[2]} Hours ');
      i++;
      if (list[1] == 0 && list[0] == 0) {
        break;
      }
    }
    if (list[1] != 0) {
      stdout.write('${list[1]} Min ');
      i++;
      if (list[0] == 0 && list[2] == 0) {
        break;
      }
    }
    if (list[0] != 0) {
      i++;
      stdout.write('${list[0]} Second ');
    }
  }
  print('\n------------------------------------------');
}
