# class Sep16:

    # def second_highest(li):
        

    #     if li[0] > li[1]:
    #         highest = li[0]
    #         second_highest = li[1]
        
    #     else:
    #         second_highest = li[0]
    #         highest = li[1]

    #     for i in range(2,len(li)):
    #         if highest < li[i]:
    #             second_highest = highest
    #             highest = li[i]

    #         elif second_highest < li[i]:
    #             second_highest = li[i]

    #     return highest, second_highest
    
    # x = [12,19,9,5,40,45]
    # print(second_highest(x))

# def third_lowest(li):
#     if li[0] < li[1] and li[1] < li[2]:
#         lowest = li[0]
#         second_lowest = li[1]
#         third_lowest = li[2]

#     elif li[2] < li[1] and li[1] < li[0]:
#         lowest = li[2]
#         second_lowest = li[1]
#         third_lowest = li[0]

#     elif li[1] < li[0] and li[0] < li[2]:
#         lowest = li[1]
#         second_lowest = li[0]
#         third_lowest = li[2]

#     elif li[1] < li[2] and li[2] < li[0]:
#         lowest = li[1]
#         second_lowest = li[2]
#         third_lowest = li[0]

#     elif li[0] < li[2] and li[2] < li[1]:
#         lowest = li[0]
#         second_lowest = li[2]
#         third_lowest = li[1]

#     else:
#         lowest = li[2]
#         second_lowest = li[0]
#         third_lowest = li[1]

#     for i in range(3,len(li)):
#         if lowest > li[i]:
#             third_lowest = second_lowest
#             second_lowest = lowest
#             lowest = li[i]

#         elif second_lowest > li[i]:
#             third_lowest = second_lowest
#             second_lowest = li[i]

#         elif third_lowest > li[i]:
#             third_lowest = li[i]



#     return lowest, second_lowest, third_lowest

# z = [6,20,12,45,15,10,55,5]
# print(third_lowest(z))

# if __name__ == '__main__':
#     N = int(input())
#     new_list = []
#     for _ in range(N):
#         inputs = input().split()
#         if inputs[0] == "insert":
#             new_list.insert(int(inputs[1]), int(inputs[2]))
#         elif inputs[0] == "print":
#             print(new_list)
#         elif inputs[0] == "remove":
#             new_list.remove(int(inputs[1]))
#         elif inputs[0] == "append":
#             new_list.append(int(inputs[1]))
#         elif inputs[0] == "sort":
#             new_list.sort()
#         elif inputs[0] == "pop":
#             new_list.pop()
#         elif inputs[0] == "reverse":
#             new_list.reverse()

# nam = 'q w e r t y u i o p a s d f g h j  k l z x c v b n m Q W E R T Y U I O P A S D F G H J  K L Z X C V B N M'

# li = nam.split()
# update_li = []
# for i in li:
#     update_li.append(i.capitalize())

# update_nam = " ".join(update_li)
# print(update_nam)

# str = 'munal23'
# new_str = ''
# for i in str:
#     if i.isalpha():
#         new_str += i

# print(new_str)

# class Solution(object):
#     def twoSum(self, nums, target):
#         """
#         :type nums: List[int]
#         :type target: int
#         :rtype: List[int]
#         """
#         s = len(nums)
#         for i in range(s):
#             for j in range(i+1,s):
#                 if nums[i]+ nums[j] == target:
#                     s = list((i,j))
#                     return s


# x = [2,5,5,11]
# t = 10
# obj = Solution()
# print(obj.twoSum(x,t))

# str = 'munal'
# print(str[0:1])
# print(str[0:5])

# def minon_game(s = 'banana'):
#     plyer1 = 0
#     plyer2 = 0

#     for i,char in enumerate(s):
#         count_substring = len(s) - i
        
#         if char in 'aeiou':
#             plyer1 += count_substring
#         else:
#             plyer2 += count_substring
        
#     if plyer1 == plyer2:
#         print('Draw')
#     elif plyer1 > plyer2:
#         print('player 1 win.', plyer1)
#     else:
#         print('player 2 win.', plyer2)


# minon_game()

