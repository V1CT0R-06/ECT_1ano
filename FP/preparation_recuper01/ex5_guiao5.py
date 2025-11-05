def countDigits(s):
    count = 0
    for char in s:
        if char.isdigit():
            count += 1
    return count

string = input("Enter a string: ")
print("Number of digits in the string:", countDigits(string))
