class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        s = len(nums)
        for i in range(s):
            for j in range(i+1,s):
                if nums[i]+ nums[j] == target:
                    s = list((i,j))
                    return s


x = [2,5,5,11]
t = 10
obj = Solution()
print(obj.twoSum(x,t))