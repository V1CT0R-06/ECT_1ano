#!/usr/bin/env python3
# ex8_guiao4.py
# Lê números reais do utilizador até linha vazia e mostra a média.

def main():
    total = 0.0
    count = 0
    while True:

        s = input("Introduza um número (ENTER para terminar): ").strip()
    
        if s == "":
            break

        else:
            num = float(s)

        if num < 0:
            print("Número negativo: invalido")
            continue

        total += num
        count += 1

    if count == 0:
        print("Nenhum número introduzido.")
    else:
        media = total / count
        print("A média dos números introduzidos é:", media)
        print("Total:", total)

if __name__ == "__main__":
    main()