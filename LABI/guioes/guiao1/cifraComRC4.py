import sys
import hashlib
from Cryptodome.Cipher import ARC4

def process_key(key: str) -> bytes:
    key_bytes = key.encode()
    if len(key_bytes) < 5:
        key_bytes = hashlib.sha256(key_bytes).digest()
    return key_bytes[:256]

def rc4_encrypt(file_path: str, key: str):
    key = process_key(key)
    cipher = ARC4.new(key)
    
    with open(file_path, "rb") as f:
        data = f.read()
    encrypted_data = cipher.encrypt(data)
    sys.stdout.buffer.write(encrypted_data)

if __name__ == "__main__":
    if len(sys.argv) != 3:
        print("Usage: python3 cifraComRC4.py <file> <key>")
        sys.exit(1)
    
    file_path, key = sys.argv[1], sys.argv[2]
    rc4_encrypt(file_path, key)
