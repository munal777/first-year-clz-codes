num = int(input("Enter a num: "))
prime = True
i = 2
while i < num:
    if num%i == 0:
        prime = False
    i += 1

if(prime):
    print("prime number.")
else:
    print("Not a prime number.")