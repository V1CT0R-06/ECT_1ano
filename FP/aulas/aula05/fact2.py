# Programa para mostrar a fórmula do cálculo do fatorial

# Pede ao utilizador o valor de n
n = int(input("Enter n: "))

# Começamos com o valor inicial do fatorial
fatorial = 1

# Criamos uma lista com os números de n até 1
numeros = []

for i in range(n, 0, -1):  # vai de n até 1
    fatorial *= i
    numeros.append(str(i))  # guardamos o número como texto

# Juntamos os números com " x " entre eles
formula = " x ".join(numeros)

# Mostramos o resultado final no formato pedido
print(n,"! =",formula,"=",fatorial)
