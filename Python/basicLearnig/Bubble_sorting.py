# def my_function(arr):
#     for i in range(len(arr)):
#         for j in range(0,len(arr) - i - 1):
#             if arr[j] > arr[j + 1]:
#                 arr[j], arr[j + 1] = arr[j + 1], arr[j]

def fund(arr):
    for i in range(len(arr)):
        for j in range(len(arr)-i-1):
            if arr[j] > arr[j+1]:
                arr[j],arr[j+1] = arr[j+1],arr[j] 

num = [45,23,34,64,94,8]
# print(num)
# my_function(num) #putting list in fuction and after function execution the belowis the result of the function 
# print("sorting in ascending order: ", num)


#another way to do it by swaping if the list is already sorted and terminate early, improving efficiency and reducing unnecessary iterations.
# def my_function(arr):
#     for i in range(len(arr)):
#         swap = False
#         for j in range(0,len(arr) - i - 1):
#             if arr[j] < arr[j + 1]:
#                 arr[j], arr[j + 1] = arr[j + 1], arr[j]
#                 swap = True
            
#         if not swap:
#             break


# num = [45,23,34,64,94,8]
# my_function(num) #putting list in fuction and after function execution the below is the result of the function 
# print("sorting in ascending order: ", num)

