l = int(input("Enter first Number "))
b = 2
if (l <= 10): area = 2*l*b
else: area = l*b
print(area)

if 5 > 2:
    print("5 is greater then 2")

#type function give us which data type the variable is.
a = 2
print(type(a))

#it will do linespacing 
print()

fruits = ["Apple","Banana","Orange"]
x,y,z = fruits
print(x+y+z)

#in python we can do this it will work same as above
print(x,y,z)

name = "Munal"

def myFunction():
    print("My name is "+name)

myFunction

#mapping type
# bio ={"name":"Munal","Age":21}
bio = dict(name="Jhon",Age=45)
print(bio)

#if else in single line
a= 10
b= 20
print("A") if a == b else print("B")

print("A is equal to B") if a == b else print("A is greater then B") if a > b else print("B is greater")

if not b > a:
    print("b is not greater then a")
else:
    print("b is greater then a")

