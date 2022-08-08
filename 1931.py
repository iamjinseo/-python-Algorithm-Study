# 백준 1931 회의실 배정 그리디 실버1
import sys
input = sys.stdin.readline

N = int(input())
arr=[]
for i in range(N):
    a, b = list(map(int, input().split()))
    dur=b-a #회의시간
    arr.append([a, b, dur])

arr.sort(key=lambda x:x[-1]) # 이차원 배열에서 마지막 인덱스 기준 정렬
# print(arr)
arr.sort(key=lambda x:x[1])
print(arr)
res =[]
for i in arr : 
    try:
        if i[0] >= res[-1][1] :
            # print(i)
            res.append(i)
        elif i[0] <= res[-1][0] and i[1] <= res[-1][0]:
            # print(i)
            res.append(i)
    except:
        res.append(i)
    # print("res:", res)
print(len(res))