# class Solution(object):
#     def addTwoNumbers(self, l1, l2):
#         """
#         :type l1: ListNode
#         :type l2: ListNode
#         :rtype: ListNode
#         """
#         for i in l1,l2:
#             start = 0
#             end = len(i) - 1

#             while start < end:
#                 i[start],i[end] = i[end],i[start]

#                 start += 1
#                 end -= 1
        
#         l1_str = ''.join(map(str,l1))
#         l2_str = ''.join(map(str,l2))

#         sum_str = str(int(l1_str) + int(l2_str))

#         reverse_str = sum_str[::-1]

#         output_li = []
#         for i in reverse_str:
#             output_li.append(int(i))
        
        
#         return output_li

# l1 = [0]
# l2 = [0]
# obj = Solution()
# print(obj.addTwoNumbers(l1,l2))


# string = '123'
# string2 = '123'

# if 1 <= len(string) <= 200 and 1 <= len(string2) <= 200 and string.isdigit() and string2.isdigit():

# class Solution(object):
#     def containsDuplicate(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: bool
#         """
#         store_nums = []
#         if 1 <= len(nums) <= 10**5:
#             boolean = False
#             # for i in range(len(nums)-1):
#             #     if -10**9 <= nums[i] <= 10**9:
#             #         for j in range(i+1,len(nums)):
#             #             if nums[i] == nums[j]:
#             #                 boolean = True
#             #                 break
#             for i in nums:
#                 if not i in store_nums:
#                     store_nums.append(i)

#                 elif i in store_nums:
#                     boolean = True

#         return boolean

# obj = Solution()
# num = [2, 312 , 121 ,11321,12,1221,2,3123,12121,123131,434]
# print(sorted(num))
# print(obj.containsDuplicate(num))

# class Solution(object):
#     def merge(self, nums1, m, nums2, n):
#         """
#         :type nums1: List[int]
#         :type m: int
#         :type nums2: List[int]
#         :type n: int
#         :rtype: None Do not return anything, modify nums1 in-place instead.
#         """
#         l = m + n
#         if len(nums1) == l:
#             for i in range(len(nums1)):
#                 if nums1[i] == m:

# li = [2,21,12,0,0]
# li2 = [3,4]

# for i in range(len(li)):
#     if i >= 3:
#         for j in range(len(li2)):
#             li.insert(i,li2[j])
#             li.pop(i+1)
#             j += 1
#             break

# print(li)

# class Solution(object):
#     def reverse(self, x):
#         """
#         :type x: int
#         :rtype: int
#         """
#         if -231 <= x <= 231 - 1:
#             int_to_str = str(x)
#             reverse_int = ''

#             for i in range(len(int_to_str)- 1,-1,-1):
#                 if int_to_str[i].isdigit():
#                     reverse_int += int_to_str[i]
            
#             return reverse_int
#         return 0

# obj = Solution()
# print(obj.reverse(120))

# class Solution(object):
#     def canArrange(self, arr, k):
#         """
#         :type arr: List[int]
#         :type k: int
#         :rtype: bool
#         """
#         rem_li = []

#         for i in range(len(arr)):
#             rem_li.append(arr[i]%k)

#         for i in range(len(arr)):
#             print((k - rem_li[i])//k)
#             # if (k - rem_li[i])/k in rem_li:
#             #     print(rem_li[i])
#         return rem_li
    
# x = Solution()
# arr = [1,2,3,4,5,10,6,7,8,9]
# print(x.canArrange(arr,5))        

# class Solution:
#     def canArrange(self, arr: list[int], k: int) -> bool:
#         count = [0] * k

#         for x in arr:
#             x %= k
#             if x < 0:
#                 x += k
#             count[x] += 1

#         if count[0] % 2 != 0:
#             return False

#         for i in range(1, (k // 2) + 1):
#             if count[i] != count[k - i]:
#                 return False

#         return True
    
# x = Solution()
# arr = [1,2,3,4,5,10,6,7,8,9]
# print(x.canArrange(arr,5))  

