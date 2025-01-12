def neighbors(roads):
    neighbors_dict = {}
    for (c1, c2) in roads:
        neighbors_dict[c1].append(c2) #para quando as cidades sao ligadas por estrada
        neighbors_dict[c2].append(c1)

        if c1 not in neighbors_dict: #para quando as cidades nao estao ligadas por estrada
            neighbors_dict[c1] = []
        if c2 not in neighbors_dict:
            neighbors_dict[c2] = []
    return neighbors_dict

roads = {
    ("Aveiro", "Porto"): 70,
    ("Aveiro", "Coimbra"): 65,
    ("Coimbra", "Lisboa"): 200,
    ("Porto", "Lisboa"): 280,
    ("Porto", "Braga"): 55
}

# deve dar algo tipo: "Aveiro": ["Porto", "Coimbra"], ...
