
h = int(input("H? "))
m = int(input("m? "))
s = int(input("s? "))

def hms2sec(h, m, s):
    # Converte horas, minutos e segundos em segundos
    segundos = (h * 3600) + (m * 60) + s
    return segundos

# Chama a função e imprime o resultado
total_segundos = hms2sec(h, m, s)
print(f"O total em segundos é: {total_segundos}")
