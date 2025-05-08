# ltr = "abcdeaceba"

# def count_str(strings):
#     emp_dict = {}
#     for i in strings:
#         if i in  emp_dict:
#             emp_dict[i] += 1
#         else:
#             emp_dict[i] = 1
#     print(emp_dict)

# count_str(ltr)

li = [23,4,21,40,1,50]

def sorting_lists(lists):
    for i in range(len(lists)):
        swap = False
        for j in range(len(lists) - i - 1):
            if lists[j] > lists[j+1]:
                lists[j], lists[j+1] = lists[j+1], lists[j]
                swap = True
        if not swap:
            break

    print(lists)

sorting_lists(li)
