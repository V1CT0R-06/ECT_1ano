# Exercise 5 on "How to think like a computer scientist", ch. 11.

import turtle

def main():
    screen = turtle.Screen()
    t = turtle.Turtle()

    # Use t.up(), t.down() and t.goto(x, y)
    t.up(2)
    t.down(4)
    

    # Wait until window is closed
    screen.mainloop()


if __name__ == "__main__":
    main()
