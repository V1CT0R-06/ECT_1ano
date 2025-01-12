

#ex10 aula02#
#Um dardo atinge o alvo nas coordenadas (x, y)#
#Complete o programa darts para mostrar a pontuação obtida#
#print("Enter the coordinates in mm from the center of the board.")
#x = float(input("x? "))
#y = float(input("y? "))
# Points of the sectors, clockwise from the top
# the sector right from the center is POINTS[5] == 6.
#POINTS = (20, 1, 18, 4, 13, 6, 10, 15, 2, 17, 3, 19, 7, 16, 8, 11, 14, 9, 12, 5)
# COMPLETE...
#print(score)


import math

def dist(x, y):
    return math.sqrt(x**2 + y**2)

# Função para determinar o setor (de 1 a 20) com base no ângulo
def calc_setor(x, y):
    angulo = math.degrees(math.atan2(y, x))  # Calcula o ângulo em graus
    if angulo < 0:
        angulo += 360  # Ajusta o ângulo para ser positivo

    # Setores de 1 a 20, em sequência. Cada setor ocupa 18 graus.
    setores = [6, 13, 4, 18, 1, 20, 5, 12, 9, 14, 11, 8, 16, 7, 19, 3, 17, 2, 15, 10]
    indice_setor = int(angulo // 18)  # intervalo de 18 graus entre setores
    return setores[indice_setor]

# determinar a pontuação com base na distância e no setor
def pontuacao(x, y):
    distancia = dist(x, y)
    setor = calc_setor(x, y)
    
    if distancia <= 6.35:  # Inner Bullseye
        return 50
    elif distancia <= 15.9:  # Outer Bullseye
        return 25
    elif 99 <= distancia <= 107:  # Zona Tripla 
        return 3 * setor  # Triplo da pontuação da região
    elif 162 <= distancia <= 170:  # Zona Dupla 
        return 2 * setor  # Duplo da pontuação da região
    elif distancia <= 170:  # Área Normal
        return setor  # Pontuação normal do setor
    else:
        return 0  # Fora do alvo

# Função principal
def main():
    # coordenadas do dardo
    x = float(input("Digite a coordenada x: "))
    y = float(input("Digite a coordenada y: "))

    # Calcula e exibe a pontuação
    pontos = pontuacao(x, y)
    print(f"Pontuação obtida: {pontos}")

# Executa o programa
if __name__ == "__main__":
    main()