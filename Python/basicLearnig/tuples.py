# first_tuple = (1,2,3,1,5)
# print(first_tuple)
# for i in first_tuple:
#     print(i)

# print(first_tuple[-5:-1])

# second_tuple =  ("munal",) #genetaing one element tuple , is needed in the end
# print(type(second_tuple))

# this_tuple = tuple((1,2,3,2)) #using tuplle constructor to create tuple
# print(this_tuple)

#as tuple value is unchangeable we can change by this process
# third_tuple =("Namita","Munal","Numa")
# my_list = list(third_tuple)
# my_list[1] = "Vai"
# third_tuple = tuple(my_list)
# print(third_tuple)

# Tuple_li = (2,4,2,5,3)
# my_lists = list(Tuple_li)
# print(my_lists)
# my_lists[0] = 1
# my_lists.append("Munal") 
# print(my_lists)
# Tuple_li = tuple(my_lists)
# print(Tuple_li)

# Tuple_li2 = ("Gaurab",)
# print(Tuple_li2)

# Tuple_li2 += Tuple_li #adding tuple with another tuple
# print(Tuple_li2)

# forth_tuple = (2,5,"Munal")
# (even,odd,name)  = forth_tuple #making variable of tuple element
# print(even)
# print(odd)
# print(name)

# fifth_tuple = (2,3,"Namita","Numa","Suresh")
# (num1,num2,*names) = fifth_tuple # if we don't assign all variable of tuple,we can add * and make variable as list
# print(num1)
# print(num2)
# print(names) #print as list

# my_lists = list(fifth_tuple)
# my_lists.append(8)
# fifth_tuple = tuple(my_lists)
# print(fifth_tuple)
# (odd,even,*names,num3) = fifth_tuple #num3 will carry last element 
# print(names)

#join tuple
my_tuple1 = (1,2,3)
my_tuple2 = (4,5,6)
result_tuple = my_tuple1 + my_tuple2 #adding two tuples
print(result_tuple)

multiple_tuple = my_tuple1 * 2 #multipling tuple
print(multiple_tuple)

numbers = (2,2,4,5)
# x = numbers.count(2) #count the varible how many times it is been initlized
print(numbers.count(2))

