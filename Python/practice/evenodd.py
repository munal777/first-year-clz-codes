li =[1,2,3,4,5,6,7,8,9]
sum_odd= 0
sum_even= 0
for i in range(0,len(li)):
    if li[i]%2==0:
        sum_even += li[i]
    else:
        sum_odd += li[i]

print(sum_even)
print(sum_odd)

#printing even number by using looping comprehension
[print(i) for i in range(2,11,2)]