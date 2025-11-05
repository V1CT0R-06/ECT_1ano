def removeduplicates(s):
    result = ""
    for ch in s:
        if ch not in result:
            result += ch
    return result

string = input("Enter a string: ")
print(removeduplicates(string))