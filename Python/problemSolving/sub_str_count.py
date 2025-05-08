def count_substring(string, sub_string):
    count_substr = 0
    k = len(sub_string)

    if 1 <= len(string) <= 200:
        for i in range(len(string)):
            if sub_string in string[i:i + k]:
                count_substr += 1
            
        
        
                
                
    return count_substr

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    count = count_substring(string, sub_string)
    print(count)