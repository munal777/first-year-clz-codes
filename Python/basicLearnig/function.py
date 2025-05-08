def first_name(name): #declaration of function note: here, name is parameters
    print(f"{name} is a student of IIC.")
first_name("Munal") #calling a function note: "Munal" is Arguments

# def student_lists(name1,name2,name3):
#     print(name1+", "+name2+", "+name3)
# student_lists('Numa')
#this will send error message as missing 2 required arguments

#keyword Arguments: we can send arguments with the key = value syntax
def kitchen_items(name1, name2, name3):
    print(name2 + " is most essential things in kitchen.")
kitchen_items(name1= "Gas", name3="Rice Cooker", name2= "Knief") #order of the arguments does not matter

#If the number of arguments is unknown, add a * before the parameter name:
def city_name(*cities):
    print(cities[0]+" is a city of Nepal.")
    print(cities[2]+" is a city of Nepal.")
city_name("Kathmandu", "Pokhara", "Itahari")

#Arbitrary keyword Arguments
def lists(**name):
    print("The  last name of is "+name["l_name"])
lists(f_name= "Munal", l_name= "Poudel")

#defult parameter values
def my_functions(name = "Munal"):
    print(f"My name is {name}.")
my_functions()
my_functions("Namita")

#passing list as an arguments
fruits = ["Apple","Banana","Orange","Mango"]

def food_list(food):
    for x in food:
        print(x)

food_list(fruits)

# return values
def add(a,b,c):
    return a+b+c
result = add(2,3,2)
print(result)

def sub():
    pass


# def check(phone,price,/): note= ,/ after argument allow only positional argument.
# def check(*,phone,price): note= */ before argument allow only keyword argument.
def check(phone,price):
    print("The price of my "+phone+" phone is Rs."+price)
check("Samsung","10000") #positional argument 
check(phone="Redmi",price="50000") #keyword argument

def add_num(*num):
    for x in num:
        print(x)
    return  num[0]+num[1]+num[2]+num[3]
final = add_num(1,2,3,4)
print(final)

def add_names(**kwargs):
    for key, value in kwargs.items():
        print(f"{key} = {value}")
    print(kwargs['name']+" "+kwargs["l_name"]+" lives in "+kwargs["location"])
add_names(name= "Munal",l_name="Poudel",location="itahari")

#using /, berfore positional-only and argument after *, are keyword-only
def positional_key(a,b, /,*, c,d):
    print(a+b+c+d)
positional_key(2,4,d=2,c=3)

def add_num(a, b):
    """Add to Numbers and return the result."""
    return a + b
print(add_num.__doc__) #to print the dogstring

