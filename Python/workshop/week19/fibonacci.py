li = [0,1]
num = int(input("enter a num: "))
for i in range(1,num+1):
    print(li[0])
    sum = li[0] + li[1]
    li[0] = li[1]
    li[1] = sum
