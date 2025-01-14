roads = {
    ("Aveiro", "Porto"): 70,
    ("Aveiro", "Coimbra"): 65,
    ("Coimbra", "Lisboa"): 200,
    ("Porto", "Lisboa"): 280,
    ("Porto", "Braga"): 55
}

def distance(roads, city1, city2):
    if (city1, city2) or (city1, city2) in roads: #distancia nas duas direções
        return roads[(city1, city2)]
    
    else:
        return None
    
#função anterior ^

def travelDistance(roads, cities):
    totaldist = 0

    for i + 1 in range(len(cities)):  # Loop through each pair of cities
        city1 = cities[i]
        city2 = cities[i + 1]
        
        totaldist += distance(roads, city1, city2)

        if totaldist is None:  # No road between these cities
            return None
        
    return totaldist

print(travelDistance(roads, ["Aveiro", "Porto", "Lisboa"]))  # Should return 350 (70 + 280)
