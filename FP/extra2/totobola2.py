#totobola mais basico

def carregar_jogos(ficheiro, jornada):
    jogos = []
    try:
        f = open(ficheiro, 'r')  # Abrir o ficheiro em modo leitura
        linhas = f.readlines()  # Ler todas as linhas
        f.close()  # Fechar o ficheiro
        
        for linha in linhas[1:]:  # Ignorar o cabeçalho
            partes = linha.strip().split(',')
            if int(partes[0]) == jornada:
                jogos.append((partes[1], partes[2]))
    except:
        print("Erro ao carregar o ficheiro!")
    return jogos

def exibir_jogos(jogos):
    print("\nJogos:")
    for i in range(len(jogos)):
        anfitria, visitante = jogos[i]
        print(f"{i + 1}. {anfitria} vs {visitante}")

def preencher_boletim(jogos):
    boletim = []
    print("\nPreencha o boletim (1 - Vitória Anfitriã, X - Empate, 2 - Vitória Visitante):")
    for i in range(len(jogos)):
        anfitria, visitante = jogos[i]
        while True:
            aposta = input(f"{anfitria} vs {visitante}: ").strip().upper()
            if aposta == '1' or aposta == 'X' or aposta == '2':
                boletim.append(aposta)
                break
            else:
                print("Entrada inválida! Tente novamente.")
    return boletim

def guardar_boletim(ficheiro, jornada, boletim):
    f = open(ficheiro, 'w')  # Abrir o ficheiro e escrever
    f.write("Jornada,Jogo,Aposta\n")
    for i in range(len(boletim)):
        f.write(f"{jornada},{i + 1},{boletim[i]}\n")
    f.close()  # Fechar o ficheiro

def main():
    ficheiro_jogos = "Jornadas.csv"
    ficheiro_boletim = "boletim.csv"

    while True:
        try:
            jornada = int(input("Escolha a jornada: "))
            break
        except:
            print("Entrada inválida! A jornada deve ser um número.")

    jogos = carregar_jogos(ficheiro_jogos, jornada)
    if len(jogos) == 0:
        print("Nenhum jogo encontrado para esta jornada.")
        return

    exibir_jogos(jogos)
    boletim = preencher_boletim(jogos)
    guardar_boletim(ficheiro_boletim, jornada, boletim)

    print("Boletim guardado com sucesso!")

if __name__ == "__main__":
    main()
