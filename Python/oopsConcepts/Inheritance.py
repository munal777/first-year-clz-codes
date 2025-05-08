class Student:
    def getData(self, name, roll_no, course):
        self.name = name
        self.roll_no = roll_no
        self.course = course 

    def displayStd(self):
        print("Student Name:",self.name)
        print("Roll no:",self.roll_no)
        print("Course:",self.course)

class Test(Student):
    def getMarks(self, mark):
        self.mark = mark
    
    def displayMarks(self):
        print("Total Marks:", self.mark)

class Sport:
    def sportmarks(self,spmark):
        self.spmark = spmark
    
    def displaySportMrks(self):
        print("Sport mark", self.spmark)

class Result(Test,Sport):  #multiple inheritance
    def calculateGrade(self):
        m = self.mark + self.spmark
        if m > 70:
            self.grade = "A"
        elif m > 60:
            self.grade = 'B'
        else:
            self.grade = 'FAIL'
        print("Result:", self.grade)
        
n = input("Enter student name: ")
r = input("Enter Roll no: ")
c = input("Enter your course: ")
m = int(input("Enter your Marks: "))
s = int(input("Enter your Sport Marks: "))

std1 = Result()
std1.getData(n,r,c)
std1.getMarks(m)
print("-"*5,'Result','-'*5)
std1.displayStd()
std1.displayMarks()
std1.sportmarks(s)
std1.displaySportMrks()
std1.calculateGrade()

