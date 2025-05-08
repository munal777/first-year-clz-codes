def string_calculate(n):
    sum = 0
    for i in n:
        toNum = int(i)
        sum += toNum
    return sum

nums = input("Enter a num: ")
print(string_calculate(nums))

