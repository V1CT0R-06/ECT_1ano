
#função inputfloatlist

def inputFloatList():
    float_list = []
    
    while True:
        user_input = input("Digite um número (ou pressione Enter para finalizar): ")
        if user_input == '': 
            break
            
        if user_input != '':
            float_list.append(float(user_input))
            
        else:
            print("Valor inválido. Por favor, insira um número válido.")
            
    return float_list


numeros = inputFloatList()
print("A lista de números é:", numeros)


