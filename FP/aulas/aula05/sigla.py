
nome = input("Grande cena meu:")

def sigla(nome):
    nigga = ""
    for i in nome:
        if i.isupper():
            nigga += i
    return nigga

print(sigla(nome))
