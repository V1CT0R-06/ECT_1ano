def permutations(word):

    if len(word) == 1:
        return [word]  # Only one letter, one way
    
    result = []
    for i in range(len(word)):
        first = word[i]
        rest = word[:i] + word[i+1:]

        for p in permutations(rest):
            result.append(first + p)

    return result

# Teste
print(permutations('abc'))
