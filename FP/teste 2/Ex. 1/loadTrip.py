def loadTrip(filename):
    trip = []
    with open(filename, 'r') as file:
        for line in file:
          
            line = line.strip()
            # Dividir a linha pelos delimitadores ";"
            cidade_partida, cidade_chegada, distancia, tempo_minutos = line.split(';')
            # Adicionar o segmento à lista, convertendo os valores numéricos
            trip.append((cidade_partida, cidade_chegada, float(distancia), int(tempo_minutos)))
    return trip

# Carregar os dados da viagem a partir do ficheiro
trip_data = loadTrip("Ex. 1/viagem.txt")

# Imprimir os segmentos carregados
for segmento in trip_data:
    print(segmento)
