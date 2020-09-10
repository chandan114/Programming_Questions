arr = [[1,2,3],
       [4,5,6],
       [7,8,9]]
n = len(arr)

for i in range(n):
    for j in range(i,n):

        arr[i][j],arr[j][i] = arr[j][i],arr[i][j]
    
for i in range(n):
    j = 0 
    k = n-1
    while(j<k):
        arr[i][j],arr[i][k] = arr[i][k],arr[i][j]
        j+=1
        k-=1



print(arr)