def divisors(n):
    divs = []
    for i in range(1, n):
        if n % i == 0:
            divs.append(i)
    return divs

def sumofdivisors(n):
    return sum(divisors(n))

def compare(n):
    if sumofdivisors(n) < n:
        return "deficient"
    elif sumofdivisors(n) == n:
        return "perfect"
    else:
        return "abundant"

number = int(input("Enter a positive integer to classify: "))

print('The number', number, 'is', compare(number))