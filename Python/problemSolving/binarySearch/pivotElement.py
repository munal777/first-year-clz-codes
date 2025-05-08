class Solution(object):
    def search(self, nums):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        l = 0 
        r = len(nums) - 1

        while l <= r:
            mid = (l + r) // 2

            if nums[l] <=  nums[r]:
                return nums[l]
            elif nums[mid] > nums[mid + 1]:
                return nums[mid + 1]
            elif nums[mid - 1] > nums[mid]:
                return nums[mid]
            
            if nums[l] <= nums[mid]:
                l = mid + 1
            else:
                r = mid - 1


obj = Solution()
# nums = [1,2,3,4,-1,0]
nums = [3,1]
print(obj.search(nums))