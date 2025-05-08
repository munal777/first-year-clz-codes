def sort_li(num):
    for i in range(len(num)):
        swap = False
        for j in range(len(num) - i - 1):
            if num[j] > num[j+1]:
                num[j], num[j + 1] = num[j + 1], num[j]
                swap = True
        if not swap:
            break


li = [28,6,18,30,28]
sort_li(li)
print(li)