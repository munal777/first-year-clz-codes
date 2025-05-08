a = "Munal, Namita"

#it will print the particular index character
print(a[4])

#to check the length of String
print(len(a))

#using loop as string are arrays
for name in "munal":
    print(name)

#to cheack that if it contain that word
print("Namita" in a)

#using if statement to cheack it
if "Munal" in a:
    print("Yes, 'Munal' is present in a")

#by using not in keyword to cheack 
if "Numa" not in a:
    print("'Numa', is not present in a.")

b = "Numa,and Namita"

#to print the character from 2 to 5(where 5 is not included in it)
print(b[2:5])

#to print the character from 0 to 4(where is not included in it)
print(b[:4])

#it will print character from 2 to the end
print(b[2:])

#negetive index to print from end where -2 to -6(where -6 is not included)
print(b[-6:-3])

c = " Hello Munal "

#to print to upper case & lower case
print(c.upper())
print(c.lower())

#strip() method remove unwanted spacing
print(c.strip())

#replace() method will replace the string with another string
print(c.replace("H", "j"))
country_name ="Nepal, Bangladesh, Bhutan, Srilanka, Nepal, Nepal"
new_country_name=country_name.replace("Nepal", "UK",2) #str.replace("old", "new", count)
print(new_country_name)

# we cannat join other datatype in string but by using string formating we can do it 
age = 35
text = f"My name is munal, {age}"
print(text)

#using splitlines method
my_bio = "It\'s Munal Poudel\nAll the why from Dharan."
bio = my_bio.splitlines()
print(bio)

