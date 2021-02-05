# all variables have descriptive names
# all variables are lowercase and have no spaces
# variable_name = "String"

variable_name = "String"

print(variable_name)

print(len(variable_name))

print(variable_name[3])

print(variable_name[-1])

print(variable_name[-2])

# escape sequences
# /n adds new line
# /" adds "

# formatted strings
variable_name = "String"
full = f"{variable_name}"
print(full)
# WE ARE CALLING THE PRINT FUNCTION

# STRING METHOD EXPLAINED

variable_name = "String" # variable_name is the object
print(variable_name.lower()) # .lower is method
print(variable_name.upper()) # .upper is method
variable_name = " String  "
print(variable_name.strip()) # .strip is method and removes whitespaces
# WE ARE CALLING THE STRIP METHOD

# python is case-sensitive programming language


# NUMBERS

print(10 + 1)
print(10 - 1)
print(10 * 1)
print(10 / 1)
print(10 // 1)
print(10 % 1)
print(10 ** 2)

print(round(2.9))
print(abs(2.9))

# USE MATH MODULE FOR MATH FUNCTIONS, IMPORT FIRST

#import math # math is an object so you can use .methods

rt = "String1"
print(rt[1:4])

print(10 == "10")


# CONDITIONAL STATEMENTS

temp = 2

# CONTROL MOVES TO COLD/ELIF STATEMENT

if temp > 30:
    print("Nice")
elif temp >= 29:
    print("Cold")
else:
    print("Brr")

# LOOPS - RANGE FUNCTION

for number in range(3):
    print("Attempt", number)

successful = False
for number in range(3):
    print("Attempt", number)
    if successful:
        print("Successful")
        break
else:
    print("Not successful")
    
num = 1
while num < 10:
    print(num)
    num += 1


count = 0
for num in range(1, 10):
    if num % 2 == 0:
        count += 1
        print(num)
print(f"We have {count} even numbers")

count = 0
for num in range (1,10):
    if num % 2 == 0:
        count += 1
        print(num)
print(f"We have {count} even numbers")