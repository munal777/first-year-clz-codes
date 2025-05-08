n = int(input("enter a n: "))

my_dict = {}
for i in range(n):
    names = input("Enter name: ")
    marks = int(input("Enter marks: "))
    my_dict[names]= marks
print(my_dict)
