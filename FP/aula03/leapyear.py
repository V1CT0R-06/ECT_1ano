

def main():
    print("year?")
    year = int(input())
    isLeapYear(year)
    
    
    
def isLeapYear(year):
    if year % 4 == 0 and (year % 100 != 0 or year % 400 == 0):
        print("é bissexto")
    
    else:
        print("não é bissexto")

main()