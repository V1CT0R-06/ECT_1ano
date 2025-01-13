def parseTime(s):
    if s.isdigit():
        return int(s)
    
    elif 'h' in s:  #ver se há um "h" entre os numeros
        try:
            horas, minutos = map(int, s.split('h'))
            return horas * 60 + minutos
        except ValueError:  #caso não haja, return None
            return None
    else:
        return None

# Exemplo de uso
print(parseTime("45"))    # 45
print(parseTime("3h10"))  # 190
print(parseTime("abc"))   # None

