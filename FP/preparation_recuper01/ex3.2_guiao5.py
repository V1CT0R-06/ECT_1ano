telList = ['975318642', '234000111', '777888333']
nameList = ['Angelina', 'Brad', 'Claudia']

def nameToTels(name):
    if name in nameList:
        index = nameList.index(name)
        return telList[index]
    else:
        return None

def telToNames(tel):
    if tel in telList:
        index = telList.index(tel)
        return nameList[index]
    else:
        return None

name = input("Enter a name: ")
tel = input("Enter a telephone number: ")
print("Telephone number for", name, "is", nameToTels(name))
print("Name for telephone number", tel, "is", telToNames(tel)) 