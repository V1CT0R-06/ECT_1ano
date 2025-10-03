import sys
import os
from Cryptodome.Cipher import ARC4
from Cryptodome.Hash import SHA256

# Verifica se os argumentos foram passados corretamente
if len(sys.argv) < 3:
    print(f"Uso: python3 {sys.argv[0]} <ficheiro> <chave>")
    sys.exit(1)

fname = sys.argv[1]  # Nome do ficheiro
chave_texto = sys.argv[2]  # Chave textual fornecida pelo utilizador

# Verifica se o ficheiro existe
if not os.path.exists(fname) or os.path.isdir(fname) or not os.path.isfile(fname):
    print(f"{fname} cannot be encrypted or decrypted", file=sys.stderr)
    sys.exit(2)

# Ajusta a chave de acordo com o tamanho
if len(chave_texto) < 5:
    h = SHA256.new()
    h.update(chave_texto.encode("utf-8"))
    chave_bytes = h.digest()  # Usa SHA-256 para gerar uma chave válida
else:
    chave_bytes = chave_texto.encode("utf-8")[:256]  # Usa os primeiros 256 bytes

# Inicializa a cifra RC4
cipher = ARC4.new(chave_bytes)

# Lê o ficheiro e cifra por blocos
with open(fname, "rb") as f:
    while block := f.read(1024):  # Lê 1024 bytes de cada vez
        criptograma = cipher.encrypt(block)
        os.write(1, criptograma)  # Escreve a saída binária no stdout
