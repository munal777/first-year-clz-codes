def countVowel(word):
    count = 0
    vowel_li = ["a","e","i","o","u"]
    for i in word:
        if i.lower() in vowel_li:
            count += 1
    return count

word = "munAlnamtia"
print(countVowel(word))