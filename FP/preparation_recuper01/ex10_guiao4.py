def Fibonnaci(n):
    if n <= 0:
        return 0
    elif n == 1:
        return 1
    else:
        return Fibonnaci(n - 1) + Fibonnaci(n - 2)
    
num = int(input("Enter a positive integer: "))
print(f"The {num}th Fibonacci number is: {Fibonnaci(num)}")