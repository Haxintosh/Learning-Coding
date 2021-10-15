***DEFINITIONS***  
string = string of letters/plain text  
numbers = numbers (decimal has to be with ".")  
Boolean Value = true/false data (First letter has to be Capital, example, `is_alpha = True`)  
Concatenation = putting 2 strings together  
Function = block of code that will perform specific operation for us  
Parameter = value given to a function  
Mod = takes the first number and devide it by the second number and then spit out the remain number, sign is `%`, can be used like `print(10 % 3)`  


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

to put the anwser in a variable, we use the normal variable way, `example = input("this is an exmaple? ")  








