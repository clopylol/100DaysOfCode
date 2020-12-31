#Recursive Soluation for Factorial
def calculateFactorial(num):
    #0! and 1! = 1
    if num == 1 or num == 0:
        return 1;
    else:
        return num * calculateFactorial(num - 1)

#Iterative Soluation for Factorial
def factorial(num):
    if  num == 0 or num == 1:
        return 1
    else: 
        fakt = 1;
        for i in range(0,num):
            fakt += fakt * i
        return fakt

#Calculate Permutation
def permutation(num1, num2):
    if num2 > num1:
        return 1 
    else:
        return factorial(num1) / factorial(num1 - num2)


#Calculate Combinate
def combinate(num1, num2):
    if num1 == num2:
        return 1
    elif num1 > num2:
        return factorial(num1) / (factorial(num2) * factorial(num1 - num2))
    else: 
        return print("Bir hata meydana geldi.") 

#--------------- T E S T ---------------

#Factorial
num = 5
print('{}! = {}'.format(num, factorial(num))) #5! = 120

#Permutation
num1 = 5
num2 = 2
print('({},{}) Permutation = {}'.format(num1,num2, permutation(num1,num2))) #(5,2) Permutation = 20.0

#Combinate
num1 = 5
num2 = 2
print('({},{}) Combinate = {}'.format(num1,num2, combinate(num1,num2))) #(5,2) Combinate = 10.0


