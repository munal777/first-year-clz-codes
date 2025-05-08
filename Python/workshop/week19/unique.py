li = [1,1,2,3,3,4,2,1,8,7]
emp = []
for i in li:
    if i not in emp:
        emp.append(i)
print(emp)  #membership operator