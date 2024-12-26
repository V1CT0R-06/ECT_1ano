import random
import time

def prank_game():
    print("Welcome to the Number Guessing Game!")
    print("Think of a number between 1 and 100.")
    
    # Get the user's number
    while True:
        try:
            user_number = int(input("Enter your number, nigga: "))
            if 1 <= user_number <= 100:
                break
            else:
                print("Enter a number between 1 and 100 nigger!")
        except ValueError:
            print("That's not a valid number. Fuck you nigga.")
    
    print("\nLet me try to guess your number...")
    time.sleep(1)

    # Reveal the "correct" number
    print(f"\nAh-ha! I know your number! It's {user_number}, isn't it?")
    print("Fuck you nigga!")

# Run the game
prank_game()
