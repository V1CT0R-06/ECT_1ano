def fibonacci(n):
    fib = [0, 1]
    for i in range(2, n):
        fib.append(fib[i-1] + fib[i-2])
    return fib

print(fibonacci(10))

def Fibonacci(n):
    # Casos base:
    if n == 0:
        return 0
    if n == 1:
        return 1

    # valores iniciais
    a = 0  # F0
    b = 1  # F1

    # vamos calcular até chegar a Fn
    for i in range(2, n + 1):
        proximo = a + b  # soma dos dois anteriores
        a = b            # anda um passo
        b = proximo      # anda um passo

    return b

print(Fibonacci(10))
