class Student:
    """self parameter is a reference to the current instance of class and to access the variable that belong to the class."""
    studentCount = 0
    def __init__(self,std_name,roll_no,course):
        self.std_name = std_name
        self.roll_no = roll_no
        self.course = course
        Student.studentCount += 1
    
    def __str__(self):
        return f"{self.std_name} roll no. is {self.roll_no} & study in {self.course} field."

    def displayStudent(self):
        print(f"Student Name: {self.std_name}")
        print(f"Roll no: {self.roll_no}")
        print(f"Course: {self.course}")
    
    @classmethod
    def totalStudent(cls):
        print(f"Total Num of Student is {cls.studentCount}")


std1 = Student("Munal",2,"IT")
std2 = Student("Namita",1,'BA')

#-------creating subclass-----------
class SubStudent(Student):
    def __init__(self, std_name, roll_no, course, section):
        super().__init__(std_name, roll_no, course)
        self.section = section
    
    def displayStudent(self):
        super().displayStudent()
        print(f"Section: {self.section}")

    
    def __del__(self):      #creating del method to delete an object
        class_name = self.__class__.__name__
        print(class_name, 'Distoryed')


 #-----------build-in attributes method---------------
ohh = getattr(std1,'age','default') #getattr method 
print('we have ', ohh)

print(getattr(std2,'course'))

print(hasattr(std1,'roll_no'))  #hasattr method

#setattr method
setAge = setattr(std1,'age',21)
print('Age:',setAge)  #it will print none

std1.displayStudent()
print('Age: ', std1.age,'\n') #it will add age as we have set above

setattr(std2,'semester','2nd')
std2.semester = '4th'  #we can modify properties of the object 
print('Semester:',std2.semester)

# del std2.roll_no  #it wll be error as we delete the roll_no from std2 oject
std2.displayStudent()

Student.totalStudent() 

print(std1) #it will return the string because by using of str method

#-----------build in class attributes----------
print(std1.__dict__) #__dict__ it will be in the form of dictionary
# print(Student.__dict__)

dict_1 = (std2.__dict__) #creating dictionary of object by using class __dict__ attributes
print(dict_1)
print(type(dict_1))

print(Student.__doc__)  #return the docstring and it should be in the first line inside class
print(SubStudent.__module__)
print(Student.__name__) #return the name of class
print(SubStudent.__bases__) #return the bases classes in tuple 
print(Student.__bases__)

#--------creating object of substudent----------
std3 = SubStudent('Numa',15,'BBA','C')
std3.displayStudent()
del std3   #calling del method here to delect the subclass

