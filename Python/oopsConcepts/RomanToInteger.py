class Solution:
    def roman_to_int(self,n):
        rom_val = {'I':1, 'II':2, 'III':3, 'IV':4, 'V':5, 'VI':6, 'VII':7, 'VIII':8, 'IX':9, 'X':10}

        for i in rom_val:
            if i == n:
                print(f'The integer num of {n} is',rom_val[i])
                break
            

n = input("Enter a roman number: ")
obj = Solution()
obj.roman_to_int(n)