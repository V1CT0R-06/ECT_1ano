
# Dicionário para armazenar as chamadas por cliente
chamadas = {}

def menu():
    print("Menu:")
    print("1) Registar chamada")
    print("2) Ler ficheiro chamadas1.txt")
    print("3) Listar clientes")
    print("4) Fatura")
    print("5) Terminar")

def registar_chamada():
    origem = input("Número de telefone de origem: ")
    destino = input("Número de telefone de destino: ")
    try:
        duracao = int(input("Duração da chamada (em segundos): "))
    except ValueError:
        print("Duração inválida!")
        return
    
    if origem not in chamadas:
        chamadas[origem] = []
    chamadas[origem].append({"destino": destino, "duracao": duracao})
    print("Chamada registada com sucesso.")

def ler_ficheiro(caminho):
    try:
        with open(caminho, "r") as ficheiro:
            for linha in ficheiro:
                dados = linha.strip().split("\t")
                if len(dados) != 3:
                    continue
                origem, destino, duracao = dados
                try:
                    duracao = int(duracao)
                except ValueError:
                    continue
                if origem not in chamadas:
                    chamadas[origem] = []
                chamadas[origem].append({"destino": destino, "duracao": duracao})
        print("Ficheiro lido com sucesso.")
    except Exception as e:
        print(f"Erro ao ler ficheiro: {e}")

def listar_clientes():
    if chamadas:
        print("Clientes registados:")
        for cliente in chamadas.keys():
            print(cliente)
    else:
        print("Nenhum cliente registado.")

def gerar_fatura():
    origem = input("Número de telefone do cliente para faturar: ")
    if origem not in chamadas:
        print("Cliente não encontrado.")
        return
    
    print(f"Fatura para o número {origem}:")
    total = 0
    for chamada in chamadas[origem]:
        duracao = chamada["duracao"]
        custo = duracao * 0.05  
        total += custo
        print(f"Destino: {chamada['destino']}, Duração: {duracao}s, Custo: {custo:.2f}€")
    print(f"Total a pagar: {total:.2f}€")

def main():
    caminho_ficheiro = "/home/victor/FP/extra2/chamadas1.txt"  # Caminho do ficheiro carregado
    while True:
        menu()
        opcao = input("Opção? ")
        if opcao == "1":
            registar_chamada()
        elif opcao == "2":
            ler_ficheiro(caminho_ficheiro)
        elif opcao == "3":
            listar_clientes()
        elif opcao == "4":
            gerar_fatura()
        elif opcao == "5":
            print("A terminar o programa.")
            break
        else:
            print("Opção inválida. Tente novamente.")

if __name__ == "__main__":
    main()
