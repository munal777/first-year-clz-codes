#week 6 ques 1
# def checkList(li):
#     for i in li:
#         num = [i for i in li if i%2 == 0 and i%3 == 0]
#     return num

# a = [2,3,6,9,12,15,18,24,22,33,112]

# print(checkList(a))


#Ques 2
# def even_position_list(a):
#     new_li = []
#     for i in range(len(a)):
#         n = i + 1
#         if n%2 == 0:
#             new_li.append(a[i])
#     return new_li

# li = [43,23,21,44,56,75]

# print(even_position_list(li))


#ques 3
# def combine_list_by_alternative(a,b):
#     new_li = []
#     for i in range(len(a)):
#         new_li.append(a[i])
#         new_li.append(b[i])
#     return new_li

# a = ["a","b","c"]
# b = [1,2,3] 
# print(combine_list_by_alternative(a,b))


#ques 4
# def lists_sum(a,b):
#     sumed_list = []
#     for i in range(len(a)):
#         sum = a[i] + b[i]
#         sumed_list.append(sum)
#     return sumed_list

# a = [1,2,3,4,5,6]
# b = [1,2,3,4,5,6]

# print(lists_sum(a,b))

#ques 5
# def sort_list(a):
#     for i in range(len(a)-1):
#         for j in range(len(a)-i-1):
#             if a[j] > a[j+1]:
#                 a[j], a[j+1] = a[j+1], a[j]
#     return a
# li = [20,12,45,30,5]

# print(sort_list(li))

