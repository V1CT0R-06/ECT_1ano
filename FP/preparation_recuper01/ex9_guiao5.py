def parseMDY(dateStr):
    month, day, year = dateStr.split('/')
    return int(year), int(month), int(day)

date_input = input("Enter a date (MM/DD/YYYY): ")
year, month, day = parseMDY(date_input)
print(year, month, day)
