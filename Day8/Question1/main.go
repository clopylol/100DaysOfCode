package main

import "fmt"

func main() {

	fmt.Println("---Friendly Numbers---")

	var number, number2, factoringTotalNum, factoringTotalNum2 int

	number = 220
	number2 = 284

	factoringTotalNum = factoring(number)
	fmt.Println("\nNumber 1 Factoring Totals: ", factoringTotalNum)

	factoringTotalNum2 = factoring(number2)
	fmt.Println("Number 2 Factoring Totals: ", factoringTotalNum2)

	isFriendly(number, number2, factoringTotalNum, factoringTotalNum2)

}

/* 
	This function using for Sum of the Factors of number
*/

func factoring(number int) (toplam int) {
	for i := 1; i < number; i++ {
		if number%i == 0 {
			toplam += i
		}
	}
	return toplam
}

/*
	This function using for check friends number.
*/

func isFriendly(num, num2, numFact1, numFact2 int) {

	if num == numFact2 && num2 == numFact1 {
		fmt.Println("\n", num, "and", num2, "are Friendly !")

	} else {
		fmt.Println("\n", num, "and", num2, "are NOT Friendly !")
	}

}
