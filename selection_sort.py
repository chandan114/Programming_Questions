a = [5, 2, 6, 7, 2, 1, 0, 3]

# -----------------------Selection Sort------------------------------

# for i in range(0 , len(a)):
#     min  = i
#     for j in range(i+1 , len(a)):
#         if(a[min]>a[j]):
#             min = j
#     a[min],a[i] = a[i],a[min]

# print(a)

# ------------------------insertion sort---------------------------------

# for i in range(1 , len(a)):
#     value = a[i]
#     hole = i
#     while(a[hole-1]>value and hole>0):
#         a[hole] = a[hole-1]
#         hole-=1
#     a[hole] = value

# print(a)