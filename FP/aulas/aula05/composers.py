import datetime

def parse_year(date_str):
    """Return the year as an integer from a date in Y or M/D/Y format."""
    parts = date_str.split('/')
    if len(parts) == 1:
        return int(parts[0])
    else:
        # Month/Day/Year
        return int(parts[2])

def load_lifetimes_file(file_name):
    """Load birth, death, name data from a file."""
    lst = []
    with open(file_name, 'r', encoding='utf-8') as file:
        for line in file:
            line = line.strip()
            if line == "" or line.startswith("#"):
                continue
            birth, death, name = line.split('\t')
            birth_year = parse_year(birth)
            death_year = parse_year(death)
            lst.append((birth_year, death_year, name))
    return lst

def main():
    file_name = 'aula05-20241024T073608Z-001/aula05/composers.txt'
    lifes = load_lifetimes_file(file_name)

    print("THE DEAD COMPOSERS SOCIETY")
    print("==========================")
    print(f"{'Name':40s} {'Died':>6s} {'Age':>5s}")
    print("-" * 55)

    for birth, death, name in lifes:
        age = death - birth
        print(f"{name:40s} {death:6d} {age:5d}")

if __name__ == "__main__":
    main()
