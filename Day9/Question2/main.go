package main

import (
	"fmt"
)

func main() {

	//Cumartesi
	fmt.Println(dayOfWeak(1071, 8, 26))

	//Pazar
	fmt.Println(dayOfWeak(1453, 5, 29))

	//Çarşamba
	fmt.Println(dayOfWeak(1922, 8, 30))

	//Pazar
	fmt.Println(dayOfWeak(2020, 10, 11))

}

func dayOfWeak(year int, month int, day int) (result string) {

	var response = 0
	t := [12]int{0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4}

	if month < 3 {
		year = year - month
	}

	response = (year + int(year/4) - int(year/100) + int(year/400) + t[month-1] + day) % 7

	days := [7]string{"Pazar", "Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi"}

	result = days[response]

	return result

}
