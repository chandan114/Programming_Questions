#palindrome Recursion

def palindrome_recursion( strR , i , j ):
    if(i>j):
        return
    if(strR[i]!=strR[j]):
        print("NOT Palindrome")
        return
    else:
        if(i==j):
            print("Palindrom")
        
    palindrome_recursion( strR , i+1 , j-1)
    
s = "MALAYALAM"
palindrome_recursion(s , 0, len(s)-1)