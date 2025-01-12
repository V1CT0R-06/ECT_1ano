def parseTime(s):
    try:
        # Caso 1: Verificar se é um inteiro simples
        if s.isdigit():
            return int(s)
        
        # Caso 2: Verificar o formato "h:m"
        if ":" in s:
            parts = s.split(":")
            if len(parts) == 2 and parts[0].isdigit() and parts[1].isdigit():
                hours = int(parts[0])
                minutes = int(parts[1])
                return hours * 60 + minutes
        
        # Caso 3: Formato inválido
        return None
    except:
        return None

# Testes
print(parseTime("45"))     # Saída esperada: 45
print(parseTime("3:10"))   # Saída esperada: 190
print(parseTime("abc"))    # Saída esperada: None
print(parseTime("3:xy"))   # Saída esperada: None
