def search(nums,target):
    low = 0
    high = len(nums) - 1

    while low <= high:
        middle = (low+high)//2

        if nums[middle] == target:
            return middle
        
        elif nums[middle] > target:
            high = middle - 1
        
        elif nums[middle] < target:
            low = middle + 1
    
    return -1



arr = [3,5,12,14,20,30]
print(search(arr, 15))
    