def main():
    print("Bem-vindo ao sistema de apostas!")
    ficheiro_jogos = "Jornadas.csv"
    ficheiro_boletim = "boletim.csv"

    # Escolher a jornada
    while True:
        try:
            jornada = int(input("Escolha a jornada: "))
            break
        except ValueError:
            print("Entrada inválida! Por favor insira um número.")

    # Carregar jogos e verificar se existem
    jogos = carregar_jogos(ficheiro_jogos, jornada)
    if not jogos:
        print("Nenhum jogo encontrado para esta jornada.")
        return

    # Exibir jogos e preencher o boletim
    exibir_jogos(jogos)
    boletim = preencher_boletim(jogos)

    # Guardar o boletim
    guardar_boletim(ficheiro_boletim, jornada, boletim)

def carregar_jogos(ficheiro, jornada):
    try:
        # Abrir o ficheiro e ler as linhas
        with open(ficheiro, 'r') as f:
            linhas = f.readlines()

        # Ignorar o cabeçalho e filtrar os jogos da jornada
        jogos = []
        for linha in linhas[1:]:
            partes = linha.strip().split(',')
            if int(partes[0]) == jornada:
                jogos.append((partes[1], partes[2]))
        return jogos
    except:
        print("Erro: não foi possível carregar os jogos.")
        return []

def exibir_jogos(jogos):
    print("\nJogos da jornada:")
    for i, (anfitria, visitante) in enumerate(jogos, start=1):
        print(f"{i}. {anfitria} vs {visitante}")

def preencher_boletim(jogos):
    print("\nPreencha o boletim (1 - Vitória Anfitriã, X - Empate, 2 - Vitória Visitante):")
    boletim = []
    for anfitria, visitante in jogos:
        while True:
            aposta = input(f"{anfitria} vs {visitante}: ").strip().upper()
            if aposta in ['1', 'X', '2']:
                boletim.append(aposta)
                break
            else:
                print("Entrada inválida! Tente novamente.")
    return boletim

def guardar_boletim(ficheiro, jornada, boletim):
    try:
        with open(ficheiro, 'w') as f:
            f.write("Jornada,Jogo,Aposta\n")
            for i, aposta in enumerate(boletim, start=1):
                f.write(f"{jornada},{i},{aposta}\n")
        print("\nBoletim guardado com sucesso!")
    except:
        print("Erro: não foi possível guardar o boletim.")

if __name__ == "__main__":
    main()
