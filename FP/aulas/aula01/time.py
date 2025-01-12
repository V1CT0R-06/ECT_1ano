

#covert hours in seconds#

Hor=float(input("Horas:"))
Min=float(input("minutos:"))
Seg=float(input("segundos:"))

print("tempo original ->", Hor, ":", Min, ":", Seg)
print("tempo em segundos ->", (Hor * 3600) + (Min * 60) + Seg)

