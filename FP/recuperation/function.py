# Get input from user
n = int(input("Enter a number: "))

# Print header
print(f"{'x':<5}{'x^2':<5}{'x^3':<5}")

# Print table
for x in range(1, n + 1):
    print(f"{x:<5}{x**2:<5}{x**3:<5}")
