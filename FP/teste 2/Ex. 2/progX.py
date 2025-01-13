def parseTime(s):
    if s.isdigit():
        return int(s)  # Retorna o número diretamente se for apenas dígitos
    
    if 'h' in s:  # Verifica se a string contém 'h'
        partes = s.split('h')

        horas = int(partes[0])
        minutos = int(partes[1])
            
        return horas * 60 + minutos  # Converte para minutos
        
    return None  # Retorna None se a string não for válida

# Exemplo de uso
print(parseTime("45"))    # 45
print(parseTime("3h10"))  # 190
print(parseTime("abc"))   # None
