def closest_sum(nums):
    nums.sort()
    l = 0
    r = len(nums) - 1
    close_sum = nums[l] + nums[r]

    while l < r:
        next_sum = nums[l] + nums[r]

        if next_sum == 0:
            return 0

        if abs(close_sum) > abs(next_sum):
            close_sum = next_sum
        
        if next_sum > 0:
            r -= 1
        else:
            l += 1
    
    return close_sum

    # max_sum = nums[0] + nums[1]
    # for i in range(len(nums)):
    #     for j in range(i+1,len(nums)):
    #         sums = nums[i] + nums[j]
    #         if abs(max_sum) > abs(sums):
    #             max_sum = sums
    # return max_sum

nums = [1, 60, -10, 70, -80, 85]
print(closest_sum(nums))
