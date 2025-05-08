class Solution(object):
    def pivot_element(self, nums):
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
                return l
            elif nums[mid] > nums[mid + 1]:
                return mid + 1
            elif nums[mid - 1] > nums[mid]:
                return mid
            
            if nums[l] <= nums[mid]:
                l = mid + 1
            else:
                r = mid - 1

    def binary_search(self,nums,target,l,r):
        while l <= r:
            mid = (l + r) // 2

            if nums[mid] == target:
                return True
            elif nums[mid] > target:
                r = mid - 1
            else:
                l = mid + 1
        return False

    def search(self, nums, target):
        pivot = self.pivot_element(nums) 

        if nums[0] <= target < nums[pivot - 1]:
            return self.binary_search(nums, target, 0, pivot - 1)
        else:
            return self.binary_search(nums, target, pivot, len(nums) - 1) 

        
    #------- Second approach -------



obj = Solution()
nums = [1,0,1,1,1]
print(obj.search(nums,2))
