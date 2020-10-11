package main

import (
	"fmt"
)

func main() {
	sayi := 120
	backFor(sayi)
}

func backFor(num int) {
	response := false
	for i := num; i >= 2; i-- {
		response = isPrime(i)
		if response == true {
			fmt.Println(num, "Sayısından önceki en büyük asal sayı= ", i)
			break
		}
	}
}

func isPrime(number int) (result bool) {
	counter := 0
	for i := 2; i < number; i++ {
		if number%i == 0 {
			counter++
		}
	}

	if counter == 0 {
		result = true

	} else {
		result = false
	}

	return result

}
