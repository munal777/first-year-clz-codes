def binaryToDecimal(num):
    store_rem = ''
    while num != 0:
        rem = num%2
        store_rem += str(rem)
        num = int(num/2)
    reverse_str = store_rem[::-1]
    return reverse_str

print(binaryToDecimal(99))

