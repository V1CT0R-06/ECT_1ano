
# Face values of coins (in cents):
COINS = [200, 100, 50, 20, 10, 5, 2, 1]

def value(bag):
    """Return total amount in a bag."""
    total = 0
    for coin, count in bag.items():
        total += coin * count  # Adiciona o valor total dessas moedas ao total
    
    print(total)
    return(total)

def main():
    # A bag of coins is represented by a dict of {coin: number} items
    bag1 = {1: 4, 2: 0, 5:1, 10: 0, 20: 5, 50: 4, 100: 2, 200: 1}
    bag2 = {}

    # Test the value function.
    assert value({}) == 0
    assert value({1:7, 5:2, 20:4, 100:1}) == 197
    assert value(bag1) == 709
    
if __name__ == "__main__":
    main()
