def parseMDY(date_str):
    month, day, year = map(int, date_str.split('/'))
    return year, month, day