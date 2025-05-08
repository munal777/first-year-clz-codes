st = int(input("Enter a number students: "))

my_dict = {}
for i in range(st):
    name = input("Enter a name: ")
    grade = input("Enter a grade: ")

    my_dict[name] = grade
print(my_dict)