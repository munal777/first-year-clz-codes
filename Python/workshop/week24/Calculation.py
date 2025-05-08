class Student():

    def __init__(self, name, math, science, english):
        self.name = name
        self.num1 = math
        self.num2 = science
        self.num3 = english

    def last_name(self):
        li = self.name.split()
        return li[1]


    def calulation(self):
        return int((self.num1 + self.num2 + self.num3) / 3)

x = Student("Munal Poudel",20,29,61)
print(x.last_name())
print(x.calulation())


