x = int(input("Enter the divisor \n"))
y = int(input("Enter the Dividend \n"))


def sub(x , y , ):
    c  = 0
    rem = 0
    while(True):
        x-=y
        if(x>=0):
            c+=1
        else:
            rem = x+y
            return [c , rem]
            break

r = sub(x,y)
print(r)