def proper_divisors(n):
    divs = []
    for i in range(1, n):
        if n % i == 0:
            divs.append(i)
    return divs

number = int(input("Enter a positive integer to find its proper divisors: "))
print("Proper divisors are:", proper_divisors(number))