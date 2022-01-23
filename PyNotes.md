***DEFINITIONS***  
string = string of letters/plain text  
numbers = numbers (decimal has to be with ".")  
Boolean Value = true/false data (First letter has to be Capital, example, `is_alpha = True`)  
Concatenation = putting 2 strings together  
Function = block of code that will perform specific operation for us  
Parameter = value given to a function  
Mod = takes the first number and devide it by the second number and then spit out the remain number, sign is `%`, can be used like `print(10 % 3)`  


Lists are created using `[]`  
Dictionaries are created using `{}`  
Tuples are created using `()`  


***Variable***  

Variable can be created using (variable name) **SPACE** = **SPACE** ("value")    
   
Those variable are **case sensitive**    

*For example:*

`x = yay  
y = not yay` 

`print(x)  
yay`  

`print(y)  
not yay`  

We can combine print() text with variable by putting varaible in +

*For example*

`print("not pog" + x + "lol")
not pog yay lol`

But if there is no text before the variable **no need to put the "+"**

*for example*

`print(y + "noo")`

you can override variable's value by making a new define value below the original one  

***Strings***  

In order to put stuff in a string for example for print(), you need to put them in **QUOTATION**  

`\n` = makes stuff after it go on a new line  

`\(anything)` = makes 1 thing after it displayed literally  

*For example*

`print("Hax\nIndustries")`  
Hax  
Indsutries  

`print("\"hello\""`  
"hello"  

**Functions** 

useful stuff to use  

*for example*  

`print("hello_world".upper())`  

the function is `
print("hellothere".replace("hello", "bye")).upper()` which makes everything uppercase  

we can also add `is` before the function to turn the fuction into checking  

*for example*  

`print("HELLO".isupper())`  
`True`  

it will returns as an boolean value  

we can also combine function (they work in normal order, from left to right)  

*for example*  

`print("hello".upper().isupper())`  
`True`  

so there the `.upper()` function made the hello into all uppercase and the `.isupper()` checks if it is all upper or no  

There are be functions that need the string inside it's `()`  

*For example*  

`print(len("house"))`   
`5`  

`len` function find the number of characters in the string.  

To find what is in a specific slot of the string we use `[]`  

*for example*

`print("houseisonfire"[2])`  
`u`

now the index of a string starts with `0` so the second character would be `1`    

This process can be reversed using the `.index` function, you have to put the letter in the `()`  

Another function is `.replace` it replaces thing before the `,` with stuff after it.  

*for example*  

`print("hellothere".replace("hello", "bye"))`  
`byethere`  


***Numberssss!!!***

You can do basic arithmetics with numbers in python, but only BASICS, this include parenthesis , note that pyton prioritize multiplication or division  

*for example*  

`print(1 + 69 * 2)`  
`139`  

so we don't need to seperate them with spaces but it is good to do it for good practices ;)  

so we want to print numbers along side strings, but python throws back our code with an error so we have to add `str()` function before the number then add the string to it with `+`  

*for example*   

`print(str(69) + " my life is glorious")`  
`69 my life is glorious`  

for common math functions, see 14Oct.py  

to transform str into interger, use int()

***User Inputs***  
To opem a prompt to ask, we use  `input()` we put what we want to ask in the `()`   

to put the anwser in a variable, we use the normal variable way, `example = input("this is an exmaple? ")`    

***Lists***    

To create list, fistly give it a name to describe what's inside, very similar to variable, uses `[]` to store a list   

*for example*  

`list = ['help', 2, 3]`  

just like other indexes, it always starts with 0 then go on,  

to use a specific stuff inside a list, we uses indexes with a `[]` after the list  

*for example*  

`print(list[1])`  
`2`  

you can also grab stuff from the back of the list using negative numbers, keeo in mind that the fist number from the back is not 0 but -1 instead  

we can grab multiple element using `[1:3]` (change the number ofc.) it will start grabbing from index 1 and won't grab index 3 but will grab index 2.  

to modify element in a specific index, we can use the same thing as a valauble  

*for example*  

`list[2] = 5`  

**List Functions**

AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH STUFF GOT DELETED BECAUSE PC CRASHED AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH

***Tuples**

Tuples are like lists that can't be changed/modified, they are indexed starting from 0 using `[INDEX]` behind the tuple  
They are created using `()`    

***FUNCTIONS POGGGGG***  
A function allows you to put bloc of codes inside them and allowing you to use it when needed instead of rewriting the codes   

It can be created using `def` and it's usage is `def FUNCTION NAME(PARAMETER):` then we put codes after it as what to excecute.  

**Return Statement**  
Return statement are used to return stuff from the function for example a math operation  (check 19Oct.py for example)  

***If statement***

If statement is to if stuffs :p   
It's syntax is fairly easy, see 19Oct.py and 20Oct.py for them.  

Else is like otherwise  
Elif is like if the previous condition is not true then try this condition   

**Comprison and if statment**  
we can use comparison to compare between to thing, for example we can use it in a string or a boolean value.  
comparison stuff  
`==` is equal to  
`!=` is not equal to  
`>` is greater than  
`<` is less than  
`>=` is greater or equal to  
`<=` is less or equal to  

***Dictionary***

Dictionary are a bank of data that can be accesed using it's defined name and can be created using `{}`  
The "stuff" inside a dictionary can be accsed using `[]` after it's name or using `.get(Name of Stuff)`  
If we using the `.get()` method, we can make an exception message with an `,` after the `.get()`  

*For Example*  
`Creating a Dict`  
`monthFull = {
    'jan": "january",  
    'feb': 'febru',  
    'mar': 'march',  
}`  

`print(monthFUll.get('hewwo', 'not valid'))`  
this will print out 'not valid' as excpetion when there is none.  

***WHILE LOOP*** 

While loop can be started with the keyword `while` and it's syntax is `while CONDITIONS:`  
quick note to self, `i += 1`    

***FOR LOOP***  

for loop is a loop that allows you to spit out every letter of a string, of an lis/array, etc.  

*For example*  
`for letter in "help":
    print(letter)
    print(' ')`   

For example here, we are printing out every letters in help.  

***2d lists***

2d lists is a momre complicated type of lists that allows you to store variable in *cases* (row and column.)  

*For example*  
`number = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9],
    [0]

]`  

(see 21Oct.py)  

***Nested loops***  
Nested loops are basically a loop inside another loop  

*For example*  

`for row in number:
    for column in row:
        print(column)`  
(See 21Oct.py)  




