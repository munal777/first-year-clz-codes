def twoSum(nums,target):
    nums.sort()
    l = 0
    r = len(nums) - 1

    while l < r:
        sumed = nums[l] + nums[r]

        if sumed == target:
            return [nums[l],nums[r]]
        elif sumed > target:
            r -= 1
        else:
            l += 1

nums = [3,2,4]
print(twoSum(nums,6))
