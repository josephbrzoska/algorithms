# Joseph Brzoska
# Algorithms & Data Structures
# A1 Euclid’s Algorithm
def gcd(x, y):
   r = x % y
   while r != 0:
      x = y
      y = r
      r = x % y
   return y
print ("gcd(16, 12)= ", gcd(16, 12))
print ("gcd(58, 13)= ", gcd(58, 13))
print ("gcd(45, 10)= ", gcd(45, 10))
print ("gcd(258, 98)= ", gcd(258, 98))
print ("gcd(857, 350)= ", gcd(857, 854))
print ("gcd(1049, 985)= ", gcd(1050, 1045))
print ("All solutions are displayed, Thank you!")
