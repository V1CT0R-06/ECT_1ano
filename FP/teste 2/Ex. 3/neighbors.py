def neighbors(roads):
    result = {}

    for (city1, city2), dist in roads.items():

        if city1 not in result:  # se a cidade 1 não ligar a cidade 2
            result[city1] = []

        if city2 not in result:  # se a cidade 1 não ligar a cidade 2
            result[city2] = []

        result[city1].append((city2, dist))
        result[city2].append((city1, dist))

    return result

roads = {
    ("Aveiro", "Porto"): 70,
    ("Aveiro", "Coimbra"): 65,
    ("Coimbra", "Lisboa"): 200,
    ("Porto", "Lisboa"): 280,
    ("Porto", "Braga"): 55
}

# deve dar algo tipo: "Aveiro": ["Porto", "Coimbra"], ...
