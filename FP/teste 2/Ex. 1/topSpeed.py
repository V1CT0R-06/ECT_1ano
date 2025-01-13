# Função para calcular a velocidade de um segmento
def calcular_velocidade(segmento):
    distancia, tempo = segmento[2], segmento[3]
    return distancia / (tempo / 60)  # Convertendo minutos para horas

# Função topSpeed
def topSpeed(trip):
    return sorted(trip, key=calcular_velocidade, reverse=True)

# Exemplo de uso
trip = [
    ('Aveiro', 'Albergaria', 25, 20),
    ('Albergaria', 'Espinho', 30, 30),
    ('Espinho', 'Porto', 25, 20),
    ('Porto', 'Coimbra', 121, 90),
    ('Coimbra', 'Leiria', 70, 60),
    ('Leiria', 'Lisboa', 106, 90)
]

# Exibir os segmentos em ordem decrescente de velocidade
for segmento in topSpeed(trip):
    print(segmento)
