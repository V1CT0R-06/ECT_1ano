
def GuessNumber():
    main = []
    
    while True:
        user = input("what is the number I need to guess?")
        if user == "":
            print("that's not a number you fucking bitch")
            break
            
        if user != "":
            print("And your number is...", user, "!")
            break
            
        else:
            print("fuck you")
            
    return main

GuessNumber = GuessNumber()