# class Solution(object):
#     def removeDuplicates(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: int
#         """
#         dupli_nums = nums
#         k = 0
#         for i in range(len(nums)-1):
#             if nums[i] == dupli_nums[i+1]:
#                 nums.pop(i)
#                 nums.insert(i,'_')
#                 k += 1
#         return k


# class Solution(object):
#     def minLength(self, s):

#         if len(s) != 1:
#             i = 0 
#             while i < len(s) - 1:
#                 substr = s[i] + s[i+1]
#                 if substr == 'AB' or substr == 'CD':
#                     s = s.replace(substr,'')
#                     i = 0

#                 else:
#                     i += 1
            
#         return len(s)

# obj = Solution()
# s = "ACACACACACACACACACACACACACACACACACACACACACACACACACDBDBDBDBDBDBDBDBDBDBDBDBDBDBDBDBDBDBDBDBDBDBDBDBDB"
# print(obj.minLength(s))



# class Solution(object):
#     def searchInsert(self, nums, target):
#         """
#         :type nums: List[int]
#         :type target: int
#         :rtype: int
#         """
#         low = 0
#         high = len(nums) - 1

#         while low <= high:
#             mid = (low + high) // 2

#             if nums[mid] == target:
#                 return mid
#             elif nums[mid] > target:
#                 high = mid - 1
#             elif nums[mid] < target:
#                 low = mid + 1

#         return low

#         # if target in nums:
#         #     for i in range(len(nums)):
#         #         if nums[i] == target:
#         #             return i
#         # else:
#         #     if target > nums[len(nums) - 1]:
#         #         return len(nums)

#         #     for i in range(len(nums)):
#         #         if nums[i] > target:
#         #             return i

# obj = Solution()
# # nums = [1,3,5,6]
# nums = [2,3,5,6]
# print(obj.searchInsert(nums,1))


# class Solution(object):
#     def mySqrt(self, x):
#         """
#         :type x: int
#         :rtype: int
#         """
#         left = 0
#         right = x

#         while left <= right:
#             mid = (left + right) // 2

#             if mid * mid == x:
#                 return mid
#             elif mid * mid > x:
#                 right = mid - 1
#             elif mid * mid < x:
#                 left = mid + 1
        
#         return right

# obj = Solution()
# print(obj.mySqrt(27))





# target = 7
# mid = (len(arr) - 1) // 2
# print(arr[:mid])

# # for i in arr:
# starting_index = -1
# if not target in arr[:mid]:
#     starting_index = mid

# print(starting_index)


# class Solution(object):
#     def search(self, nums, target):
#         """
#         :type nums: List[int]
#         :type target: int
#         :rtype: bool
#         """
#         l = 0
#         r = len(nums) - 1
#         pivot = 0

#         while l <= r:
#             mid = (l + r) // 2
        
            
#             if nums[l] <= nums[r]:
#                 pivot = 0
#                 break
#             elif nums[mid] > nums[mid + 1]:
#                 pivot = mid + 1
#                 break
#             elif nums[mid - 1] > nums[mid]:
#                 pivot = mid
#                 break
#             else:
#                 if nums[l] <= nums[mid]:
#                     l = mid + 1
#                 else:
#                     r = mid - 1
#         if pivot == 0:
#             l = 0
#             r = len(nums) - 1   
#         elif nums[0] <= target <= nums[pivot - 1]:
#             l = 0
#             r = pivot - 1
#         else:
#             l = pivot
#             r = len(nums) - 1
        
#         while l <= r:
#             mid = (l + r) // 2

#             if nums[mid] == target:
#                 return True
#             elif nums[mid] > target:
#                 r = mid - 1
#             else:
#                 l = mid + 1
#         return False
        
# obj = Solution()
# # nums = [5,2]
# nums = [1,0,1,1,1,1]
# print(obj.search(nums,5))



# #=====two pointer=====
# def check_sum(nums,target):
#     l = 0
#     r = len(nums) - 1

#     while l < r:
#         sum = nums[l] + nums[r]
#         if sum == target:
#             return True
#         elif sum > target:
#             r -= 1
#         else:
#             l += 1
#     return False

# nums = [1, 2, 4, 6, 8, 9, 14, 15]


# print(check_sum(nums,30))


