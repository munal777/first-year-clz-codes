class Solution:
    def findMedianSortedArrays(self, nums1, nums2):
        merged_array = []

        for i in nums1:
            merged_array.append(i)
        
        for i in nums2:
            merged_array.append(i)

        def sort_array(arr=merged_array):
            if len(arr) > 1:
                middle = len(arr)//2

                left_array = arr[:middle]
                right_array = arr[middle:]

                sort_array(left_array)
                sort_array(right_array)

                i = j = k = 0

                while i < len(left_array) and j < len(right_array):
                    if left_array[i] < right_array[j]:
                        arr[k] = left_array[i]
                        i += 1
                    
                    else:
                        arr[k] = right_array[j]
                        j += 1
                    
                    k += 1

                while i < len(left_array):
                    arr[k] = left_array[i]
                    i += 1
                    k += 1
                
                while j < len(right_array):
                    arr[k]  = right_array[j]
                    j += 1
                    k += 1
        
        sort_array(merged_array)
        
        if len(merged_array)%2 == 0:
            middle = len(merged_array)//2
            mid_arr = merged_array[middle-1:middle+1]
            x = sum(mid_arr)/2
            return round(x,5)

        else:
            middle = len(merged_array)// 2
            middle_value = merged_array[middle]
            rounded_value = float(round(middle_value, 5))
            return  rounded_value


nums1 = [1,3]
nums2 = [2]  
x = Solution()
abc = x.findMedianSortedArrays(nums1,nums2)      
print(abc)
