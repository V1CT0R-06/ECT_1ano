def getAllStrings(obj):
   """Get a list with all the strings contained in the given object."""
   lst = []
   if isinstance(obj, str):  # If obj is a string, just store it
      lst.append(obj)
   elif isinstance(obj, (list, tuple, set)):  # Handle lists, tuples, and sets
      for item in obj:
         lst.extend(getAllStrings(item))
   elif isinstance(obj, dict):  # Handle dictionaries
      for key, value in obj.items():
         lst.extend(getAllStrings(key))
         lst.extend(getAllStrings(value))
   return lst

def main():
   obj1 = ["one", 2, ["three", 4, [5, "six"]]]
   obj2 = [1, "a", ("b", [{"c", "d", 2}, 3, (4, "e")], "f")]
   obj3 = {"a": 1, "b": ["c", "d"], (2, ("x", 3)): obj1}
   print(eval(input()))

if __name__ == "__main__":
   main()

# Example usage:
# getAllStrings(obj1) should return ['one', 'three', 'six']
# getAllStrings(obj2) should return ['a', 'b', 'c', 'd', 'e', 'f']
# getAllStrings(obj3) should return ['a', 'b', 'c', 'd', 'x', 'one', 'three', 'six']
# This code defines a function to extract all strings from nested data structures