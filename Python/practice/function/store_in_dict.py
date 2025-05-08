student = int(input("Number of Students: "))

def stNameMark(num):
    st_dict = {}
    for i in range(num):
        n = i + 1
        name = input(f"Enter {n} student name: ")
        marks = int(input(f"Enter {n} student marks: "))
        st_dict[name] = marks
    
    my_list = list(st_dict.values())

    highest = my_list[0] 
    lowest = my_list[0]
    sum = 0
    for i in range(len(my_list)):

        sum += my_list[i]

        if highest < my_list[i]:
            highest = my_list[i]

        if lowest > my_list[i]:
            lowest = my_list[i]

    avg = sum/len(my_list)

    result = (
        f"Student Marks dictionary: {st_dict}\n"
        f"Highest Marks among student: {highest}\n"
        f"Lowest Marks among student: {lowest}\n"
        f"Average Marks among student: {avg}"
    )

    return result

print(stNameMark(student))

