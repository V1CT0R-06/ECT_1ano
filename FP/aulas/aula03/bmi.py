
def main():
    weight = float(input("Weight? "))
    height = float(input("Height? "))

    bmi = calculate_bmi(weight, height)
    print(f"BMI: {bmi:.2f} - {classify_bmi(bmi)}")

def calculate_bmi(weight, height):
    return weight / (height ** 2)

def classify_bmi(bmi):
    if bmi < 18.5:
        return "Magro"
    elif bmi < 25:
        return "Saudável"
    elif bmi < 30:
        return "Forte"
    else:
        return "Gordo"

main()
