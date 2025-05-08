def minon_game(string):

    # vowel_list = ['A','E','I','O','U']
    # sub_str_list = []
    # vowel_dict = {}
    # remain_dict = {}


    # for i in range(len(s)):
    #     for j in range(i+1,len(s)+1):
    #         sub_str_list.append(s[i:j])

    # for element in sub_str_list:
    #     for j in range(1):
    #         if element[0] in vowel_list:
    #             if not element in vowel_dict:
    #                 vowel_dict[element] = 1
    #             else:
    #                 vowel_dict[element] += 1

    #         elif not element[0] in vowel_list:
    #             if not element in remain_dict:
    #                 remain_dict[element] = 1
    #             else:
    #                 remain_dict[element] += 1

    # vowel_point = 0
    # remain_point = 0

    # for i in vowel_dict.values():
    #     vowel_point += i
    
    # for i in remain_dict.values():
    #     remain_point += i
    
    # if vowel_point > remain_point:
    #     print('Kevin',vowel_point)
    # elif remain_point > vowel_point:  
    #     print('Stuart', remain_point) 
    # else:
    #     print('Draw')

    player1 = 0
    player2 = 0
    length = len(string)
    for i, char in enumerate(string):
        count_substrings_starting_at_i = length - i
        
        if char in 'AEIOU':
            player2 += count_substrings_starting_at_i
        else:
            player1 += count_substrings_starting_at_i

    if player1 == player2:
        print("Draw")
    elif player1 > player2:
        print('Stuart', player1)
    else:
        print('Kevin', player2)


s = input().upper()
string = ''
for char in s:
    if char.isalpha():
        string += char

print(string)

if 0 < len(s) <= 10**6 and s.isalpha():
    minon_game(s)



            

    # for char in range(len(s)):
    #     if char[0] in vowel_list:
    #         vowel_str += char


    # for char in s:
    #     if char[0] in vowel_list:
    #         vowel_str += char
    #     else:
    #         vowel_str += char

    # for i in range(len(vowel_str)):
    #     for j in range(len(i)):
    #         str = ''
    #         str += i
    #         if not str in vowel_dict:
    #             vowel_dict[i] = 1
    #         else:
    #             vowel_dict[i] += 1
    
        
    # return vowel_str, remain_str


if __name__ == '__main__':
    s = input()
    if 0 < len(s) <= 10**6:
        print(minon_game(s))

# def get_all_substrings(s):
#     substrings = []
#     # Outer loop for the starting index of the substring
#     for i in range(len(s)):
#         # Inner loop for the ending index of the substring
#         for j in range(i + 1, len(s) + 1):
#             substrings.append(s[i:j])
#     return substrings

# # Example usage:
# string = 'munal'
# result = get_all_substrings(string)
# print(result)