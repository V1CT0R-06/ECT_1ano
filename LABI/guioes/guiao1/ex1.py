import hashlib
import sys
import os

# Verifica se um argumento foi passado
if len(sys.argv) < 2:
    print(f"Uso: python3 {sys.argv[0]} <nome_do_ficheiro>")
    sys.exit(1)

fname = sys.argv[1]  # Nome do ficheiro passado por argumento

# Verifica se o ficheiro existe e não é um diretório
if not os.path.exists(fname) or os.path.isdir(fname) or not os.path.isfile(fname):
    print(f"Erro: {fname} não é um ficheiro válido", file=sys.stderr)
    sys.exit(2)

# Calcula a síntese SHA-1
h = hashlib.sha1()

with open(fname, "rb") as f:
    while chunk := f.read(512):  # Lê o ficheiro em blocos de 512 bytes
        h.update(chunk)

# Exibe a síntese em hexadecimal
print(h.hexdigest())
