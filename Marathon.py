n = int(input())
time = int(input())
time = time-1
Winner = [0]*(n+1)
sum_list = [0]*(n)
steps = []

if(time%2==0):
    pass
else:
    time = time-1

for _ in range(n):
    l = list(map(int,input().split()))
    steps.append(l)


for i in range( 0, time , 2):
    sum = 0
    sum2=0
    inc = 0
    for j in range(n):
        sum_list[j] += ( (steps[j][i])+(steps[j][i+1]) )*(steps[j][-1])
    maxval = max(sum_list)
    if(sum_list.count(maxval)>1):
        for x in range(n):
            if(sum_list[x]==maxval):
                Winner[x] +=1
    else:
        indx = sum_list.index(maxval)
        Winner[indx] +=1
Winneris = max(Winner)
print(Winner)
print(Winner.index(Winneris)+1,end='') 






# for i in range(len(total[0])):
#     for j in range(n):
#         max = total[j][i]
#         if()

    


# 3
# 8
# 2 2 4 3 5 2 6 2 3
# 3 5 7 4 3 9 3 2 2
# 1 2 4 2 7 5 3 2 4