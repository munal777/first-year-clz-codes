
class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if haystack == needle:
            return 0
        length = len(needle)
        for i in range(len(haystack) - length + 1):
            if haystack[i:length + i] == needle:
                return i
        return -1

    
obj = Solution()
haystack = "sadbutsad"
needle = "ut"
print(obj.strStr(haystack,needle))