# class Solution(object):
#     def findDuplicate(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: int
#         """

#         nums.sort()

#         l = 0
 
#         while l < len(nums)-1:
#             r = l + 1
#             if nums[l] == nums[r]:
#                 return nums[l]
#             else:
#                 l += 1

# obj = Solution()
# nums = [3,1,3,4,2]
# print(obj.findDuplicate(nums))


# class Solution(object):
#     def threeSum(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: List[List[int]]
#         """
#         nums.sort()
#         result = []

#         for i in range(len(nums) - 2):

#             if i > 0 and (nums[i] == nums[i - 1]):
#                 continue

#             first = nums[i]
#             l = i + 1
#             r = len(nums) - 1

#             while l < r:
#                 sec = nums[l]
#                 last = nums[r]
#                 sum = first + sec + last
#                 if sum == 0:
#                     result.append([first,sec,last])
#                     l += 1
#                     r -= 1
#                     while l < r and nums[l] == nums[l - 1]:
#                         l += 1
#                     while l < r and nums[r] == nums[r + 1]:
#                         r -= 1
#                 elif sum > 0:
#                     r -= 1
#                 else:
#                     l += 1
                    
#         return result
    
# obj = Solution()
# nums = [-2, 0, 0, 1, 2, 2]
# print(obj.threeSum(nums))

# class Solution(object):
#     def twoSumClosest(self, nums, target):
#         """
#         :type nums: List[int]
#         :type target: int
#         :rtype: int
#         """
#         nums.sort()

#         l = 0
#         r = len(nums) - 1
#         sumed = nums[l] + nums[r]
#         difference = abs(sumed - target)

#         while l < r:
#             next_sumed = nums[l] + nums[r]
#             current_difference = abs(next_sumed - target)

#             if next_sumed == target:
#                 return target
            
#             if difference > current_difference:
#                 sumed = next_sumed
#                 difference = current_difference
            
#             if  next_sumed < target:
#                 l += 1

#                 while l < r and nums[l] == nums[l - 1]:
#                     l += 1

#             elif next_sumed > target:
#                 r -= 1
                
#                 while l < r and nums[r] == nums[r + 1]:
#                     r -= 1
#         return sumed
                

# obj = Solution()
# nums = [1,2,2,3,9,10]
# print(obj.twoSumClosest(nums, 7))


# class Solution(object):
#     def longestConsecutive(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: int
#         """
#         n = len(nums) - 1
#         store = {}

#         for i in range(n):
            
        
#         return strack

# obj = Solution()
# nums = [100,4,200,1,3,2]
# print(obj.longestConsecutive(nums))

# class Solution(object):
#     def fourSum(self, nums, target):
#         """
#         :type nums: List[int]
#         :type target: int
#         :rtype: List[List[int]]
#         """
#         nums.sort()
#         n = len(nums) - 1
#         arr = []

#         for i in range(n - 2):
#             if i > 0 and nums[i] == nums[i - 1]:
#                 continue
#             for j in range(i+1,n-1):
#                 if j > (i + 1) and nums[j] == nums[j - 1]:
#                     continue
#                 l = j + 1
#                 r = n
#                 while l < r:
#                     fourSum = nums[i] + nums[j] + nums[l] + nums[r]

#                     if fourSum == target:
#                         arr.append([nums[i],nums[j],nums[l],nums[r]])
#                         l += 1
#                         r -= 1
#                         while l < r and nums[r] == nums[r + 1]:
#                             r -= 1
#                         while l < r and nums[l] == nums[l - 1]:
#                             l += 1
#                     elif fourSum > target:
#                         r -= 1
#                     else:
#                         l += 1
#         return arr

# obj = Solution()
# # nums = [-2,-1,-1,1,1,2,2] target 0
# nums = [2,2,2,2]
# print(obj.fourSum(nums, 8))

# nums = [-1,0,1,2,-1,-4] target = -1 expected= [[-4,0,1,2],[-1,-1,0,1]]


# class Solution(object):
#     def isCircularSentence(self, sentence):
#         """
#         :type sentence: str
#         :rtype: bool
#         """
#         n = len(sentence)

