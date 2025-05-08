emp_list = []
len_list = int(input("Enter a length: "))
for i in range(0,len_list):
    user_input = int(input("enter a element: "))
    emp_list.append(user_input)
print(emp_list)
odd_sum = 0
even_sum = 0
for i in range(0,len(emp_list)):
    if emp_list[i]%2 == 0:
        even_sum += emp_list[i]
    else:
        odd_sum += emp_list[i]
print(odd_sum)
print(even_sum)