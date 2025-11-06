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
print("The maximum is:", max2(a, b))