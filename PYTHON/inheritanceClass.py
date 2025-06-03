class Person:
    def __init__(self,name,age):
        self.name = name
        self.age = age
        
    def __str__(self):
        return f"{self.name}:{self.age}"
        
class Employee(Person):
    def __init__(self,name,age,salary):
        super().__init__(name,age)
        self.salary=salary
        
    def __str__(self):
        return f"{super().__str__()}:{self.salary}"
        
emp_1 = Employee("alex", 23 , 25000)
print(emp_1)
        
    
