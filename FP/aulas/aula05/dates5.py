
def parseMDY(date):
    parts = date.split('/')
    if len(parts) == 1:
        return (int(parts[0]), 0, 0)  # Year only
    else:
        month = int(parts[0])
        day = int(parts[1])
        year = int(parts[2])
        return (year, month, day)


def yearsBetween(date1, date2):
    year1, month1, day1 = date1
    year2, month2, day2 = date2

    years_diff = year2 - year1

    if (month2, day2) < (month1, day1):
        years_diff -= 1

    return years_diff


def main():
    # Test parseMDY
    print(f"{parseMDY('12/25/2024') = }")  # (2024, 12, 25)
    print(f"{parseMDY('4/25/1974') = }")   # (1974, 4, 25)
    print(f"{parseMDY('1755') = }")        # (1755, 0, 0)

    # Test yearsBetween
    print(f"{yearsBetween((1900, 6, 1), (1935, 5, 31)) = }")  # 34
    print(f"{yearsBetween((1900, 6, 1), (1935, 6, 1)) = }")   # 35
    print(f"{yearsBetween((1900, 6, 1), (1936, 5, 31)) = }")  # 35


# This program may be used as a module too
if __name__ == "__main__":
    main()

