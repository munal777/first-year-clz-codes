#1. slicing way to reverse
def reverse_string(s):
    return s[::-1]

#2. use looping to reverse
def reverse_str_loop(s):
    reverse_str = ""
    for i in s:
        reverse_str = i + reverse_str
    print("loop reverse: ",reverse_str)

s = "hello, world!"
reversed = reverse_string(s)
print("Using slicing:",reversed)

reverse_str_loop(s)

list_s = list(s)
print(list_s)
list_s.reverse() #reversing the lists
# print(list_s)
list_to_str = ''.join(list_s) #using join method to join the lists
print(list_to_str)