#         if sentence[0] != sentence[n - 1]:
#             return False
#         for i in range(1,n - 1):
#             if sentence[i] == ' ':
#                 if sentence[i - 1] != sentence[i + 1]:
#                     return False
        
#         return True

        # result = False
        # n = sentence.split()
        # if len(n) > 1:
        #     l = len(n) - 1
        #     for i in range(l):
        #         sen_l = len(n[i]) - 1
        #         if n[0][0] == n[l][len(n[l])-1] and n[i][sen_l] == n[i + 1][0]:
        #             result = True
        #         else: 
        #             result = False
        #             break
        # else:
        #     if sentence[0] == sentence[len(sentence) - 1]:
        #         result = True
        # return result
# obj = Solution()
# sentence = "ab a a"
# print(obj.isCircularSentence(sentence))

# class Solution(object):
#     def removeElement(self, nums, val):
#         """
#         :type nums: List[int]
#         :type val: int
#         :rtype: int
#         """
#         l = 0   
#         # if len(nums) == 1:
#         #     if nums[0] == val:
#         #         nums.pop(0)
#         # else:
#         while l < len(nums):
#             if nums[l] == val :
#                 nums.pop(l)
#             else:
#                 l += 1
#         return len(nums)

# obj = Solution()
# nums = [0,1,2,2,3,0,4,2]
# # nums = [2]
# print(obj.removeElement(nums,2))     

#ques-3163
# class Solution(object):
#     def compressedString(self, word):
#         """
#         :type word: str
#         :rtype: str
#         """

#         comp = ''

#         for char in word:
#             if char in comp:
#                 count += 1
#                 if comp[-1].isdigit():
#                     num = int(comp[-1])
                    
#                 else:
#                     comp += f'{count}'
#             else:
#                 comp += char
#                 count = 0

# obj = Solution()
# w = "aaaaaaaaaaaaaabb"
# print(obj.compressedString(w))

# class beautifulString:
#     def generater(self,word):
#         self.gen1 = ''
#         self.gen2 = ''
#         for i in range(len(word)):
#             if i%2 != 0:
#                 self.gen1 += '1'
#             else:
#                 self.gen1 += '0'
#             if i%2 == 0:
#                 self.gen2 += '1'
#             else:
#                 self.gen2 += '0'
#         return self.diff()
    
#     def diff(self):
#         gen1 = self.gen1
#         gen2 = self.gen2

#         diff1 = 0
#         diff2 = 0
#         for i in range(len(word)):
#             if gen1[i] != word[i]:
#                 diff1 += 1
#             if gen2[i] != word[i]:
#                 diff2 += 1
        
#         return min(diff1,diff2)
# obj = beautifulString()
# word = '10010101'
# print(obj.generater(word))

# class Solution(object):
#     def minChanges(self, s):
#         """
#         :type s: str
#         :rtype: int
#         """
#         n = len(s)
#         min = 0
#         for i in range(0,n,2):
#             if s[i] != s[i + 1]:
#                 min += 1
#         return min
# obj = Solution()
# s = "1001010000"
# print(obj.minChanges(s))

# num = "10101011110"
# print(len(num))

# class Solution(object):
#     def largestCombination(self, candidates):
#         """
#         :type candidates: List[int]
#         :rtype: int
#         """
#         max_count  = 0
#         for bits in range(32):
#             count = 0
#             for i in candidates:
#                 if i & (1 << bits):
#                     count += 1
        
#             max_count = max(max_count, count)

#         return max_count
        
# obj = Solution()
# candidates = [16,17,71,62,12,24,14]
# # candidates = [8,8]
# print(obj.largestCombination(candidates))


# class Solution(object):
#     def findMin(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: int
#         """
#         l = 0
#         r = len(nums) - 1
#         while l < r:
#             mid = (l + r)//2

#             if nums[mid] > nums[r]:
#                 l = mid + 1
#             else:
#                 r = mid
        
#         return l

# obj = Solution()
# nums = [4, 5, 6, 1, 2, 3]
# print(obj.findMin(nums))


