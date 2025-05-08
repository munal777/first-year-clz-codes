my_str = (input("Enter a strings: "))
n = len(my_str)
my_dict={}
for i in my_str:
    if i in my_dict:
        my_dict[i] += 1
    else:
        my_dict[i] = 1

print(my_dict)

