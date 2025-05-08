def bin_to_dec(digit):
    ans = 0
    i = 0
    while digit != 0:
        n = digit%10
        if n == 1:
            ans =  (2**i) + ans
        
        digit = digit/10
        i += 1
    print(ans)


num = int(input("Enter a num: "))
bin_to_dec(num)
#by using forf loop
#rem = inp % 10
#sum = rem + 2 ** i


