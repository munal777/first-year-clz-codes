# # printing increasive patterns
# for i in range(1,6):
#     for j in range(1,6):
#         if j <= i:
#             print("*",end=' ')
#     print()

# for i in range(1,5):
#     for j in range(4,0,-1):
#         if  j >= i:
#             print("*",end=' ')
#     print()

# #printing star from middle
# for i in range(1,6):
#     for j in range(5,0,-1):
#         if j > i:
#             print(end=' ')
#     for k in range(1,6):
#         if k <=i:
#             print(k,end=' ')
#     print()

#square pattern printing
# n = int(input("Enter a num:  "))
# for i in range(n):
#     for j in range(n):
#         print("*",end=' ')
#     print()

#pattern printing in increament
# for i in range(n):
#     for j in range(i+1):
#         print("*",end=' ')
#     print()

#pattern printing from center in increament
# for i in range(n):
#     for  j in range(n-i): #or for j in range(i,n)
#         print(end=' ')
#     for k in range(i+1):
#         print("*",end=' ')
#     print()

#pattern printing from center in  decreament
# for i in range(n):
#     for j in range(i):
#         print(end=' ')
#     for k in range(i,n):
#         print("*",end=' ')
#     print()

# #printing in increament without nested loop
# for i in range(1,7): print("* "*i)

# #printing in decreament without nested loop
# for i in range(5,0,-1): print("* "*i)

                        
for i in range(0,7):
    for j in range(6,-1,-1):
        if j >= i:
            print("*",end=" ")

    print()