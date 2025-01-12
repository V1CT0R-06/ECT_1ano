

def Fibonacci(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1

    fib_0, fib_1 = 0, 1

    for i in range(2, n + 1):

        fib_n = (n - 1) + (n - 2)
        fib_0, fib_1 = fib_1, fib_n

    return fib_1

n = int(input("n: "))

resultado = Fibonacci(n)
print(f"{n}º número de Fibonacci é: {resultado}")

