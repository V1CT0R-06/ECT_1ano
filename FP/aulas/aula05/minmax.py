

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
    if not lst:  # lista vazia     
        return None, None  

    minimum = lst[0]
    maximum = lst[0]

    for num in lst[1:]:
        if num < minimum:
            minimum = num   
        if num > maximum:
            maximum = num   
            
    return minimum, maximum # min e max após a função

minimo, maximo = minmax(inputFloatList())  

print(f"Mínimo: {minimo}, Máximo: {maximo}")

