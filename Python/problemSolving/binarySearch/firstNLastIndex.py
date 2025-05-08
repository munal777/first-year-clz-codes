class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        left = 0
        right = len(nums) - 1

        starting_index = -1
        ending_index = -1

        if target in nums:
            while left <= right:
                mid = ((left+right)//2)

                if nums[mid] == target:
                    if target in nums[:mid]:
                        for i in range(mid):
                            if nums[i] == target:
                                starting_index = i
                                break
                    else:
                        starting_index = mid

                    if target in nums[mid:]:
                        for i in range(len(nums)-1,mid-1,-1):
                            if nums[i] == target:
                                ending_index = i
                                break

                    arr = [starting_index,ending_index]
                    return arr
                
                elif nums[mid] > target:
                    right = mid - 1
                elif nums[mid] < target:
                    left = mid + 1 
        
        arr = [starting_index,ending_index]
        return arr
    
    # def searchRange(self, nums, target):
    #     """
    #     :type nums: List[int]
    #     :type target: int
    #     :rtype: List[int]
    #     """
    #     def binary_search(nums, target, is_searching_left):
    #         left = 0
    #         right = len(nums) - 1
    #         idx = -1
            
    #         while left <= right:
    #             mid = (left + right) // 2
                
    #             if nums[mid] > target:
    #                 right = mid - 1
    #             elif nums[mid] < target:
    #                 left = mid + 1
    #             else:
    #                 idx = mid
    #                 if is_searching_left:
    #                     right = mid - 1
    #                 else:
    #                     left = mid + 1
            
    #         return idx
        
    #     left = binary_search(nums, target, True)
    #     right = binary_search(nums, target, False)
        
    #     return [left, right]

obj = Solution()
arr = [5,7,7,8,8,10]
print(obj.searchRange(arr,8))