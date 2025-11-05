def telToName(tel):
    d = {'234': 'Porto', '235': 'Braga', '236': 'Viana do Castelo',
         '239': 'Aveiro', '241': 'Viseu', '242': 'Guarda',
         '243': 'Coimbra', '244': 'Leiria', '245': 'Figueira da Foz',
         '249': 'Castelo Branco', '251': 'Portalegre',
         '252': 'Bragança', '253': 'Vila Real', '254': 'Guimarães',
         '255': 'Chaves', '256': 'Miranda do Douro',
         '258': 'Ponte de Lima', '259': 'Valença'}
    prefix = tel[0:3]
    return d.get(prefix, "Unknown area code")
telephone = input("Enter a telephone number (format: XXYYYYYYY): ")
print(telToName(telephone))