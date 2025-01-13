def loadTrip(trip):
    trip = []
    with open("Ex. 1/viagem.txt", 'r') as file:
        for line in file:
          
            line = line.strip()
            # Dividir a linha pelos delimitadores ";"
            cidade_partida, cidade_chegada, distancia, tempo_minutos = line.split(';')
            # Adicionar o segmento à lista, convertendo os valores numéricos
            trip.append((cidade_partida, cidade_chegada, float(distancia), int(tempo_minutos)))
    return trip

# Imprimir os segmentos carregados
for trip in loadTrip("Ex. 1/viagem.txt"):
    print(trip)
