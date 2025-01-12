

def parse_date(date_str):
    # Dividimos a data por "/". Se o tamanho for 1, só temos o ano.
    parts = date_str.split('/')
    if len(parts) == 1:
        year = int(parts[0])
        return (year, 0, 0)
    elif len(parts) == 3:
        month = int(parts[0])
        day = int(parts[1])
        year = int(parts[2])
        return (year, month, day)
    else:
        raise ValueError(f"Data no formato inválido: {date_str}")

def load_lifetimes_file(filename):
    composers = []
    with open(filename, 'r') as file:
        for line in file:
            # Ignoramos linhas de cabeçalho ou vazias
            if line.startswith("#") or not line.strip():
                continue
            # Separar os campos por tabulação
            birth_str, death_str, name = line.strip().split('\t')
            # Converter as datas usando parse_date
            birth_date = parse_date(birth_str)
            death_date = parse_date(death_str)
            # Guardar o terno (data_nascimento, data_morte, nome) na lista
            composers.append((birth_date, death_date, name))
    return composers

# Exemplo de uso:
filename = 'composers.txt'
composers_data = load_lifetimes_file(filename)
for composer in composers_data:
    print(composer)
