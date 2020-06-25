# n = int(input())
str = input()


# def fact(n):
#     if(n<=1):
#         return 1
#     res = n*fact(n-1) 
#     return res

# print(fact(n))

# __________________________Sum of N Natural Numbers_________________________

# def n_natural(n):
#     if(n<=1):
#         return 1
#     res = n + n_natural(n-1)
#     return res

# print(n_natural(n))

#____________________________String Reverse____________________________________

# def Rev_string(str,n):
#     if(n<=0):
#         return(str[0])
#     res = str[n]+Rev_string(str,n-1)
#     return res

# print(Rev_string(str,len(str)-1))

#_____________________________string Length_____________________________________

def len_str(str , n):
    if(str[n] =='\0'):
        return n
    res = len_str(str,n+1)
    return res

print(len_str(str+'\0',0))

#_____________________________
