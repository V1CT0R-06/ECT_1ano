num = int(input("Enter a positive integer: "))

def countdown(n):
    if n > 0:
        print(n)
        countdown(n-1)

countdown(num)


def countdownlst(n):
    if n > 0:
        return countdownlst(n - 1) + [n]
    else:
        return []
    
print(countdownlst(num))