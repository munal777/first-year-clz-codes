# def sum_of_list(li):
#     sum = 0
#     for i in li:
#         sum += i
#     print(sum)
# lists = [1,2,3,4,5]
# sum_of_list(lists)

#ques 2: find maximum num from list
# def find_max(lst):
#     max = lst[0]
#     for i in range(1,len(lst)):
#         if lst[i] > max:
#             max = lst[i]
#     print(max)  

# li = [1,2,8,4,5]
# find_max(li)  

#ques 3: reverse the list
# def reverse_list(lst):
#     li = []
#     for i in range(len(lst)-1,-1,-1):
#         li.append(lst[i])
#     print(li)

my_li = [1,2,3,4,5]
# reverse_list(my_li)   

n = my_li[::-1]
print(n)