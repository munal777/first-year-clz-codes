class Solution(object):
    def findPeakElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # left = 0 
        # right = len(nums) - 1
        

        # while left<=right:
        #     mid = (left + right) // 2

        #     if len(nums) == 1:
        #         return 0
        #     elif mid == 0:
        #         if nums[mid] < nums[mid + 1]:
        #             return mid + 1
        #         else:
        #             return 0
        #     elif mid == len(nums) - 1:
        #         return mid
        #     elif nums[mid] > nums[mid-1] and nums[mid] > nums[mid+1]:
        #         return mid
        #     elif nums[mid] > nums[mid-1]:
        #         left = mid + 1
        #     else: 
        #         right = mid - 1

        l, r = 0, len(nums) - 1

        while l < r:
            mid = (r - l) // 2 + l  # This is correct, it calculates the mid safely

            # Check the relationship between nums[mid] and nums[mid + 1]
            if nums[mid] > nums[mid + 1]:
                # Peak might be on the left side (including mid)
                r = mid
            else:
                # Peak is on the right side (excluding mid)
                l = mid + 1
                
        return l

obj = Solution()
# nums = [1,2,3,1]
nums = [1,2,3,5,6,4]
# nums = [1,2]
print(obj.findPeakElement(nums)) 