
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

print(distance(roads, "Aveiro", "Porto"))  # Output: 70
print(distance(roads, "Coimbra", "Lisboa"))  # Output: 200

# deve dar algo tipo: print(distance(roads, "Aveiro", "Porto"))  Output: 70
