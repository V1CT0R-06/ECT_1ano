


print("n", "Un")

Un = 100  
n = 0
          
while Un > 0:
    print(n, Un)
    n += 1
    Un = 1.01*Un - 1.01
    if Un < 0:
        break
 
 