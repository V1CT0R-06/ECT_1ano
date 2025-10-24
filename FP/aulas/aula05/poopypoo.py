def parseMDY(dateStr):
    parts = dateStr.split('/')
    if len(parts) == 1:
        return int(parts[0])
    
    else:
        return (int(parts[2]), int(parts[0]), int(parts[1]))  

print(parseMDY("12/25/2024"))