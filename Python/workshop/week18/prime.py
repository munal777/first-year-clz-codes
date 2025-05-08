#checking the prime number by using for loop
a = int(input("Enter the Num: "))
prime = True
if(a < 1):
    print("invalid Number")
else:
    for i in range(2,a//2):
        if a%i==0:
            prime = False

if(prime):
    print("Prime Number")
else:
    print("Not a Prime Number")


#checking prime number by using while loop
b = int(input("Enter a number: "))
count = 2
prime = True
if b < 1:
    print("Invalid Number")
else:
    while count < b//2:
        if b%count==0:
            prime = False
            count += count
if(prime):
    print("Prime Number")
else:
    print("Not a Prime Number")



