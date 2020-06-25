n = int(input())
matrix = []
for i in range(n):
    a = list(map(int , input().split()))
    matrix.append(a)


def check(matrix ,cr,cc,pr,pc,n,sum,l):
    if(cc>=n or cr>=n or  pr<0 or pc<0 or cc <0 or cr < 0):
        return
    
    sum =  (sum//2) + matrix[cr][cc]
    

    if(cc== n-1 and cr== n-1):
        l.append(sum)

    check(matrix ,cc,cr+1,pr,pc,n,sum,l) #Right
    check(matrix , cc+1,cr,pr,pc,n,sum,l) #Down
l = []
check(matrix,0,0,0,0,n,0,l)
print("DONE")
# print(min(l))


# 5
# 0 82 2 6 7
# 4 3 1 5 21 
# 6 4 20 2 8
# 6 6 64 1 8
# 1 65 1 6 4 


# 4
# 0 3 9 6
# 1 4 4 5
# 8 2 5 4
# 1 8 5 9