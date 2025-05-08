def bubble_sort(arr=[(1,3), (4,1), (5,2), (6,4)]):
    for i in range(len(arr)):
        swap = False
        for j in range(len(arr) - i - 1):
            if arr[j][1] > arr[j+1][1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
                swap = True
        if not swap:
            break


arr = [(1,3), (4,1), (5,2), (6,4)]

bubble_sort(arr)
print(arr)