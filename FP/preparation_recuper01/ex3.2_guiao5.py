telList = ['975318642', '234000111', '777888333']
nameList = ['Angelina', 'Brad', 'Claudia']

def nameToTels(name):
    if name in nameList:
        index = nameList.index(name)
        return telList[index]
    else:
        return name, "not in contacts"

def telToNames(tel):
    if tel in telList:
        index = telList.index(tel)
        return nameList[index]
    else:
        return tel

tel = input("Enter a telephone number: ")
print(telToNames(tel), "IS CALLING") 
name = input("Enter a name: ")
print(telToNames(tel), nameToTels(name), "IS CALLING")
