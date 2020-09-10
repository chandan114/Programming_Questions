arr = [[1,2,3],
       [4,5,6],
       [7,8,9]]


c=1

for i in range(len(arr)):
    k = len(arr)-1
    for j in range(len(arr)):

        if(c%2!=0):
            print(arr[i][j] , end =" ")
        else:

            print(arr[i][k] , end =" ")
            k-=1
    c+=1