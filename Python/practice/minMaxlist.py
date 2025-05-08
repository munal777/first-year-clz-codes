li = [25,4,2,45,80,65,90]
min = li[0]
max = li[0]
for i in range(len(li)):
    if min > li[i]:
        min = li[i]
    if max < li[i]:
        max = li[i]
print("Minimum num: ", min)
print("Minimum num: ", max)