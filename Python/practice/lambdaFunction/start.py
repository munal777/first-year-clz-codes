square = lambda x: x*x
print('Square num:',square(5))

sum = lambda x,y: x+y
print('Sum of x and y:',sum(10,12))

oldList = [2,4,11,13,16,21,40]

#filter function will take two arguments where first is function and second is list,tuple or set

newList = list(filter(lambda x: x%2 != 0, oldList))  #make list of odd num by using lambda function
print(newList)

def my_function(li):
    return li%2 == 0

newList2 = tuple(filter(my_function,oldList)) #making tuple of even number by using noraml function 
print(newList2)

mixed_list = [0,1,[],{},False,True,'','Munal']
filter_list = list(filter(None,mixed_list)) #using None in the place of function and it remove all the False in boolean like(0,None,False,[],"")

print(filter_list)

#map method is similar like filter but it can have more then one iterable
list_1 = [2,4,8]
list_2 = [4,7,10]

new_sumed_list = list(map(lambda x,y: x + y,list_1,list_2))
print(new_sumed_list)

def square(num):
    return num *num

square_num_list = list(map(square,list_1))
print(square_num_list)

#use of lambda function in normal function
def my_func(x):
    return lambda a : a*x

one = my_func(10) #first adding the value of x that for normal function argument
print(one(2)) #adding 2 as a to multiple with an arguments of normal function
print(one(5))

is_100 = lambda x: "Yes it is above it" if x>100 else "No it is not above it"
print(is_100(100))