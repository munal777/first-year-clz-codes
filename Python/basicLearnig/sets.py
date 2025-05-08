# my_set = {2,3,4}
# print(3 not in my_set)

# thisset = set(("Munal","Namita")) #creating constructor of set note: double-round bracket
# print(thisset)
# thisset.add("Numa") #adding by using add method
# thisset.remove("Munal") #removing 
# print(thisset)

# new_set = {True,5,'M'}
# new_set.update(thisset) #adding to sets by using update mathod
# print(new_set)

# new_list = [4,1,"Phone"]
# new_set.update(new_list) #we can update any iterable object like list,tuple and dictionaries etc.
# new_set.discard(False) #discard method is also to remove but if the elements does not exit it will not raise an error
# print(new_set)

# fruits = {"apple","banana","mango"}
# x = fruits.pop() #pop method remove any item randomly
# print(x)
# print(fruits)

# clear_set = fruits.clear() #it will remove all the items and make empty set
# print(clear_set) 

# set_1 = {1,2,3,4,5,6}
# set_2 = {1,3,5,7,9}

# set_3 = set_1.union(set_2) #return union of two set as a new set and can do with other data type like tuple,list,dictionaries
# # set_3 = set_1 | set_2 #using bitwise OR wil give same result as union
# print(set_3)

# set_4 = set_1.intersection(set_2) #return intersection of two set as new set 
# # set_4 =  set_1 & set_2 #return intersection of sets only not with other data type list,tuple,dictionaries
# print(set_4)

# # set_1.intersection_update(set_2) #update the set with itself and another and stored result in itself.
# set_1 &= set2
# # print(set_1)

# set_5 = set_2.difference(set_1) #return the items of set_2 which is difference from set_1
# # set_5 = set_2  - set_1
# print(set_5)

# set_6 = set_1.symmetric_difference(set_2) #retuen all differance items of sets
# set_6 = set_1 ^ set_2 #using XOR operator to return the difference items of sets into new set
# print(set_6)

my_set = {1,2,4}
my_list = [1,2,3,4,5]
set_a = {1,2,3,4}

new_set = my_set.isdisjoint(my_list) #return False because we have 1,2 as intersection but return True it null intersetion
print(new_set)

print(my_set.issubset(my_list)) #return True as my_subsets is subset of my_list

print(set_a.issuperset(my_set)) #return True as set_a has all items which is in another set
print(set_a >= my_set)

print(my_set.issuperset(set_a)) #return False as my_set has not all items which is in another set


