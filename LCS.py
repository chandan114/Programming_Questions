def lcs(str , str2  , n , m , dp):

    if(n==0 or m==0):
        return 0
    if(dp[n][m]!=-1):
        return dp[n][m]
    if(str[n-1]==str2[m-1]):

        dp[n][m] = (1+lcs(str , str2 , n-1 , m-1,dp))
        return dp[n][m]
    else:

      dp[n][m] =  max(lcs(str , str2 , n , m-1,dp) ,lcs(str , str2 , n , m-1,dp) )
      return dp[n][m]

dp = [[-1 for x in range(8)] for y in range(7)]


print(lcs("AGGTAB" , "GXTXAYB" , 6 , 7 , dp))
print(dp)