

#Crie uma função minmax(lst) que devolva o mínimo e o máximo de uma lista de
#valores. Consegue fazê-la sem usar as funções min, max, sort, nem sorted?

def inputFloatList():   #defenir função para escrever a lista
    float_list = []     #inicialmente não existe
    
    while True:
        user_input = input("Digite um número (Enter para finalizar): ")
        if user_input == '':  
            break
        
        else:           # Converte o input e armazena na lista
            float_list += [float(user_input)]  
            
        
    return float_list

def minmax(lst):
    if not lst:         # Verifica se a lista está vazia
        return None, None  # Retorna None se a lista estiver vazia

    # Inicializa o mínimo e máximo com o primeiro elemento da lista
    minimum = maximum = lst[0]

    # Percorre a lista a partir do segundo elemento
    for num in lst[1:]:
        if num < minimum:
            minimum = num   # se o valor for menor que o primeiro elemento, o min muda para esse valor
        if num > maximum:
            maximum = num   # se o valor for maior que o primeiro elemento, o max muda para esse valor 
            
    return minimum, maximum # min e max após a função

lista = inputFloatList()        # lista é o input da lista da primeira função
minimo, maximo = minmax(lista)  # função para o mínimo e o máximo

print(f"Mínimo: {minimo}, Máximo: {maximo}")

