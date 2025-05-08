# class Random:
#     def convert_to_dict():
#         list1 = [1,2,3,4]
#         str1 = 'abcd'
#         dict1 = {}
#         for i in range(len(list1)):
#             dict1[list1[i]] = str1[i]

#         return dict1
    
#     print(convert_to_dict())

list1 = []
for _ in range(int(input())):
    name = input('enter a name:')
    score = float(input('enter a marks:'))
    list2 = [name,score]
    list1.append(list2)

mark_list = []
for i in list1:
    print(i)
    print(len(i))
    for j in range(len(i)):
            mark_list.append(list1[i][j])


    
print(list1)
print(mark_list)