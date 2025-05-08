if __name__ == '__main__':
    records = []
    
    for _ in range(int(input())):
        name = input()
        score = float(input())
        records.append([name, score])
    
    if records[0][1] < records[1][1]:
        lowest = records[0][1]
        second_lowest = records[1][1]

    elif records[1][1] < records[0][1]:
        lowest = records[1][1]
        second_lowest = records[0][1]
    
    else:
        lowest = records[0][1]
        second_lowest = float('inf')

    for i in range(2,len(records)):
        if lowest > records[i][1]:
            second_lowest = lowest
            lowest = records[i][1]
        
        elif second_lowest > records[i][1] > lowest:
            second_lowest = records[i][1]
        
        elif lowest < records[i][1] and second_lowest == float('inf'):
            second_lowest = records[i][1]


    name_of_2nd_lowest = []
    for i in range(len(records)):
        if records[i][1] == second_lowest:
            name_of_2nd_lowest.append(records[i][0])

    n = len(name_of_2nd_lowest)
    for i in range(n):
        for j in range(n - i - 1):
            if name_of_2nd_lowest[j] > name_of_2nd_lowest[j+1]:
                name_of_2nd_lowest[j],name_of_2nd_lowest[j+1] = name_of_2nd_lowest[j+1],name_of_2nd_lowest[j]

    for i in name_of_2nd_lowest:
        print(i)









# li = [21,32,7,64,40]
# for i in range(len(li)):
#     for j in range(len(li)-i-1):
#         if li[j] < li[j+1]:
#             li[j],li[j+1] = li[j+1],li[j]

# print(li)




# li_1 = [1,2,3]
# li_2 = [4,5,6]
# zipped = list(zip(li_1,li_2))
# list_1 = []
# for i in zipped:
#     li = list(i)
#     list_1.append(li)
# print(list_1)