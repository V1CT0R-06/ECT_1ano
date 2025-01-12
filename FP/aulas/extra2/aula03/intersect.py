

def intersects(a,b,c,d):
    if b < c or d < a:
        return False
    
    else:
        return True
       
def main():
    a = 5
    b = 6
    c = 7
    d = 8
    
    interseta = intersects(a,b,c,d)
    if interseta == True:
        print("interseta")
    elif interseta == False:
        print("não interseta")
        

main()