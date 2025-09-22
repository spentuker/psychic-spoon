arr=[
    [1,2,3],
    [4,5,6],
    [7,8,9]
    ]

top=0
bottom=len(arr)
left=0
right=len(arr[0])

res=[[]]

while(top<=bottom and left <= right):

    # left to right 
    for i in range(right):
        print(arr[top][i],end=' ')
    print()
    # top-right to bottom-right
    for i in range(top+1,bottom):
        print(arr[i][right-1],end=' ')   
    print()
    # bottom-right to bottom-left
    for i in range(right-2,left-1,-1):
        print(arr[bottom-1][i],end=' ')
    print()
    
    bottom-=1
    right-=1
    top+=1
    right+=1
        