roads = {
    'Coimbra': {'Viseu': 91, 'Aveiro': 65},
    'Viseu': {'Coimbra': 91},
    'Aveiro': {'Coimbra': 65, 'Porto': 75},
    'Porto': {'Aveiro': 75}
}

def distance(roads, c1, c2):
    if c1 in roads and c2 in roads[c1]:
        return roads[c1][c2]
    elif c2 in roads and c1 in roads[c2]:
        return roads[c2][c1]
    else:
        return None
    pass

# Test cases:
print(distance(roads, 'Coimbra', 'Aveiro'))  # Should print: 65
print(distance(roads, 'Aveiro', 'Coimbra'))  # Should print: 65
print(distance(roads, 'Porto', 'Coimbra'))   # Should print: None
print(distance(roads, 'Viseu', 'Lisboa'))    # Should print: None


def travelDistance(roads, itinerary):
    total = 0  # Start with 0 distance

    for i in range(len(itinerary) - 1):
        city1 = itinerary[i]      # Current city
        city2 = itinerary[i + 1]  # Next city

        dist = distance(roads, city1, city2)

        total = total + dist
    
    return total

# Test:
itinerary = ['Viseu', 'Aveiro', 'Porto']
print(travelDistance(roads, itinerary))  # Should calculate total


def permutations(s):
    # BASE CASE
    if len(s) <= 1:
        return [s]
    
    # RECURSIVE CASE
    result = []
    
    # Try each character as the first character
    for i in range(len(s)):
        # Pick character at position i
        char = s[i]
        
        # Get the rest of the string (everything except s[i])
        rest = s[:i] + s[i+1:]
        
        # Get all permutations of the rest (RECURSION!)
        perms_of_rest = permutations(rest)
        
        # Add current char to the front of each permutation
        for perm in perms_of_rest:
            result.append(char + perm)
    
    return result

# Test:
print(permutations(''))     # ['']
print(permutations('a'))    # ['a']
print(permutations('ab'))   # ['ab', 'ba']
print(permutations('abc'))  # ['abc', 'acb', 'bac', 'bca', 'cab', 'cba']


