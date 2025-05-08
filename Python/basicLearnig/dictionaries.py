dict_1 = {"Name":  "Munal","student": True,"hobbies":["football,cricket,study"]} #dict can be of any data type
print(dict_1)
print(dict_1["Name"])
print(dict_1["hobbies"])
print(dict_1.get("hobbies"))

dict_1["collage"] = "IIC" #adding new value in college key
print(dict_1.update({"location": "itahari"})) #adding new items with update method
print(dict_1.keys()) #returns keys names

dict_1["lazy"] = dict_1.pop("student") #replacing old key student with new key  lazy
print(dict_1)

print(dict_1.values()) #returns values names

print(dict_1.items()) #it will convert each items into tuples in a list.

dict_1["Name"] =  "Namita" #changing the value of Name
print(dict_1.update({"lazy": False})) #changing value by using update method
print(dict_1)

print("Yes")  if "Name" in dict_1 else print("No")

dict_1.pop("lazy") #removing the key details having named as lazy
print(dict_1)

dict_1.popitem() #remove the last inserted items of dict
print(dict_1)

del dict_1["hobbies"] #del keyword is also used to remove items by specified keyword
print(dict_1)

# del dict_1 #del  keyword  is used  to remove whole dict as well

for i in dict_1: #loop to print keys
    print(i)

for i in dict_1: #loop to print values
    print(dict_1[i])

for i in dict_1.keys():
    print(i)

for i in dict_1.values():
    print(i)

for i,j in dict_1.items():
    print(i,j)