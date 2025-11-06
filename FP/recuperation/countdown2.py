def countdown(n):
    if n > 0:
        return [n] + countdown(n - 1)
    else:
        return []
    
num = int(input("Enter a positive integer: "))
print(countdown(num))
