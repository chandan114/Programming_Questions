import math
from decimal import getcontext, Decimal
getcontext().prec = 7
def dist(x , y , x1 ,y1):
    return Decimal((math.sqrt( ((x1-x)*(x1-x)) + ((y1-y)*(y1-y)))))

x1 = Decimal(float(input()))
x2 = Decimal(float(input()))
y1 = Decimal(float(input()))
y2 = Decimal(float(input()))
f = Decimal(float(input()))

if(x1 > x2):
    ub,lb = x1 , x2
else:
    ub,lb = x2 , x1

while lb<ub:
    mid = lb+ub/Decimal(2)
    mid1 = lb+mid/Decimal(2)
    mid2 =  ub+mid/Decimal(2)

    t1 =  dist(x1,y1,mid1,0)/f + dist(mid1,0,x2,y2)
    t2 =  dist(x1,y1,mid2,0)/f + dist(mid2,0,x2,y2)

    if(t1 < t2):
        ub = mid
    else:
        lb = mid

print("{0:.6f}".format(ub))


# import math
# from decimal import getcontext, Decimal
# getcontext().prec = 7
# def dist(x , y , x1 ,y1):
#     return(math.sqrt( ((x1-x)*(x1-x)) + ((y1-y)*(y1-y))))

# x1 = Decimal(float(input()))
# x2 = Decimal(float(input()))
# y1 = Decimal(float(input()))
# y2 = Decimal(float(input()))
# f = Decimal(float(input()))

# if(x1 > x2):
#     ub,lb = x1 , x2
# else:
#     ub,lb = x2 , x1

# while lb < ub:
#     mid = Decimal(lb+ub)/Decimal(2)
#     mid1 = Decimal(Decimal(lb)+mid)/Decimal(2)
#     mid2 =  Decimal(Decimal(ub)+mid)/Decimal(2)

#     t1 =  Decimal(dist(x1,y1,mid1,0))/Decimal(f) + Decimal(dist(mid1,0,x2,y2))
#     t2 =  Decimal(dist(x1,y1,mid2,0))/Decimal(f) + Decimal(dist(mid2,0,x2,y2))

#     if(t1 < t2):
#         ub = Decimal(mid)
#     else:
#         lb = Decimal(mid)

# print("{0:.6f}".format(ub))