class CountInversion:
    count = 0
    def sort_list(self, li):
        if len(li) > 1:
            middle = len(li) // 2
            left_arr = li[: middle]
            right_arr = li[middle:]

            self.sort_list(left_arr)
            self.sort_list(right_arr)

            i = j = k = 0

            while i < len(left_arr) and j < len(right_arr):
                if left_arr[i] > right_arr[j]:
                    li[k] = left_arr[i]
                    i += 1
                    self.count += 1

                else:
                    li[k] = right_arr[j]
                    j += 1
                    # self.count += 1
                k += 1
                
            while i < len(left_arr):
                    li[k] = left_arr[i]
                    i += 1
                    k += 1

            while j < len(right_arr):
                    li[k] = right_arr[j]
                    j += 1
                    k += 1
            return self.count

obj = CountInversion()
# arr = [2, 4, 1, 3, 5]
arr = [2,3,4,5,6]
x = obj.sort_list(arr)
print(arr)
print(x)

                
