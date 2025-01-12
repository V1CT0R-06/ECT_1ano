def distance(roads, c1, c2):
    if (c1, c2) in roads:
        return roads[(c1, c2)]
    elif (c2, c1) in roads:
        return roads[(c2, c1)]
    else:
        return None

def travelDistance(roads, itinerary):
    total_distance = 0
    for i in range(len(itinerary)):
        dist = distance(roads, itinerary[i], itinerary[i + 1])  
        # Acessa diretamente as cidades (i e i+1)
        if dist is None:  # Se não houver estrada entre as cidades
            return None
        total_distance += dist  # Soma a distância ao total
    return total_distance

roads = {
    ("Aveiro", "Porto"): 70,
    ("Aveiro", "Coimbra"): 65,
    ("Coimbra", "Lisboa"): 200,
    ("Porto", "Lisboa"): 280,
    ("Porto", "Braga"): 55
}
