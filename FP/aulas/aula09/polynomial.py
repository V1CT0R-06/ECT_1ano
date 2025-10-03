
# polynomial2(a,b,c) deve devolver uma função f tal que
# f(x) seja o polinómio de segundo grau ax²+bx+c.
def polynomial2(a, b, c):
    def f(x):
        return a * x**2 + b * x + c
    return f

# polynomial(a), onde a=[a0, a1, ..., an], deve devolver uma função f tal que
# f(x) seja o polinómio a0*x**n + a1*x**(n-1) + ... + an.
def polynomial(coefs):
    def f(x):
        n = len(coefs) - 1  # Grau do polinômio
        return sum(coefs[i] * x**(n - i) for i in range(len(coefs)))
    return f

def main():
    xx = [0, 1, 2, 3]   # Valores de x a testar

    print("\nTestes à função polynomial2:")
    p = polynomial2(1, 2, 3)    # creates p(x)=x²+2x+3
    print([p(x) for x in xx])   # [3, 6, 11, 18]

    q = polynomial2(2, 0, -2)   # creates q(x)=2x²-2
    print([q(x) for x in xx])   # [-2, 0, 6, 16]

    print("\nTestes à função polynomial:")
    r = polynomial([1, 2, 3])   # same as p(x)
    print([r(x) for x in xx])   # [3, 6, 11, 18]

    s = polynomial([1, -1, 0, 100])     # creates s(x)=x³-x²+100
    print([s(x) for x in xx])           # [100, 100, 104, 118]

if __name__ == "__main__":
    main()
