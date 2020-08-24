import sys
maxval = sys.maxsize
d = {}
for _ in range(int(input())):
    pval = 0
    c = 0
    n , k  = map(int , input().split())
    p = list(map(int , input().split()))
    p.sort(reverse = True)
    # for i in p:
    #     m  = i
    #     if( k%i == 0):
    #         c = 1
    #         # if( ((k//i)-1) <maxval):
    #         #     maxval = ((k//i)-1)
    #         #     pval = i
            
    #         d[( ( (k//i)-1 )) ] = i

    # if(c>0):
    #     minval = min(d)
    #     print(d[minval])
    # else:
    #     print(-1)

    for i in p:
        if(k%i==0):
            c = 1
            print(i)
            break
            
    if(c!=1):
        print(-1)
        


# 2
# 4 6
# 4 3 2 8
# 4 7
# 4 3 2 8