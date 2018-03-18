# Joseph Brzoska
# Algorithms & Data Structures
# A1 List
list = [] # Declares the list.
# While the list is less than 10, keep asking for integers.
while (len(list) < 10): #(0-9)
    integer = input("Add a integer to your list: ")
    list.append(integer)
else:
    print("Sorry, integer limit reached.")
    # When your list reaches 10 it prints your list.
    print(list)
