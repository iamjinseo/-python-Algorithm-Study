# 백준 / 11399 / ATM / 그리디 / 실버4
# 검증결과 : 인출 시간이 짧은 사람부터 배치

import sys
N = int(sys.stdin.readline())

# 인출 시간
times = list(map(int , sys.stdin.readline().split()))

# 오름차순 정렬 후 시간 계산
times.sort()
for i in range(1, N):
    # 이전 사람의 걸리는 시간과 내가 걸리는 시간 더하기
    times[i] = times[i]+times[i-1]

print(sum(times)) # 각 사람마다 걸리는 시간의 합