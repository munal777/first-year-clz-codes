#vowel count in words
# def words(w):
#     vowel_count = 0
#     vowel_li = ['a','e','i','o','u']

#     for i in w:
#         if str(i).lower() in vowel_li:
#             vowel_count += 1
#     return vowel_count

# w = input("Enter the word: ")
# print(words(w))

#sum of strings num
# def sum_of_str(s):
#     sum_ = 0
#     for i in s:
#         int_s = int(i)
#         sum_ += int_s
#     return sum_

# s = input("Enter a string num: ")
# print(sum_of_str(s))

def name_mark(n):
    dict_ = {}
    for i in range(n):
        name = input("name of student: ")
        mark = int(input("mark of student: "))
        dict_.update({name:mark})
        # dict_[name] = mark #alternative way to do it.
    return dict_

n = int(input("Number of student: "))

print(name_mark(n))


