number = int(input("Enter a num: "))
n =len(str(number))
count = 0
# digit = [int(num) for num in str(number)]

while number > 0:
    digit = number % 10
    count += digit**n
    number //= 10
print(count)

