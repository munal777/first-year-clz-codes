li = [[10,20,3], [2,40,55], [65,60,40]]
min = li[0][0]
max = li[0][0]
for i in range(len(li)):
    for j in range(len(li[i])):
        if min > li[i][j]:
            min = li[i][j]
        if max < li[i][j]:
            max = li[i][j]
print(min)
print(max)
newlist = []
for i in li:
    for j in i:
        if j%2 == 0 and j%5 == 0:
            newlist.append(j)
print(newlist)

