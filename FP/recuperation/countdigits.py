def countdigits(s):
    count = 0
    for ch in s:
        if ch.isdigit():
            count += 1
    return count

input_string = input("Enter a string: ")
digit_count = countdigits(input_string)
print("Number of digit characters in the string:", digit_count)
