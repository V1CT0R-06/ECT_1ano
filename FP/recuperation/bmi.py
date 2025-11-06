
weight = 70  # in kilograms
height = 1.75  # in meters

def bodyMassIndex(weight, height):
    if height <=0 or weight <=0:
        raise ValueError("Height and weight must be positive values.")
    
    bmi = weight / (height ** 2)
    return round(bmi, 2)

def bmiCategory(bmi):
    if bmi < 18.5:
        return "Underweight"
    elif 18.5 <= bmi < 24.9:
        return "Normal weight"
    elif 25 <= bmi < 29.9:
        return "Overweight"
    else:
        return "Obesity"


print("BMI:", bodyMassIndex(weight, height))
print("Category:", bmiCategory(bodyMassIndex(weight, height)))