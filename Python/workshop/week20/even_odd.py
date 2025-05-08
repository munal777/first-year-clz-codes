# my_list = [1,3,7,6,12]
# odd = []
# even = []

# for i in range(len(my_list)):
#     if my_list[i]%2 == 0:
#         even.append(my_list[i])
#     else:
#         odd.append(my_list[i])
# print(odd)
# print(even)

for i in range(0,1):
    for j in range(0,5):
        print(j,end=" ")
    print()
    for k in range(4,-1,-1):
        print(k,end=" ")
print()
lists = [1,2,3,4]
li = []
for i in range(len(lists)-1):
    # print("first three element: ",lists[i])
    li.append(lists[i])
print(li)
for i in range(len(lists)):
    if i == 3:
        print("last element: ",lists[i])
for i in range(len(lists)):
    if i == 0:
        print("First element: ",lists[i])
for i in range(1,len(lists)):
    print("last three element: ",lists[i])

#write a program to decreae a value of element of list lists
new_list = []
for i in range(len(lists)):
    new_list.append(lists[i] - 1)
print(new_list)


    
         


    
