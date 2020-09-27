dicnry = ["mobile","samsung","sam","sung", 
                            "man","mango", "icecream","and", 
                            "go","i","love","ice","cream" ]



def wordbreak(arr , str , n , dicnry, result):

    

    if(str in dicnry):

        result+=str+' '

        if(n==len(arr)-1):
            print(result)
            return True

        str = arr[n:]
        return wordbreak(arr , arr[n+1] , n+1 , dicnry , result)
         
    else:
        if(n==len(arr)-1):
            return False

        return wordbreak(arr , str + arr[n+1] , n+1 , dicnry , result)


    # return False

arr = 'ilovesamsungmobile'
print(wordbreak(arr , arr[0] , 0 , dicnry, ''))


    

        
    
