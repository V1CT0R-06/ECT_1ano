def sequenceUn(n):
    if n <= 0:
        return []
    else:
        return [n] + sequenceUn(n - 1)
    
number = int(input("Enter a positive integer: "))
print(sequenceUn(number))