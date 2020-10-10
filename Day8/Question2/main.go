package main

import (
	"fmt"
)

func main() {
	fmt.Println("---Euler Number (e)---")

	var stepNumber int
	stepNumber = 10

	eulerCalculate(stepNumber)
}

/*
	This fuction using for calculate factorial
*/

func factorial(number int) (result int) {
	result = 1
	for i := 1; i <= number; i++ {
		result *= i
	}
	return result
}

/*
	This fuction using for e number
*/

func eulerCalculate(stepNumber int) {
	var e = 0.0
	for j := 0; j < stepNumber; j++ {
		e += (1 / float64(factorial(j)))
		fmt.Println(j, ".Step: ", e)
	}
}
