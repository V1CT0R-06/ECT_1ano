
def hondt(votes, numseats):
    num_parties = len(votes)
    seats = [0] * num_parties
    
    for _ in range(numseats):
        quotients = [votes[i] / (seats[i] + 1) for i in range(num_parties)]
        max_index = max(range(num_parties), key=lambda i: (quotients[i], -votes[i]))
        seats[max_index] += 1

    return seats

# Exemplo de uso
print(hondt([15300, 12000, 6600, 5100], 6))  # Saída esperada: [2, 2, 1, 1]
