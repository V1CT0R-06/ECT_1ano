def printTrip(trip):
    for partida, chegada, distancia, tempo_minutos in trip:
        # Converter minutos para o formato hh:mm
        horas = tempo_minutos // 60
        minutos = tempo_minutos % 60
        # Calcular velocidade média
        velocidade = distancia / (tempo_minutos / 60)  # km/h
        # Imprimir os dados formatados
        print(f"{partida:<15}{chegada:<15}{distancia:<15}{horas:02d}:{minutos:02d}  {velocidade:.2f}")

trip_data = [
    ("Aveiro", "Albergaria", 20, 20),
    ("Albergaria", "Coimbra", 80, 60),
    ("Coimbra", "Leiria", 100, 90),
    ("Leiria", "Lisboa", 120, 80)
]

printTrip(trip_data)
