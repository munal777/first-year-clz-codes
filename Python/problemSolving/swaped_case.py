def swaped_case(str):
    record = []

    for char in str:
        if not char.isdigit():
            if char.isupper():
                record.append(char.lower())
            elif char.islower():
                record.append(char.capitalize())
            else:
                record.append(char)
        else:
            record.append(char)
        
    str_ = "".join(record)
    return str_

str = 'Munal pouDEL 90.'
print(swaped_case(str))









# str = 'munal'.upper()
# print(str.isupper())