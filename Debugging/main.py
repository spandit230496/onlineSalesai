'''

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

'''
# def compute(n):
#     if n < 10:
#         out = n ** 2
#     elif n < 20:
#         out = 1
#         for i in range(1, n-10):
#             out *= i
#     else:
#         lim = n - 20
#         out = lim * lim
#         out = out - lim
#         out = out / 2 
#     print(out)


# n = int(input("Enter an integer: "))
# compute(n)


# The error is  in the function for calculating the factorial and for calculation in summation of natural number

# that should 
#         elif n < 20:
#         out = 1
#         for i in range(1, n-10+1):// or simply for i in range(1, n-9)   because in python outer range is exclusive
#             out *= i

# else:
#         lim = n - 20
#         out = lim * lim
#         out = out - lim
#         out = out / 2               this line is used for float division as we are calculation sum from 1 to (n-20) that can not be float  
#                                     so this line can be change to out =out//2


# //----------------------------------------------------------------------------------------------------------------------------------------------------//
#   correct code
# //----------------------------------------------------------------------------------------------------------------------------------------------------//
def compute(n):
    if n < 10:
        out = n ** 2
    elif n < 20:
        out = 1
        for i in range(1, n-9):
            out *= i
    else:
        lim = n - 20
        out = lim * lim
        out = out - lim
        out = out // 2 
    print(out)


n = int(input("Enter an integer: "))
compute(n)