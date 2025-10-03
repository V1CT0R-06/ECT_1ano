

def parseMDY(dateStr):
    # Split the date string by "/" to separate the parts
    parts = dateStr.split('/')
    
    # If the date string only contains the year
    if len(parts) == 1:
        year = int(parts[0])
        return (year, 0, 0)
    
    # If the date string contains month, day, and year
    elif len(parts) == 3:
        month = int(parts[0])
        day = int(parts[1])
        year = int(parts[2])
        return (year, month, day)
    
    # In case of an unexpected format, you might want to raise an error
    else:
        raise ValueError("Invalid date format")

print(parseMDY("12/25/2024"))  # Output should be (2024, 12, 25)
print(parseMDY("2024"))        # Output should be (2024, 0, 0)
