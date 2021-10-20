# If Statement and comparisons

def maxnumber(n1, n2, n3):
    if n1 >= n2 and n1 >= n3:
        return n1
    elif n2 >= n1 >= n2:
        return n2
    else:
        return n3

print(maxnumber(5, 6, 6))

# Dictionary
monthFUll = {
    "jan": "january",
    'feb': 'febru',
    'mar': 'march',
}
print(monthFUll["jan"])
# could also be use by using .get(NAME) with this, we can use a string to display whatever we want of what we want isn't in the dict.
# Example

print(monthFUll.get('hewwo', 'not valid'))

#so what comes  after the comma will be the exception message.

#While Loop

i = 1
while i == 1:
    print('help')
    i += 1

