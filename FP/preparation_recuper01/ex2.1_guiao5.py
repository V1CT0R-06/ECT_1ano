def inputFloatList():
    lst = []
    while True:
        s = input("Enter a float number (or Enter to finish): ")
        if s == '':
            break
        lst.append(float(s))
    return lst

print(inputFloatList())