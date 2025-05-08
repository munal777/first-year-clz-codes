def copy_file():
    count = 0
    with open('filehandling/file1.txt','r') as f:
        s = f.readlines()
        for i in s:
            count += 1

        with open('filehandling/file2.txt','w') as f:
            # for i in s:
            #     f.write(i)
            f.writelines(s)
        
    return count

print(copy_file())