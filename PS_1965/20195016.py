n = int(input())
a = [0]+list(map(int, input().split()))
d=[1]*(n+1)
maximum=0
for i in range(1,n):
    for j in range(n):
        if a[j]<a[i] and d[i]<d[j]+1:
            d[i]=d[j]+1
            
for i in range(n):
    maximum=max(maximum, d[i])
maximum
