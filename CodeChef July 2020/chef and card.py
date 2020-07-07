# def digitsum(n):
#     while (True):
#         if(n<10):
#             break
#         else:
#             n = n%10

def digitsum( n ): 
    if n == 0: 
        return 0
    return (n % 10 + digitsum(int(n / 10))) 

for _ in range(int(input())):
    chef_points = 0 
    monty_points = 0
    for __ in range(int(input())):
        x , y = map(int,input().split())
        chef = digitsum(x)
        monty = digitsum(y)
        if(chef>monty):
            chef_points+=1 
        elif(monty>chef):
            monty_points+=1
        else:
            chef_points+=1
            monty_points+=1
    if(chef_points>monty_points):
        print(0 , end=" ")
        print(chef_points)
    elif(monty_points>chef_points):
        print(1 , end = ' ')
        print(monty_points)
    else:
        print(2 , end = " ")
        print(monty_points)