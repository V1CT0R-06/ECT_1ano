def countLower(lst, v):
    count = 0
    for x in lst:
        if x < v:
            count += 1
    return count

list = [3.5, 2.1, 4.7, 1.0, 5.9]
value = float(input("Enter a float value to compare: "))
print(countLower(list, value))
