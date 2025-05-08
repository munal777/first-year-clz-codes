# #ques1
# i = 5
# while i >= 1:
#     print(i)
#     i -=1
# i = 1

# #ques2
# while i <= 100:
#     print(i)
#     i+=1

# #ques3
# num = int(input("enter a number: "))
# i = 1
# while i <= 10:
#     result= num * i
#     print(f"{num} X {i} = {result}")
#     i +=1

# ques4
# nums = [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
# i = 0
# while i < len(nums):
#     print(nums[i])
#     i += 1
# count = 1
# while count <=10:
#     print(count**2)
#     count += 1

#ques5
# nums = (1, 4, 9, 16, 25, 36, 49, 64, 81, 100)
# x = 81
# i = 0
# while i < len(nums):
#     if x == nums[i]:
#         print(f"{x} is in index {i}")
#         print(x,"is in index",i)
#         break
#     else:
#         print("finding...")
#     i +=1

#ques6
# i = 0
# while i <=5:
#     if i == 3:
#         i +=1
#         continue
#     print(i)
#     i += 1

# i = 1
# while i <=10:
#     if i%2 != 0:
#         i +=1
#         continue
#     print(i)
#     i +=1

# for loop  ques

# nums =[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
# i = 0
# for i in nums:
#     if i == 64:
#         print("found")
#         break
#     print(i)
# else:
#     print("ended")

# nums =[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
# i = 0
# x = 49
# for el in nums:
#     if el == x:
#         print("found in index", i)
#         break
#     i += 1

#printing list from backward index
# li = [2,3,4,45,23]
# li.append(19)
# for i in range(len(li)-1,-1,-1): #start from: length-1,end at 0 index , decrement by 1
#     print(li[i])

# #cheak the user input number is even or odd
# a = int(input("Enter Number: "))

# if a%2==0:
#     even = True
# else:
#     even = False

# if even:
#     print("Even Number")
# else:
#     print("Not a even Number")

#removing last index by using for loop
# li = [23,3,12,54,28]
# for i in range(len(li)):
#     li.pop()
#     print(li)

# fruit = ["gddghd","ghgd","ddhdg","gg"]
# for i in fruit:
#     print(i.upper())
# [print(i.upper()) for i in fruit] #printing by using looping comprehension
# newlist = [(i.upper()) for i in fruit]
# print(newlist) 

# for item in "program":
#     print(item)



