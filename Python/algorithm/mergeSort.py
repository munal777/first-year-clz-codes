def merge_sort(arr):
    if len(arr) > 1:
        length = len(arr)
        
        middle = length // 2
        leftarr = arr[:middle]
        rightarr = arr[middle:]

        merge_sort(leftarr)
        merge_sort(rightarr)

        i = j = k = 0

        while i < len(leftarr) and j < len(rightarr):
            if (leftarr[i] < rightarr[j]):
                arr[k] = leftarr[i]
                i += 1

            else:
                arr[k] = rightarr[j] 
                j += 1
            k += 1

        while i < len(leftarr):
            arr[k] = leftarr[i]
            i += 1
            k += 1

        while j < len(rightarr):
            arr[k] = rightarr[j]
            j += 1
            k += 1

arr = [2, 34, 12, 13, 45, 23, 4]
merge_sort(arr)
print(arr)