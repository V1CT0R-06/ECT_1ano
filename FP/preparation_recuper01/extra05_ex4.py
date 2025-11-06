
# Defina as funções aqui...
def printTable(people):
    print("Nome Peso Altura IMC")
    for name, weight, height in people:
        imc = weight / (height * height)
        # impressão direta, só arredondando
        w = int(weight) if float(weight).is_integer() else round(weight, 1)
        h = round(height, 2)
        b = round(imc, 1)
        print(name, w, h, b)

def inputBetween(prompt, minv, maxv):
    while True:
        try:
            v = float(input(prompt))
            if minv <= v <= maxv:
                return v
            print("Valor fora do intervalo.")
        except ValueError:
            print("Número inválido.")

def selectTaller(people, limit):
    res = []
    for p in people:
        if p[2] > limit:
            res.append(p)
    return res

def main():
   # Lista de pessoas com nome, peso em kg, altura em metro.
   people = [("John", 64.5, 1.757),
             ("Berta", 64.0, 1.612),
             ("Maria", 45.1, 1.715),
             ("Andy", 98.3, 1.81),
             ("Lisa", 46.8, 1.622),
             ("Kelly", 83.2, 1.78)]

   # Imprime os dados numa tabela com 4 colunas: nome, peso, altura e IMC.
   printTable(people)
   
   # Pede e devolve um valor, mas só aceita se estiver no intervalo certo.
   limit = inputBetween("altura limite? ", 1.1, 2.5)
   
   # Extrai uma lista de pessoas com altura superior a limit.
   tallpeople = selectTaller(people, limit)
   print(tallpeople)

   # Mostra uma tabela só com as pessoas altas.
   printTable(tallpeople)


# O programa começa aqui
if __name__ == "__main__":
   main()

