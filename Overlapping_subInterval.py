arr = [[6, 8], [1, 9], [2, 4], [4, 7] , [9 , 15]] 
d= []

arr.sort()

# print(arr)

a = arr[0][0]
b=arr[0][1]

for i in range(0,len(arr)):


    # a,b = interval

    if( b >= arr[i][0]):

        b = max(b , arr[i][1])

        
    else:

        d.append( [a,b] )
        a = arr[i][0]
        b = arr[i][1]
    
d.append([a,b])

print(d)