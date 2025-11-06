# ID: 


# This function reads words from a file.
def load(fname):
   with open(fname) as f:
      lst = []
      for line in f:
         words = line.strip().split()
         lst.extend(words)
   return lst


def matchesPattern(s, pattern):
    # 1) Se os comprimentos forem diferentes, não casa
    if len(s) != len(pattern):
        return False

    # 2) Ignorar maiúsculas/minúsculas
    s = s.lower()
    pattern = pattern.lower()

    # 3) Comparar posição por posição
    i = 0
    while i < len(s):
        letra = s[i]
        p = pattern[i]

        if p == '?':
            # ? aceita qualquer letra → ok, segue
            i += 1
            continue

        if letra != p:
            # letra fixa do padrão não bate → falha
            return False

        i += 1

    # 4) Se não falhou em nenhuma posição, então casa
    return True

# (b) Filtra a lista mantendo só quem casa com o padrão
def filterPattern(lst, pattern):
    resultado = []
    for palavra in lst:
        if matchesPattern(palavra, pattern):
            resultado.append(palavra)
    return resultado


def main():
   print("a)")
   print( matchesPattern("secret", "s?c??t") )  #-> True
   print( matchesPattern("secreta", "s?c??t") ) #-> False
   print( matchesPattern("socket", "s?c??t") )  #-> True
   print( matchesPattern("soccer", "s?c??t") )  #-> False
   print( matchesPattern("SEcrEt", "?ecr?t") )  #-> True
   print( matchesPattern("SEcrET", "?ecr?t") )  #-> True
   print( matchesPattern("SecrEt", "?ECR?T") )  #-> True

   words = load("wordlist.txt")

   print("b)")
   # Solution to "S?C??T"
   lst = filterPattern(words, "s?c??t")
   print(lst)

   assert isinstance(lst, list),  "result lst should be a list"
   assert "secret" in lst,  "result should contain 'secret'"

   # Solution to "?YS???Y"
   lst = filterPattern(words, "?ys???y")
   print(lst)


# Call main function:
if __name__ == "__main__":
   main()

#JMR 2022