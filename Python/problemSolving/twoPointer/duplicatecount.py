class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        l = 0
        for r in range(1,len(nums)):
            if nums[l] != nums[r]:
                l += 1
                nums[l] = nums[r]
        return l + 1
        
        # i = 0
        # while i < len(nums) - 1:
        #     if nums[i] == nums[i + 1]:
        #         nums.pop(i)
        #     else:
        #         i += 1
        # return len(nums)
obj = Solution()
nums = [0,0,1,1,1,2,2,3,3,4]
print(obj.removeDuplicates(nums))