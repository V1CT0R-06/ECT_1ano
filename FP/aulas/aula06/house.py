import turtle

t = turtle.Turtle()

def draw_square(side_length):
    for _ in range(4):
        t.forward(side_length)
        t.left(90)

def draw_triangle(side_length):
    for _ in range(3):
        t.forward(side_length)
        t.left(120)

draw_square(100)

t.left(90)
t.forward(100)
t.right(90)
draw_triangle(100)

turtle.done()
