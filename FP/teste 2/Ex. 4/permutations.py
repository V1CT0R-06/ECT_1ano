def permutations(letters):
    if len(letters) == 1:  
        return [letters]
    
    result = []  
    for i in range(len(letters)):  
        first = letters[i]  
        rest = letters[:i] + letters[i+1:] 
        
        # Mix up the rest of the letters
        rest_permutations = permutations(rest)
        
        # Add the first letter in front of each mix
        for mix in rest_permutations:
            result.append(first + mix)
    
    return result  # Give back all the mixed-up letters

# Teste
print(permutations('abc'))
