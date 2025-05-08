def count_word():

    with open('filehandling/file1.txt','r') as f:
        line = f.read()
        to_list = line.split()
        new_list = []
        for word in to_list:
            if word.isalpha():
                new_list.append(word)
            else:
                str = ''
                for i in word:
                    if i.isalpha():
                        str += i
                new_list.append(str)

        new_dict = {}
        for word in new_list:
            if not word in new_dict:
                new_dict[word] = 1
            else:
                new_dict[word] += 1
        
        for i,j in new_dict.items():
            print(i,j)
        
        return new_dict
    
print(count_word())

count = 0
str = 'anaka'
str_2 = 'Abcd'
str_3 = 'nono'
li = list((str,str_2,str_3))
print(li)

for i in li:
    count += (i.count('a',0,len(i)) or i.count('A',0,len(i)))

print(count)