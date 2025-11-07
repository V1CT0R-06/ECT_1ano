def minmax(lst):
    if not lst:
        return None, None
    minimum = maximum = lst[0]
    for num in lst[1:]:
        if num < minimum:
            minimum = num
        if num > maximum:
            maximum = num
    return minimum, maximum



numbers = []
while True:
    line = input("Enter a number (or press Enter to finish): ")
    if line == "":
        break
    numbers.append(float(line))

min_value, max_value = minmax(numbers)
print("Minimum:", min_value)
print("Maximum:", max_value)