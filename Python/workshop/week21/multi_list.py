list1 = [[24, 3, 6],[8, 12, 18],[2, 66, 7]]
mylist = []
for i in list1:
    for j in i:
        # if list1[i][j]%2 == 0 and list1[i][j]%3 == 0:
        if j%2 == 0 and j%3 == 0:
            mylist.append(j)
print(mylist)
newlist = []
min = list1[0][0]
max = list1[0][0]
for i in list1:
    for j in i:
        if min > j:
            min = j
        
        if max < j:
            max = j
print(min)
print(max)
   
       

