def distance(roads, local1, local2):
    if (local1, local2) in roads:       #distancia numa direcao
        return roads[(local1, local2)]
    
    elif (local2, local1) in roads:     #as estradas podem ser bidirecionais
        return roads[(local2, local1)]
    
    else:
        return None

def travelDistance(roads, cities):
    total = 0

    for i in range(len(cities) - 1):

        d = distance(roads, cities[i], cities[i + 1])
        
        if d is None:
            return None  # No road here, stop!
        
        total += d  # Add the distance

    return total

roads = {
    ("Aveiro", "Porto"): 70,
    ("Aveiro", "Coimbra"): 65,
    ("Coimbra", "Lisboa"): 200,
    ("Porto", "Lisboa"): 280,
    ("Porto", "Braga"): 55
}
