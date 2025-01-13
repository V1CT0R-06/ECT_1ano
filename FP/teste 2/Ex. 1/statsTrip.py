def statsTrip(trip):
    distancia_total = 0
    tempo_total_minutos = 0
    
    # Percorrer os segmentos para calcular a distância total e o tempo total
    for _, _, distancia, tempo_minutos in trip:
        distancia_total += distancia
        tempo_total_minutos += tempo_minutos
    
    # Converter tempo total em minutos para hh:mm
    horas = tempo_total_minutos // 60
    minutos = tempo_total_minutos % 60
    
    # Calcular velocidade média
    tempo_total_horas = tempo_total_minutos / 60  # Converter minutos para horas
    velocidade_media = distancia_total / tempo_total_horas  # km/h
    
    # Retornar os resultados
    return distancia_total, f"{horas:02d}:{minutos:02d}", velocidade_media

trip_data = [
    ("Aveiro", "Albergaria", 20, 20),
    ("Albergaria", "Coimbra", 80, 60),
    ("Coimbra", "Leiria", 100, 90),
    ("Leiria", "Lisboa", 120, 80)
]

distancia_total, tempo_total, velocidade_media = statsTrip(trip_data)
print(f"Distância total: {distancia_total} km")
print(f"Tempo total: {tempo_total}")
print(f"Velocidade média: {velocidade_media:.2f} km/h")
