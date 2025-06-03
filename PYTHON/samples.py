#odd or even

def even(n):
    if n %2 ==0:
        return True

n = int(input())
if even(n):
    print("even")
else:
    print("odd")

# positive negative number

n = int(input())
if n < 0:
    print("-")
elif n > 0:
    print("+")
else:
    print("0")

#sum of n natural number,arithmetic progression ,geometric series

n = int(input())

sum_n = n*(n+1)//2
print(sum_n)


a = int(input())
d = int(input())
ap = n* (2*a + (n-1)*d) // 2
print(ap)

r = int(input())
if r ==1:
    gp = n* a
else:
    gp = a* (1 - r**n)/(1-r)
print(gp)

#largest among 3 numbers

a= int(input())
b = int(input())
c = int(input())
if a > b and a > c:
    print(a,"is  graeatest")
elif b > c:
    print(b,"is  graeatest")
else:
    print(c,"is  graeatest")

# leap year

yr = int(input())
if (yr%100 != 0 and yr%4 ==0) or (yr%400 ==0):
    print("leeap yr")
else:
    print("not leap yr")

#reverse a number

n = int(input())
rev = 0
while n > 0:
    rev = rev * 10 + n % 10
    n = n // 10
print(rev)

# maximum and minimum digit 

n = int(input())
max = 0
min = 9
while n> 0:
    digit = n%10
    if digit > max:
        max = digit
    if digit < min:
        min = digit
    n = n//10

print(min,max)