# class Solution(object):
#     def findMin(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: int
#         """
#         n = len(nums) - 1
#         l = 0
#         r = n
#         if nums[0] < nums[n] or len(nums) ==  1:
#             return nums[0]
#         else:
#             while l < r:
#                 mid = (l + r) // 2
#                 if nums[mid] > nums[r]:
#                     l = mid + 1
#                 elif nums[mid] == nums[r]:
#                     r -= 1
#                 else:
#                     r = mid
#         return nums[l]

# obj = Solution()
# # nums = [2,2,2,0,1]
# nums = [2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 1, 2]
# print(obj.findMin(nums))

# def maxSum(nums,k):
#     max = 0
#     l = 0
#     r = 0
#     sumed = 0
#     while r < len(nums):
#         sumed += nums[r]
#         if (r - l) + 1 == k:
#             if sumed > max:
#                 max = sumed
#             sumed = sumed - nums[l]
#             l += 1
#             r += 1
#         else:
#             r += 1
#     return max

# arr = nums = [1,5,4,2,9,9,9]
# print(maxSum(arr,3))

# class Solution(object):
#     def containsNearbyDuplicate(self, nums, k):
#         """
#         :type nums: List[int]
#         :type k: int
#         :rtype: bool
#         """
#         store = set()

#         for i in range(len(nums)):
#             if nums[i] in store:
#                 return True
#             store.add(nums[i])

#             if len(store) > k:
#                 store.remove(nums[i-k])
#         return False
# nums = nums = [98,98]
# k = 2
# # nums = [1,2,3,1,2,3]
# # k = 2
# obj = Solution()
# print(obj.containsNearbyDuplicate(nums, k))



# class Solution(object):
#     def maximumSubarraySum(self, nums, k):
#         """
#         :type nums: List[int]
#         :type k: int
#         :rtype: int
#         """
#         l = 0 
#         maxs = 0
#         sumed = 0
#         sets = set()

#         for r in range(len(nums)):
#             while nums[r] in sets:
#                 sets.remove(nums[l])
#                 sumed -= nums[l]
#                 l += 1
#             sets.add(nums[r])
#             sumed += nums[r]

#             if r-l + 1 == k:
#                 maxs = max(sumed,maxs)
#                 sumed -= nums[l]
#                 sets.remove(nums[l])
#                 l += 1
#         return maxs
# obj = Solution()
# # nums = [1,1,1,7,8,9]
# # k = 3
# nums = [1, 4, 2, 2, 3]
# k = 3
# print(obj.maximumSubarraySum(nums, k))


# class Solution(object):
#     def countGoodSubstrings(self, s):
#         """
#         :type s: str
#         :rtype: int
#         """
#         i = 0 
#         sets = set()
#         count = 0
#         for j in range(len(s)):
#             while s[j] in sets:
#                 sets.remove(s[i])
#                 i += 1
#             sets.add(s[j])
#             if (j-i) + 1 == 3:
#                 if len(sets) == 3:
#                     count += 1
#                 sets.remove(s[i])
#                 i += 1 
#         return count
# obj = Solution()
# # s = "xyzzaz"
# s = "aababcabc"
# print(obj.countGoodSubstrings(s))

# class Solution(object):
#     def intersection(self, nums1, nums2):
#         """
#         :type nums1: List[int]
#         :type nums2: List[int]
#         :rtype: List[int]
#         """
#         nums1.sort()
#         nums2 = list(set(nums2))
#         result = []

#         for i in nums2:
#             l = 0
#             r = len(nums1) - 1
#             while l <= r:
#                 mid = (r+l)//2
#                 if nums1[mid] == i:
#                     result.append(i)
#                     break
#                 elif nums1[mid] > i:
#                     r = mid - 1
#                 elif nums1[mid] < i:
#                     l = mid + 1
#         return result

# obj = Solution()
# nums1 = [4,9,5]
# nums2 = [9,4,9,8,4]
# print(obj.intersection(nums1, nums2))


# class Solution(object):
#     def intersect(self, nums1, nums2):
#         """
#         :type nums1: List[int]
#         :type nums2: List[int]
#         :rtype: List[int]
#         """
#         if len(nums1) < len(nums2):
#             nums1, nums2 = nums2, nums1
#         seen = {}
#         result = []
#         for num in nums1:
#             if num not in seen:
#                 seen[num] = 1
#             else:
#                 seen[num] += 1
        
