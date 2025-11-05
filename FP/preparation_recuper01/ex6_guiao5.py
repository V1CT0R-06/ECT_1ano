def shortenUppercase(s):
    result = ""
    for ch in s:
        if ch.isupper():
            result += ch
    return result

string = input("Enter a string: ")
print("Shortened string:", shortenUppercase(string))
