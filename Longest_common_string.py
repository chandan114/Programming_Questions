def lcs(str , str2  , n , m , dp):

    if(n==0 or m==0):
        return dp

    if(str[n-1]==str2[m-1]):

        
        dp = lcs(str , str2 , n-1 , m-1,dp+1)

    else:


     dp = max( dp  , max(lcs(str , str2 , n-1 , m,0) , lcs(str , str2 , n , m-1,0)))


    return dp 

    



dp = 0
print(lcs("geeksforxgeekss" , "geekssforgeeks" , 15 , 14 , dp))
print(dp)