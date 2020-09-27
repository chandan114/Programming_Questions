
def subset(array , target , n , c):

    print(n)

    if(n==len(array)):
        return False ;

    if(target==0):
       
        return True ;
    

    for i in range(len(array)):

        if(target>=array[n]):


            dp[n][target] = (subset(array , target - array[n] , n+1 , c) or subset(array , target , n+1 , c))
            return dp[n][target]
        
        else:

            dp[n][target] = subset(array , target , n+1 , c)
            return dp[n][target]
        

    
    return dp[n][target]

array = [8,4,2,8,6,8,4]
target = 15
dp = [[-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1],
[-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1],
[-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1],
[-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1],
[-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1],
[-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1],
[-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1],
[-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1]]


print(subset(array , 13 , 0 , 0 ) );
# print(dp)
