def spiral( n , matrix , i , j , rangeval):
    if(i>rangeval-1 or j>rangeval-1 or j < 0 or i < 0  ):
        
        return
    
    if(matrix[i][j]!=0):
        return
    
    matrix[i][j] = n
    spiral(n+1 , matrix , i , j+1 , rangeval)
    spiral(n+1 , matrix , i+1 , j , rangeval)
    spiral(n+1 , matrix , i , j-1 , rangeval)
    spiral(n+1 , matrix , i-1 , j , rangeval)


matrix=[]
rangeval=5
for _ in range(rangeval):
    matrix.append([0]*5)

spiral(1 , matrix , 0 , 0 , rangeval)


for i in matrix:
    print(i)