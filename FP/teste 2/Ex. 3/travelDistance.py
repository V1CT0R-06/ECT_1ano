roads = {
    ("Aveiro", "Porto"): 70,
    ("Aveiro", "Coimbra"): 65,
    ("Coimbra", "Lisboa"): 200,
    ("Porto", "Lisboa"): 280,
    ("Porto", "Braga"): 55
}

def distance(roads, city1, city2):
    if (city1, city2) in roads:       #distancia numa direcao
        return roads[(city1, city2)]
    
    elif (city2, city1) in roads:     #as estradas podem ser bidirecionais
        return roads[(city2, city1)]
    
    else:
        return None

#função anterior ^

def travelDistance(roads, cities):
    total = 0
    i = 0  # Start from the first city

    while i+1 < len(cities):  # +1 para que não ultrapasse o total de cidades
        d = distance(roads, cities[i], cities[i+1])  # Get distance between two cities

        if d is None:
            return None  # No road here, stop!

        total += d  # Add the distance
        i += 1  # Move to the next pair of cities

    return total

print(travelDistance(roads, ["Aveiro", "Porto", "Lisboa"]))  # Should return 350 (70 + 280)
