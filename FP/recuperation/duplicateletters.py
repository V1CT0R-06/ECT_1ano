def dupplicateletters(s):
    result = ""
    for char in s:
        result += char * 2
    return result

# Test examples
print(dupplicateletters("hello"))  # hheelllloo
print(dupplicateletters("abc"))    # aabbcc

def shorten(name):
    result = ""
    for ch in name:
        if ch.isupper():
            result += ch
    return result

print(shorten("Universidade de Aveiro"))          # UA

def remove_adjacent_duplicates(s):
    result = ""
    for ch in s:
        if not result or ch != result[-1]:
            result += ch
    return result

# Test example
print(remove_adjacent_duplicates("Mississippi"))  # Misisipi
