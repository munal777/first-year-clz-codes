#list

#creting a list() constructor to create new list
thislist = list(("Suresh","Gaurab","Solomon","Udwesh"))
print(thislist)

name = ["Munal","Suresh","Namita",True,"Bibek",7]
print(type(name))
print(len(name))
print(name)

#print with specific index where negtive starts from end -1 is last item & -2 refers secnd last
print(name[0])
print(name[-1]) # 7
print(name[-6]) # Munal

#range of index it start from 1 index to 3 index note: it will not include 4 index
print(name[1:4])
print(name[:2]) #start from 0 index to 1 index
print(name[3:]) #note: start from 3 index to end index
print(name[-6:-3]) #negtive index start with -1 this print from index -6 to index -4
if "Namita" in name:
    print("Yes, 'Namita' is in the name list.")
else:
    print("No")

#change the exiting values
name[5]="Changed"
name[:3]=[True,7.0,"Nanu"]
name[-3:-2]=["GF","BF"] #changing one item with 2 item
name[1:5]=["love"] #it will replace with only one index from index 1 to index 4
print(name)
print(len(name))

mylist = ["Watch","Phone","bag","bag"]
#using insert method to add in 1 index
mylist.insert(1,"Earphone")

#using append method to add in end
mylist.append("Suncream")
print(mylist)

#using extends method to another list to the current in the end of list
name.extend(mylist)
print(name)

#using remove method to remove 
mylist.remove("bag") #remove only first bag item from mylist because mylist have 2 bag items

#using pop method to remove with specific index
mylist.pop(1) 
mylist.pop() #this will remove last item 

#using del keyword to remove
del mylist[0]
print(mylist)

#loop through list
vehicle =["Bus","Car","Van","Bike"]
for x in vehicle:
    print(x)

vehicle.append("Auto")
i = 0
while (i < len(vehicle)):
    print(vehicle[i])
    i=i+1

print()
for i in range(len(vehicle)):
    print(vehicle[i])

for i in range(1,4): #this will print from index 1 to index 3
    print(vehicle[i])

print()

#looping comprehension
[print(x) for x in vehicle]

my_fruits = ["Apple","Banana","Orange","litchi",]

[print(i) for i in my_fruits]

my_list = []
for i in my_fruits:
    if "a" in i:
        my_list.append(i)
print(my_list)

#looping comprehension example to exeucate same as above in single line
my_example = [i for i in my_fruits if "a" in i]
print(my_example)

sort_list = ["munal","namita","suresh","debit","gaurab"]
sort_list.sort() #method will sort the list in alphabetcal order
print(sort_list)

sort_list.append("raga")
sort_list.insert(3,"banana")
sort_list.sort( reverse= True) #sort in desending if reverse = True
print(sort_list)

names = ["munal","Namita","suresh","debit","Gaurab"]
names.reverse()
print(names)

names.sort() #sort method is case-sensative, resulting in all capital letters being sorted before lower case letters
print(names)

names.sort(key=str.lower)
print(names)

print("-----   New Line   ------")

#copy list method
list_name = names.copy()
print(list_name)

list2_name = list(names)
print(list2_name)

#reverse slicing
num_list = [1,2,3,4,5,6]
rev_list = num_list[::-1] 
# rev_list = num_list[4:0:-1] 
print(rev_list) 