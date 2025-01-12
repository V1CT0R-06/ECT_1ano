def permutations(string):
    if len(string) == 1:  # Caso base
        return [string]
    
    result = []  # Lista para armazenar as permutações
    
    for char in string:  # Itera diretamente sobre os caracteres
        rest = string.replace(char, '')  
        # Remove o caractere atual string.replace(old, new, count)
        for perm in permutations(rest):  # Permutações da string restante
            result.append(char + perm)  # Adiciona o caractere atual ao início de cada permutação
    
    return result

# Teste
print(permutations('abc'))


