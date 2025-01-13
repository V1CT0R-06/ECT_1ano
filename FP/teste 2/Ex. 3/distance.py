
roads = {
    ("Aveiro", "Porto"): 70,
    ("Aveiro", "Coimbra"): 65,
    ("Coimbra", "Lisboa"): 200,
    ("Porto", "Lisboa"): 280,
    ("Porto", "Braga"): 55
}

def distance(roads, local1, local2):
    if (local1, local2) in roads:       #distancia numa direcao
        return roads[(local1, local2)]
    
    elif (local2, local1) in roads:     #as estradas podem ser bidirecionais
        return roads[(local2, local1)]
    
    else:
        return None

print(distance(roads, "Aveiro", "Porto"))  # Output: 70
print(distance(roads, "Coimbra", "Lisboa"))  # Output: 200

# deve dar algo tipo: print(distance(roads, "Aveiro", "Porto"))  Output: 70
