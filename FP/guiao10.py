def endX(s):
    if not s:  # Caso base: string vazia
        return ""
    if s[0] == 'x':  # Se o primeiro caractere é 'x', move-o para o final
        return endX(s[1:]) + 'x'
    else:  # Caso contrário, mantém o caractere e processa o restante da string
        return s[0] + endX(s[1:])

# Exemplos de teste
print(endX("xxre"))     # Output: "rexx"
print(endX("xxhixx"))   # Output: "hixxxx"
print(endX("hixhix"))   # Output: "hihixx"
