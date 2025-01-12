

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
    if not lst:  # vê se a lista está vazia
        return None  
        print("lista vazia") 
        
    else:
        return min(lst), max(lst) # calcua o min e o max
    

lista = inputFloatList() 
minimo, maximo = minmax(lista)  

print(f"Mínimo: {minimo}, Máximo: {maximo}")
