from math import *

nb1 = input("first number? ")
nb2 = input("second number? ")
operation = input ("what operation? Please enter +, _, *, / or quit")
if operation == "-":
    print('Valid Operation')
    print('anwser ' + str(float(nb1)-float(nb2)))
elif operation == '+':
    print('Valid Operation')
    print('anwser ' + str(float(nb1)+float(nb2)))
elif operation == '*':
    print('Valid Operation')
    print('anwser ' + str(float(nb1)*float(nb2)))
elif operation == '/':
    print('Valid Operation')
    print('anwser ' + str(round(float(nb1)/float(nb2))))
elif operation == 'quit':
    print('Goodbye')
    quit()
else:
    print('Invalid Operation, Try again')
    quit()


