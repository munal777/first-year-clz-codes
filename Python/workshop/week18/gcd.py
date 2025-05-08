a = int(input("Enter first num: "))
b = int(input("Enter second num: "))
while b > 0:
    rem = a%b
    a = b
    b = rem

print(a)