n = 7
ans = ""
i = 0
while n != 0:
    rem = n%2
    ans = str(rem) + ans
    n = n//2
print(ans)