def permutations(letters):
    if len(letters) == 1:  
        return [letters]
    
    result = []  
    for i in range(len(letters)):  
        first = letters[i]  
        rest = letters[:i] + letters[i+1:] 
        
        # Mix up the rest of the letters
        rest_permutations = permutations(rest)
        
        for perm in rest_permutations:
            result.append(first + perm)
    
    return result  # Give back all the mixed-up letters

# Teste
print(permutations('abc'))
