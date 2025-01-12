

#ex 6 aula02#
#escrever com elif#

age = int(input("Age? "))

print("Age:", age)

if 0 < age < 13 :
    cat = "child"
    
elif 13 < age < 20:
        cat = "teenager"
 
elif age >= 20:
        cat = "grown-up"

else:
    print("ERROR: Invalid age!")
    exit(1)

print("Category:", cat)
