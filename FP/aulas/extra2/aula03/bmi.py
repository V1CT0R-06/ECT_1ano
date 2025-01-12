

import math
    
def main():
    print("weight?")
    weight = float(input())
    
    print("height?")
    height = float(input())
    
    bmi = (weight / (height * height))
    
def bmi(bmi):
    bmi = (weight / (height * height))
    
    
    if bmi < 18.5:
        print("Magro")

    if 18.5 < bmi < 25:
        print("saudável")
    
    if 25 < bmi < 30:
        print("forte")
    
    if bmi >= 30:
        print("Gordo")
    
    else:
        print("erro")
    
main()