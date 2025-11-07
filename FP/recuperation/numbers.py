def generate_sequence(n):
    result = []
    for i in range(1, n + 1):
        result.extend([i] * i)  
        # Adiciona o número i repetido i vezes
    return result

# Testes
print(generate_sequence(1)) 
print(generate_sequence(2))  
print(generate_sequence(3)) 
print(generate_sequence(4))  