def my_factorial(num):
    if num <=1:
        return 1
    return num * my_factorial(num - 1)

print(my_factorial(5))