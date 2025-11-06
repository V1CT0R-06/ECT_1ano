def allMatches(teams):
    matches = []
    for teams1 in teams:
        for teams2 in teams:
            if teams1 != teams2:
                matches.append((teams1, teams2))
    return matches

print(allMatches(["FCP", "SCP", "SLB"]))