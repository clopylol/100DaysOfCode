import 'dart:io';
import 'dart:math';

void main() {
  /*Example Output: 
    Epoch Number: 100 
    Win Number: 13 
    Win Rate: 0.13 
  */

  int epochNumber = 100;
  int winNumber = 0;
  int i = 0;
  double winRate = 0.0;

  while (i < epochNumber) {
    if (playBingo()) {
      winNumber += 1;
    }
    i++;
  }
  print(
      "Epoch Number: $epochNumber \nWin Number: $winNumber \nWin Rate: ${winRate = winNumber / epochNumber}");
}

playBingo() {
  //Creating bingo bag and bingo cards
  var bingoBag = [];
  var bingoCards = [];
  //Numbers taken from the bag
  var selectedNumbers = [];
  //Selected card
  var selectedCard = [];

  bingoBag = createBag();
  selectedNumbers = selectNumbers(bingoBag);
  bingoCards = createCards();
  selectedCard = selectCard(bingoCards);

  var counter = 0;
  for (var i = 0; i < selectedCard.length; i++) {
    for (var j = 0; j < selectedNumbers.length; j++) {
      if (selectedCard[i] == selectedNumbers[j]) {
        //print('${selectedCard[i]} == ${selectedNumbers[y]}');
        counter += 1;
      }
    }
  }
  if (counter == 5) {
    return true;
  } else {
    return false;
  }
}

List createBag() {
  //Create numbers in the bag
  var numbersInBag = [];

  //Create numbers from 1 to 90.
  int i = 1;
  while (i <= 90) {
    numbersInBag.add(i);
    i++;
  }

  //Shuffle the bag
  numbersInBag.shuffle();
  return numbersInBag;
}

//Selected 60 numbers from the bag
List selectNumbers(List bag) {
  var selectedNumbers = [];
  int selectedNumber = 0;
  var rnd = Random();

  int i = 0;
  while (i < 60) {
    selectedNumber = rnd.nextInt(60) + 1;
    selectedNumbers.add(selectedNumber);
    i++;
  }
  //print('Selected Numbers from the Bag: $selectedNumbers');
  return selectedNumbers;
}

//Create 10 Cards, There are 5 numbers on the cards.
List createCards() {
  var cards = List(10);
  var numbersInCard = List(5);
  var rnd = Random();
  int randomNumber = 0;

  for (var i = 0; i < cards.length; i++) {
    for (var y = 0; y < 5; y++) {
      randomNumber = rnd.nextInt(90) + 1;
      //Each number on the card must be unique.
      while (true) {
        if (numbersInCard.contains(rnd)) {
          randomNumber = rnd.nextInt(90) + 1;
        } else {
          numbersInCard[y] = randomNumber;
          break;
        }
      }
    }
    cards[i] = [
      numbersInCard[0],
      numbersInCard[1],
      numbersInCard[2],
      numbersInCard[3],
      numbersInCard[4],
    ];
  }

  for (var i = 0; i < cards.length; i++) {
    //print('${i + 1}. card:  ${cards[i]}');
  }
  return cards;
}

List selectCard(List cards) {
  var rnd = Random();
  var selectedCard = rnd.nextInt(cards.length - 1);
  //print("Selected Card: ${cards[selectedCard]}");
  return cards[selectedCard];
}
