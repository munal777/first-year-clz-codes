def linearSearch(arr, n, val) :
    #write your code logic 
    for i in range(len(arr)):
        if val == arr[i]:
            return i
    return -1

arr = [2,5,2,4,25]
n = 5
val = 4
print(linearSearch(arr, n, val))
