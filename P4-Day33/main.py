def isPerfect(num):
    total = 0
    for i in range(1,num):
        if num % i == 0:
            total += i

    if num == total:
        return print('{} is a perfect number !'.format(num))
    else:
        return print('{} is not perfect !'.format(num))

#--------------- T E S T ---------------
isPerfect(6)
isPerfect(28)
isPerfect(496)
isPerfect(100)
isPerfect(25)