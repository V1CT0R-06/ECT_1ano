def averageOfList(lst):
    return sum(lst) / len(lst)

float_list = []
while True:
    s = input("Enter a float number (or Enter to finish): ")
    if s == '':
        break

    float_list.append(float(s))

print("Average of the entered float numbers is:", averageOfList(float_list))