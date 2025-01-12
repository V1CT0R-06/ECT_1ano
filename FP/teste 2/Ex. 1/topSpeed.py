def topSpeed(trip):
    max_velocidade = 0
    segmentos_mais_rapidos = []
    
    # Determinar a maior velocidade média
    for _, _, distancia, tempo_minutos in trip:
        velocidade = distancia / (tempo_minutos / 60)  # Calcular km/h
        if velocidade > max_velocidade:
            max_velocidade = velocidade
    
    # Encontrar todos os segmentos com a maior velocidade média
    for segmento in trip:
        _, _, distancia, tempo_minutos = segmento
        velocidade = distancia / (tempo_minutos / 60)  # Calcular km/h
        if velocidade == max_velocidade:
            segmentos_mais_rapidos.append(segmento)
    
    return segmentos_mais_rapidos

trip_data = [
    ("Aveiro", "Albergaria", 20, 20),
    ("Albergaria", "Coimbra", 80, 60),
    ("Coimbra", "Leiria", 100, 90),
    ("Leiria", "Lisboa", 120, 80)
]

segmentos_rapidos = topSpeed(trip_data)

for segmento in segmentos_rapidos:
    print(segmento)
