
def hollowPyramid(N):
    # Garante que N é pelo menos 1
    assert N >= 0

    if N == 1:
        return 1
    else:
        return 4 * (N - 1)

# Testes simples
print(hollowPyramid(1))  # Deve imprimir 1
print(hollowPyramid(2))  # Deve imprimir 4 
print(hollowPyramid(3))  # Deve imprimir 8 
print(hollowPyramid(4))  # Deve imprimir 12
print(hollowPyramid(5))  # Deve imprimir 16


def score(guess, secret):
    bulls = 0
    cows = 0
    
    # Conta os bulls
    for numero in range(len(guess)):
        if guess[numero] == secret[numero]:
            bulls += 1
    
    # Conta os cows
    for char in guess:
        if char in secret:
            cows += 1
    
    cows -= bulls  # Remove os bulls dos cows (porque já estão na posição certa)
    
    return (bulls, cows)

# Exemplo de uso:
print(score("1234", "4271"))  # Deve imprimir (1, 2)
print(score("3245", "1112"))

users = ["admin", "guest", "guest", "user"]

for u in users:
	if u == "guest":
		users.remove(u)

print(users)

def votar():
    votos = {"A": 0, "B": 0, "NULOS": 0}

    while True:
        voto = input("Voto? (A/B/nulo) ")
        if voto == "":
            break
        elif voto == "A":
            votos["A"] += 1
        elif voto == "B":
            votos["B"] += 1
        else:
            votos["NULOS"] += 1

    total_validos = votos["A"] + votos["B"]
    percentual_a = (votos["A"] / total_validos) * 100 if total_validos > 0 else 0
    percentual_b = (votos["B"] / total_validos) * 100 if total_validos > 0 else 0

    print(f"Nulos: {votos['NULOS']}")
    print(f"A: {percentual_a:.1f}%")
    print(f"B: {percentual_b:.1f}%")

votar()


spam = "hello world"
print(spam.strip().split())


