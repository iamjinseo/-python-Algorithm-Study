# 백준 1026 보물 그리디 실버4
# A는 오름차순, B는 내림차순 정렬해서 계산하면 되지 않나?
# B는 바꾸면 안된다고 했지만 어쨌든 S의 최솟값을 구하는 문제니까!

import sys
S = int(sys.stdin.readline())

A= list(map(int, sys.stdin.readline().split()))
A.sort()
B= list(map(int, sys.stdin.readline().split()))
B.sort(reverse=True) #내림차순 정렬
# list.sort(reverse=True)는 내림차순 정렬이다.

result = 0
for num1, num2 in zip(A, B): #zip 사용하여 두 개 리스트 반복
    result += num1*num2
print(result)
