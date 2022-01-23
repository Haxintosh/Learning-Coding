#start of October 21th

#For Loops
#For loops are a special kinds of loop that allows us to loop over over different collections of items.

#for example
for letter in "help":
    print(letter)
    print(' ')
# In for loop, we can define a variable wiht each letters of a string or something like that
#For loop also works with array or list

#2d lists and nested loops

#2d lists

number = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9],
    [0]

]
#to acces numbers in a 2d lists, we do VARIABLE[ROW][COLUMN] for example

print(number[2][2])

#Nested loops

#a nested loops is basically a loop inside of another loop

#for example

for row in number:
    for column in row:
        print(column)

#End of October 21th