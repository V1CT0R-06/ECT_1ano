def ispalindrome(s):
    return s == s[::-1] 

#le normal e ao contrario, se forem igual, e palindromo

print(ispalindrome("arara"))  # True
print(ispalindrome("hello"))  # False