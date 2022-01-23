#Start of October 19th

#Tuple

#Tuple are data that can't be manipulated/modify, they are indexed starting from 0 the have the be encased with ()

coord = (4, 5)
print(coord[1])

#Functions
#Funtcions allows you to put block of codes in a single function, allowing you to call that function when needed instead of redoing it

#To Create Function

def Hello_World():
    print('Hello_World')

#To call Functions, we type in the function's name

#To slap in parameters , we add variable after the name of the function in the () and then to use the parameter, simply put stuff in the () whne calling functions

def Hello_World2(name):
    print('Hello_World ' + name)

#Return statement

#return statement can allowy python to return information from a function

#For Example the retune allows the anwser, which is the cube of the given number back to the caller , if return wasn't there, nothing will happen.

def cube(num):
    return num*num*num

print(cube(4))

#If we use the return keywords, it breaks out of the funcition

# If statements
#creating boolean

is_male = 1

#If statement

if is_male:
    print('you sucks')
else:
    print('you don\'t sucks')

#Else is just like otherwise

#Or can be also be used

is_tall = 0

if is_tall:
    print("help")
else:
    print("no")

#And can also be used, both value must be the same instead

#elif is else IF for example

if is_tall:
    print("hewwo")
elif is_male and not(is_tall):
    print('POG')

#End of 19 October 2021