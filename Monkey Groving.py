# testcase = int(input())

# def Monkey(pattern , n , count , pattern_sort):
#     if(pattern_sort==pattern):
#         return count
#     count+=1
#     for i in range(len(pattern)):
        
#     Monkey()




# for _ in range(testcase):
#     n = int(input())
#     count = 0
#     pattern = list(map(int,input().split()))
#     pattern_sort = pattern.copy()
#     pattern_sort.sort()
#     Monkey(pattern , n , count  , pattern_sort)

rem = 0
for _ in range(int(input())):
    rem=0
    n = int(input())
    x = list(map(int , input().split()))
    for i in range(n-1):
        rem = rem + abs(abs((x[i]-x[i+1]))-1)
    
    print(rem)

