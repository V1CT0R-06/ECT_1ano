

def generate_sequence(n):
    result = []
    for i in range(1, n + 1):
        result.extend([i] * i)  # Adiciona o número i repetido i vezes
    return result

# Testes
print(generate_sequence(1))  # Deve retornar [1]
print(generate_sequence(2))  # Deve retornar [1, 2, 2]
print(generate_sequence(3))  # Deve retornar [1, 2, 2, 3, 3, 3]
print(generate_sequence(4))  # Deve retornar [1, 2, 2, 3, 3, 3, 4, 4, 4, 4]
print(generate_sequence(5))
print(generate_sequence(6))
print(generate_sequence(7))
print(generate_sequence(8))
print(generate_sequence(9))
print(generate_sequence(10))
