def media_numeros():
    soma = 0.0
    conta = 0

    while True:
        linha = input("Número (ENTER para terminar): ")

        if linha == "":   # linha vazia -> parar
            break

        # converter para float
        valor = float(linha)

        soma = soma + valor
        conta = conta + 1

    if conta > 0:
        media = soma / conta
        print("Média =", media)
    else:
        print("Não introduziste números.")

media_numeros()