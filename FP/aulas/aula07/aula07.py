
def GuessNumber():
    main = []  
    
    while True:
        user = input("What is the number I need to guess? ")
        
        if user == "":  
            print("That's not a number, you donkey!")
            break
        
        if user.isdigit():  
            print("And your number is...", user, "!")
            break
        
        else:  
            print("That's not a valid number, you donkey!")
    
    return main  

GuessNumber()
