import sys
N = int(sys.stdin.readline())
A = list(map(int, sys.stdin.readline().split()))

for k in range(N-1, 3, -1):
    print(A[k])

for i in range(N-1, 0, -1):
    if A[i-1]<A[i]:
        for j in range(N-1, 0, -1):
            if A[i-1] < A[j]:
                A[i-1], A[j] = A[j], A[i-1]
                A = A[:i] + sorted(A[i:])
                print(*A)
                exit()
print(-1)
