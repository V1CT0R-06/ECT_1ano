def distance(roads, local1, local2):
    if (local1, local2) in roads:       #distancia numa direcao
        return roads[(local1, local2)]
    
    elif (local2, local1) in roads:     #as estradas podem ser bidirecionais
        return roads[(local2, local1)]
    
    else:
        return None

def travelDistance(roads, itinerary):
    total_distance = 0

    for city1, city2 in zip(itinerary, itinerary[1:]):
        dist = distance(roads, city1, city2)
        
        if dist is None:
            return None
        total_distance += dist

    return total_distance


roads = {
    ("Aveiro", "Porto"): 70,
    ("Aveiro", "Coimbra"): 65,
    ("Coimbra", "Lisboa"): 200,
    ("Porto", "Lisboa"): 280,
    ("Porto", "Braga"): 55
}
