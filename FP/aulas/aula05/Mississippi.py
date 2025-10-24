
# Given a string s, return the string with adjacent duplicates removed. 
# For example, Mississippi yields Misisipi. You may assume there is at least 
# one character in the given string. 

def removeAdjacentDuplicates(s):
    result = ""          
    previous = ""        

    for char in s:
        if char != previous:   
            result += char    
        previous = char       

    return result
