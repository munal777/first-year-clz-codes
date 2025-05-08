def maxSum(nums,k):
    max = 0
    l = 0
    r = 0
    sumed = 0
    while r < len(nums):
        window_slide = (r - l) + 1
        sumed += nums[r]
        if window_slide == k:
            if sumed > max:
                max = sumed
            sumed = sumed - nums[l]
            l += 1
            r += 1
        else:
            r += 1
    return max

arr = [2,7,6,2,4,10]
print(maxSum(arr,3))