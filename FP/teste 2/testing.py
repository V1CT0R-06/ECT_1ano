A = [1, 2, 4, 5, 3]

print(A[3] + A[4])
print(A[2:4])

mydict = {"cat":12, "dog":6 , "fish":23}
mydict["mouse"] = mydict["cat"] + mydict["dog"]
print(mydict["mouse"])

def func(lst):
    fin = open("teste 2/f1.txt")
    n = 0
    s = 0
    for x in fin:
        y = int(x)
        print(y, end=",")
        lst.append(y)
        s += y
        n += 1
    print()
    fin.close()
    return s, s/n

li = []
k1, k2 = func(li)
print("k1 =", k1)
print("k2 =", k2)
print("li_size =", len(li))

lstA = [1, 2, 3, 4, 5]
lstB = [6, 7, 8, 9, 10]

print(lstA[-2])
print(lstA[2] + lstB[1])
print(len(3*lstA))
lstC = 2*lstA[1::3] + lstB[:2]
for i in lstC:
    print(i, end=",")
print()



s = [1, 2, 3]
def reverse(s):
    return s if len(s) == 0 else [s[-1:]] + reverse(s[:-1])
print(reverse(s))



string = 'aeiouAEIOU'
def isVowel(c):
    return c.lower() in string
print(isVowel(string[4]))


def replacevowels(s):
    if len(s) == 0:
        return s
    
    rest = s[1:]
    if isVowel(s[0]):
        return '_' + replacevowels(rest)
    else:
        return s[0] + replacevowels(rest)
    
print(replacevowels("Hello World!"))

def whiteorblackchessboard(square):
    col = ord(square[0]) - ord('a') + 1
    row = int(square[1])
    if (row + col) % 2 == 0:
        return "white"
    else:
        return "black"
    
print(whiteorblackchessboard("a1"))