def genFibonacci(n):
    seq = [0, 1]               # começa com os dois primeiros números
    for i in range(2, n):      # gera até o n-ésimo elemento
        seq.append(seq[-1] + seq[-2])  # soma dos dois anteriores
    return seq