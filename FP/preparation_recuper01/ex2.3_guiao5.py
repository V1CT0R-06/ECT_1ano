def minmax(lst):
    if not lst:
        return None, None  # Return None for both min and max if the list is empty

    min_val = lst[0]
    max_val = lst[0]

    for num in lst:
        if num < min_val:
            min_val = num
        if num > max_val:
            max_val = num

    return min_val, max_val

numbers = [3.5, 2.1, 4.7, 1.0, 5.9]
minimum, maximum = minmax(numbers)
print("Minimum:", minimum)
print("Maximum:", maximum)