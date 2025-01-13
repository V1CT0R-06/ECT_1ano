def permutations(string):
    result = []
    
    # Se a string tiver só um caractere, a permutação é ela mesma
    if len(string) == 1:
        return [string]
    
    # Para cada caractere da string
    for i in range(len(string)):

        char = string[i]  # Separar o caractere atual
       
        restante = string[:i] + string[i+1:]  # Restante da string sem o caractere atual
        
        # Gerar permutações do restante
        for perm in permutations(restante):
            result.append(char + perm)
    
    return result

# Teste
print(permutations('abc'))
