def hondt(votes, seats):
    """
    Aplica o método de Hondt para distribuir 'seats' assentos entre partidos com base em 'votes'.
    votes: lista de inteiros representando os votos recebidos por cada partido
    seats: número total de assentos a distribuir
    Retorna uma lista com o número de assentos atribuídos a cada partido.
    """
    n_parties = len(votes)
    seats_allocated = [0] * n_parties

    for _ in range(seats):
        # Calcula o quociente para cada partido
        quotients = [votes[i] / (seats_allocated[i] + 1) for i in range(n_parties)]
        # Encontra o índice do partido com o maior quociente
        max_index = quotients.index(max(quotients))
        # Atribui um assento a esse partido
        seats_allocated[max_index] += 1

    return seats_allocated
