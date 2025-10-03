

#ex 9 aula02#

CTP = float(input("Nota CTP (0 a 200):"))
CP = float(input("Nota CP (0 a 200):"))

if CTP < 65:
    final = 66

if CP < 65:
    final = 66
    
else: 
    final = CTP * 0.3 + CP * 0.7


print("nota final:", final)

if  final < 66:
    print("reprovado")
    

