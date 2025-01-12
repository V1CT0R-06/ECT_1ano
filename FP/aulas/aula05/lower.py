

# função countLower(lst, val)


def countLower(lst, val): #calcular os elementos inferiores
    count=0               #contagem começa no zero
    
    for number in lst:  #para qualquer valor na lista
        if number < val:
            count += 1  
    return count

def inputFloatList():   #defenir função para escrever a lista
    float_list = []     #inicialmente não existe
    
    while True:
        user_input = input("Digite um número (Enter para finalizar): ")
        if user_input == '':  
            break
        
        else:           # Converte o input e armazena na lista
            float_list += [float(user_input)]  
            
        
    return float_list


lst = inputFloatList() #lst da função dos inferiores é a lista feita pelo input do user 
val = float(input("valor para comparar:"))  #val da função dos inferiores é o valor do input a comparar
    
final = countLower(lst, val)    #valor final, apos os calculos
print("Numero de elementos inferiores a", val, "é", final)

