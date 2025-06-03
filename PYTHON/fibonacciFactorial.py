#factorial

n=int(input("Enter a number"))
fact = 1
if n == 1 and n ==0:
    fact = 1
else:
    for i in range(1,n+1):
        fact *= i
print(fact)

# factorial using function


def factorial(n):
    fact = 1
    for i in range(1,n+1):
        fact *= i
    return fact

n=int(input("Enter a number"))
print(f"factorial of {n} is {factorial(n)}")

# factoriAL USING recursion

def factorial(n):
    if n==0 or n==1:
        return 1
    else:
        return n * factorial(n-1)
    
n=5
print(factorial(n))

#fibonacii upto nth term

n= int(input())
a,b=0,1
for _ in range(n):
    print(a,end= " ")
    a,b=b,a+b

#using function

def fibonacii(n):
    a,b = 0,1
    for _ in range(n):
        print(a, end=" ")
        a,b =b, a+b

terms = 7
fibonacii(terms)

#using recursion

def fibonacii(n):
    if n <= 1:
        return n
    else:
        return fibonacii(n-1) + fibonacii(n-2)
    
terms= 7
for i in range(terms):
     print(fibonacii(i), end =" ")
    



    

