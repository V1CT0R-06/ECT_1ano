def findRise(lst):
    indices = []  # lista para guardar os índices onde há subida
    
    for i in range(1, len(lst)):  # começa em 1 porque comparamos com o anterior
        if lst[i] > lst[i - 1]:   # se o número atual é maior que o anterior
            indices.append(i)     # guarda o índice
    return indices


print(findRise([1, 0, 9, 7, 3, 8, 1]))
