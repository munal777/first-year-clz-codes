class Bank:
    def __init__(self,name,balance):
        self._name = name
        self.__balance = balance
    
    def __str__(self):
        return f"{self._name} has {self.__balance} in Bank."
    
    def get_balance(self):  #creating getter method
        return f'{self.__balance}'

obj = Bank('Munal',100)
print(obj)
print(obj._name)
print(obj.get_balance())  #accessing private attributes

class branchBank(Bank):
    def __init__(self, name, balance):
        super().__init__(name, balance)
    
    def __str__(self):
        return super().__str__()

    obj2 = Bank('Namita',14000)
    print(obj2)
    # print(obj2.__balance) #we cannot access private attribute dircetly in subclass
    print(obj2._name) #we can access protected attributes in subclass 
    