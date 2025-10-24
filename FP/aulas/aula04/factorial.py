#"""
#Complete a função factorial(n) para calcular e devolver o factorial de n.
#Use uma instrução de repetição for ou while.
#Recorde que n! = 1*2*3*...*n, para n>=1, e 0! = 1, por definição.
#A função só aceita argumentos inteiros não negativos.
#"""
n = int(input("What is your number? "))

def factorial(n):
   assert isinstance(n, int)
   assert n >= 0            

   if n == 0:
      return 1
      
   while n >= 1:
      return n * factorial(n-1)

print("the factorial of", n ,"is", factorial(n))


