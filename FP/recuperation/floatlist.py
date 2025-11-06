def inputFloatList():
    lst = []
    while True:
        line = input("Number: ")
        if line == "": 
            break
        lst.append(float(line))
        
    return lst
