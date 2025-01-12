

#seconds to hours and minutes#

seg=float(input("segudos:"))

h= seg // 3600
m = seg % 60 
sec = seg % 3600

print("tempo em horas,minutos e segundos", h, ",", m, ",", sec)