def neighbors(roads):
    result = {}
    
    for road in roads:
        city1, city2 = road

        if city1 not in result:
            result[city1] = []  # Start list for city1

        if city2 not in result:
            result[city2] = []  # Start list for city2

        else:
            result[city1].append(city2)  # Add city2 to city1’s list
            result[city2].append(city1)  # Add city1 to city2’s list
        
    return result

roads = {
    ("Aveiro", "Porto"): 70,
    ("Aveiro", "Coimbra"): 65,
    ("Coimbra", "Lisboa"): 200,
    ("Porto", "Lisboa"): 280,
    ("Porto", "Braga"): 55
}

print(neighbors(roads))
# deve dar algo tipo: "Aveiro": ["Porto", "Coimbra"], ...
