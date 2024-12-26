

def Jogos(equipas):
    plays = []
    for i in range(len(equipas)):
        for j in range(len(equipas)):
            if i != j:
                plays.append((equipas[i], equipas[j]))
    return plays
    

print(Jogos(["FCP", "SLB", "SCP"]))