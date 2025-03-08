from Cryptodome.Hash import SHA256

# Pede ao utilizador o nome do ficheiro
nome_ficheiro = input("Digite o nome do ficheiro: ")

try:
    with open(nome_ficheiro, "rb") as f:  # Abre o ficheiro no modo binário
        dados = f.read()  # Lê todo o conteúdo do ficheiro

    h = SHA256.new(dados)  # Calcula o hash SHA-256
    print("SHA-256:", h.hexdigest())  # Mostra o resultado

except FileNotFoundError:
    print("Erro: Ficheiro não encontrado!")

