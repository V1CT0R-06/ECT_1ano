def isPrime(n):
    if n < 2:
        return False

    for d in range(2, n):
        if n % d == 0:
            return False  # encontrou divisor
    return True  # não encontrou divisor


for num in range(1, 101):
    if isPrime(num):
        print(num, "é primo")
    else:
        print(num, "não é primo")
