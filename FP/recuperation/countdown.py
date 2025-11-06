def countdown(n):
    if n > 0:
        print(n)
        countdown(n-1)

num = int(input("Enter a positive integer: "))
countdown(num)