#         for num in nums2:
#             if num in seen:
#                 if seen[num] > 0:
#                     result.append(num)
#                 seen[num] -= 1
        
#         return result
    
# obj = Solution()
# nums1 = [4,9,5,9,4,7,10]
# nums2 = [9,4,9,8,4,9]
# # nums1 = [1,2,2,1]
# # nums2 = [2,2]
# print(obj.intersect(nums1,nums2))


# def two_sum(nums, target):
#     seen = {}
#     for i, num in enumerate(nums):
#         complement = target - num
#         if complement in seen:
#             return [seen[complement], i]
#         seen[num] = i
#     return []

# nums= [2,3,5]
# target = 8
# print(two_sum(nums, target))


# class Solution(object):
#     def longestPalindrome(self, s):
#         """
#         :type s: str
#         :rtype: str
#         """
#         l = 0
#         r = len(s) - 1
#         while l <= r:
#             substr = s[l:r + 1]
#             r_substr = s[r:l - 1:-1] if l > 0 else s[r::-1]

#             if substr == r_substr:
#                 return substr

# obj = Solution()
# s = 'aba'
# print(obj.longestPalindrome(s))

# class Solution(object):
#     def getCommon(self, nums1, nums2):
#         """
#         :type nums1: List[int]
#         :type nums2: List[int]
#         :rtype: int
#         """
#         # if nums1 < nums2:
#         #     nums1, nums2 = nums2, nums1

#         seen = {}

#         for i in nums1: 
#             if i not in seen:
#                 seen[i] = 1
#             else:
#                 seen[i] += 1
        
        
#         for i in nums2:
#             if i in seen:
#                 return i

#         return -1

# nums1 = [1,2,3,6]
# nums2 = [2,3,4,5]
# obj = Solution()
# print(obj.getCommon(nums1,nums2))


# class Solution(object):
#     def isPalindrome(self, s):
#         """
#         :type s: str
#         :rtype: bool
#         """

#         valid_s = ""
        
#         for char in s:
#             if char.isalpha():
#                 valid_s += char.lower()
#             if char.isnumeric():
#                 valid_s += char
#         # return True if valid_s[0:len(valid_s)] == valid_s[::-1] else False
#          # Initialize two pointers
#         left, right = 0, len(valid_s) - 1
        
#         # Check the string from both ends
#         while left < right:
#             if valid_s[left] != valid_s[right]:
#                 return False
#             left += 1
#             right -= 1
        
#         return True

# obj = Solution()
# # s = "0P"
# s = "ABA"
# print(obj.isPalindrome(s))

# class Solution(object):
#     def minSubArrayLen(self, target, nums):
#         """
#         :type target: int
#         :type nums: List[int]
#         :rtype: int
#         """

# class OneNum:
#     def onenum(self, nums):
        
#         # dicts = {}
#         # for i in range(len(nums)):
#         #     if nums[i] not in dicts:
#         #         dicts[nums[i]] = 1
#         #     else:
#         #         dicts[nums[i]] += 1
        
#         # for i in dicts.keys():   
#         #     if dicts[i] == 1:
#         #         return i

# obj = OneNum()
# nums=[2,34,2,34,5]
# print(obj.onenum(nums))


# def binary_search(nums, k):
#     l = 0
#     r = len(nums)-1

#     while l <= r:
#         mid = (l+r)//2

#         if nums[mid] == k:
#             return mid
#         elif nums[mid] > k:
#             r = mid - 1
#         else:
#             l = mid + 1

# nums = [1,3,4,5,7,10,15,20]
# k = 20
# print(binary_search(nums,k))

def min_max(n):
    min = n[0]
    max = n[0]

    for i in range(len(n)):
        if min > n[i]:
            min = n[i]
        elif max < n[i]:
            max = n[i]
        
    return [min, max]

nums = [2,6,1,3,8]
nums2 = [2,6,1,3,8]

lists = [sum(i) for i in zip(nums,nums2)]
print(lists)

