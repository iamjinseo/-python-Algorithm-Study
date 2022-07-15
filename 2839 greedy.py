#그리디로 풀기
# N이 5의 배수 될 때 까지 3계속 빼기
import sys
N = int(sys.stdin.readline())

count = 0
while(True):
    if N % 5 == 0:
        count+=N//5        
        break
    else:
        # N이 3보다 작으면 안됨
        if N < 3:
            count = -1
        N -= 3 
        count +=1
print(count)