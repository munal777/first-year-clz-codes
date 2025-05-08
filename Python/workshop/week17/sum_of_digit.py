# a = int(input("Enter first number: "))
# if a%2==0:
#     print("the number is even")
# else:
#     print("the number is odd")
# i = 1
# while(i<=100):

#     if(i%3==0 and i%5==0):
#         print("fizzbizz")
#     elif(i%3==0):
#         print("fizz")
#     elif(i%5==0):
#         print("bizz")
#     else:
#         print(i)
        
#     i = i + 1

#--convert the num into sum--
# num = 354
# mul = 1
# while num>0:
#     rem = num%10
#     mul *= rem
#     num = num//10
# print(mul)

#--GCD--
# a = 10
# b = 18
# while (b != 0):
#     rem=a%b
#     a = b
#     b = rem
# print(a)

#factorial
a=int(input("enter number: "))
count = 0
while(a > 0):
    rem = a%10
    count = count + 1
    a = a//10
print(count)


