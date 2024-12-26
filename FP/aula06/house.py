
import turtle

def draw_square(side_length):
    for _ in range(4):
        turtle.forward(side_length)
        turtle.left(90)

# Example usage: Draw a square with side length 100
draw_square(100)

turtle.done()
