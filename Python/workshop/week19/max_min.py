len_n = int(input("Enter a length: "))
emp_list= []
for i in range(0,len_n):
    user_input = int(input("enter a element: "))
    emp_list.append(user_input)
print(emp_list)
max_num = emp_list[0]
min_num = emp_list[0]
for i in range(0,len(emp_list)):
    if emp_list[i] > max_num:
        max_num = emp_list[i]
    else:
        min_num = emp_list[i]
print(max_num)
print(min_num)

