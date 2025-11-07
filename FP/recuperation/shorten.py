def shorten(name):
    result = ""
    for ch in name:
        if ch.isupper():
            result += ch
    return result

# Test examples
print(shorten("Universidade de Aveiro"))          # UA
print(shorten("United Nations Organization"))     # UNO