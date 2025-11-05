def evenThenOdd(s):
    return s[0::2] + s[1::2]

# Exemplo:
# evenThenOdd("abcd") -> "acbd"

evenThenOdd_string = input("Enter a string: ")
print("Transformed string:", evenThenOdd(evenThenOdd_string))
