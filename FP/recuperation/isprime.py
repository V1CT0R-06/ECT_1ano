def isPrime(n):
    if n < 2:
        return False

    for d in range(2, n):
        if n % d == 0:
            return False  # encontrou divisor
    return True  # não encontrou divisor

print(isPrime(11))  # True
print(isPrime(4))   # False