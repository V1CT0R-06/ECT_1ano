def max2(a, b):
    """Return the maximum of two values.

    Args:
        a: First value.
        b: Second value.

    Returns:
        The maximum of a and b.
    """
    if a > b:
        return a
    else:
        return b
    
a = int(input("Enter first number: "))
b = int(input("Enter second number: "))

def max3(a, b, c):
    return max2(max2(a, b), c)

c = int(input("Enter third number: "))
print("The maximum of three numbers is:", max3(a, b, c))