class Palindrome:
    def check_palindrome(self, num):
        if num != 0:
            num_str = str(num)
            reverse_str = num_str[::-1]

            boolean = False
            if num_str == reverse_str:
                boolean = True

            return boolean

obj = Palindrome()
print(obj.check_palindrome(-121))
