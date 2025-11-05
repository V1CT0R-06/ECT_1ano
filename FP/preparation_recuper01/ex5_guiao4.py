# Complete the code to make the HiLo game.

import random

def playHiLo():
    # Pick a random number between 1 and 100, inclusive
    secret = random.randrange(1, 101);

    print("I picked a number between 1 and 100. Can you guess it?")
    # put your code here
    ...

    input_number = int(input("Your guess: "))
    tries = 0

    while True:
        tries += 1
        input_number = int(input("Your guess: "))
        if input_number < secret:
            print("Too low!")
        elif input_number > secret:
            print("Too high!")
        else:
            print("Correct! You've guessed the number.")
            print('Number of tries:', tries)
            break

playHiLo()

