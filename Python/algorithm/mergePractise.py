def sort_array(arr):
    if len(arr) > 1:
        
        middle = len(arr) // 2
        left_arr = arr[:middle]
        right_arr = arr[middle:]

        sort_array(left_arr)
        sort_array(right_arr)

        i = j = k = 0

        while  i < len(left_arr) and j < len(right_arr):
            left= str(left_arr[i])
            right = str(right_arr[j])

            if len(left) < len(right):
                arr[k] = left_arr[i]
                i += 1
            else:
                arr[k] = right_arr[j]
                j += 1
            k += 1

        while i < len(left_arr):
            arr[k] = left_arr[i]
            i += 1
            k += 1

        while  j < len(right_arr):
            arr[k] = right_arr[j]
            j += 1
            k += 1


# # arr = [90, 23, -23, 45, 5, 4.8, 67, -12, 5, 89, 4.9, 34, 2]
# arr = ["apple", "banana", "grape", "kiwi", "watermelon", "cherry"]
arr = [4, "apple", 2, "banana", 5, "cherry"]
sort_array(arr)
print(arr)