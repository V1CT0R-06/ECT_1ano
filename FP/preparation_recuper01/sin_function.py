import math

def sin(x, terms=5):

    term = x            # first term x^1 / 1!
    result = term
    for n in range(1, terms):
        # each next term = previous * (-1) * x^2 / ((2n)*(2n+1))
        term = term * (-1) * x * x / ((2 * n) * (2 * n + 1))
        result += term
    return result

# Example usage:
angle = math.radians(30)  # Convert degrees to radians
print(f"sin(30 degrees) approximated with 5 terms: {sin(angle, terms=5)}")
print(f"sin(30 degrees) from math.sin: {math.sin(angle)}")