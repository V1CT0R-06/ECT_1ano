# totobola em python

import csv

def carregar_jogos(ficheiro, jornada):
    jogos = []
    try:
        with open(ficheiro, 'r') as f:
            leitor = csv.reader(f)
            next(leitor)  # Ignorar cabeçalho
            for linha in leitor:
                if int(linha[0]) == jornada:
                    jogos.append((linha[1], linha[2]))
    except FileNotFoundError:
        print(f"Erro: O ficheiro '{ficheiro}' não foi encontrado.")
    return jogos

def exibir_jogos(jogos):
    print("\nJogos:")
    for i, (anfitria, visitante) in enumerate(jogos, 1):
        print(f"{i}. {anfitria} vs {visitante}")

def preencher_boletim(jogos):
    boletim = []
    print("\nPreencha o boletim (1 - Vitória Anfitriã, X - Empate, 2 - Vitória Visitante):")
    for anfitria, visitante in jogos:
        aposta = input(f"{anfitria} vs {visitante}: ").strip().upper()
        while aposta not in ['1', 'X', '2']:
            print("Entrada inválida! Tente novamente.")
            aposta = input(f"{anfitria} vs {visitante}: ").strip().upper()
        boletim.append(aposta)
    return boletim

def guardar_boletim(ficheiro, jornada, boletim):
    with open(ficheiro, 'w') as f:
        f.write("Jornada,Jogo,Aposta\n")
        for i, aposta in enumerate(boletim, 1):
            f.write(f"{jornada},{i},{aposta}\n")

def main():
    ficheiro_jogos = "Jornadas.csv"
    ficheiro_boletim = "boletim.csv"

    try:
        jornada = int(input("Escolha a jornada: "))
    except ValueError:
        print("Entrada inválida! A jornada deve ser um número.")
        return

    jogos = carregar_jogos(ficheiro_jogos, jornada)
    if not jogos:
        print("Nenhum jogo encontrado para esta jornada.")
        return

    exibir_jogos(jogos)
    boletim = preencher_boletim(jogos)
    guardar_boletim(ficheiro_boletim, jornada, boletim)

    print("Boletim guardado com sucesso!")

if __name__ == "__main__":
    main()
