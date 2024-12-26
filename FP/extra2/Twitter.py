#Twitter messages and hashtags counter

import json
from collections import Counter

def main():
    # Abre o ficheiro e descodifica-o criando o objeto twits.
    with open("twitter.json", encoding="utf8") as f:
        twits = json.load(f)

    # Lista para armazenar todas as palavras
    palavras = []

    # Extrair palavras dos tweets
    for twit in twits:
        if "text" in twit:  # Verificar se o texto existe
            palavras.extend(twit["text"].split())

    # Contar a frequência de cada palavra
    contagem_palavras = Counter(palavras)

    # Ordenar as palavras por frequência (crescente)
    palavras_ordenadas = sorted(contagem_palavras.items(), key=lambda x: x[1])

    # Filtrar hashtags e ordená-las
    hashtags = sorted([p for p in palavras if p.startswith("#")])

    # Mostrar as 10 palavras mais mencionadas
    top_10 = sorted(contagem_palavras.items(), key=lambda x: x[1], reverse=True)[:10]
    print("\nTop 10 palavras mais mencionadas:")
    for palavra, contagem in top_10:
        print(f"{palavra}: {contagem} vezes")

    # Mostrar as hashtags ordenadas
    print("\nHashtags ordenadas:")
    print(hashtags)

if __name__ == "__main__":
    main()
