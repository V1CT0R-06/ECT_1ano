def main():
    A = "reading"
    B = "eating"
    C = "traveling"
    D = "writing"
    E = "running"
    F = "music"
    G = "movies"
    H = "programming"

    interests = {
        "Marco": {A, D, E, F},
        "Anna": {E, A, G},
        "Maria": {G, D, E},
        "Paolo": {B, D, F},
        "Frank": {D, B, E, F, A},
        "Teresa": {F, H, C, D}
    }

    # a) Table of common interests
    commoninterests = {}
    people = list(interests.keys())
    for i in range(len(people)):
        for j in range(i + 1, len(people)):
            person1 = people[i]
            person2 = people[j]
            common = interests[person1].intersection(interests[person2])
            commoninterests[(person1, person2)] = common

    print("a) Table of common interests:")
    for pair, common in commoninterests.items():
        print(f"{pair}: {common}")

main()
