
import math

print(f"{'Número':<10}{'Quadrado':<15}{'2^Número':<15}")

n = 1

for n in range(1, 21):
    print(n)
    quadrado = n ** 2
    times2 = 2 ** n
    
    print(f"{n:<10}{quadrado:<15}{times2:<15}")

    
    