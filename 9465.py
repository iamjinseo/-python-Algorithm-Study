# 백준 9465 스티커 실버1 / dp
import sys
# 첫째 줄에 테스트 케이스의 개수 T가 주어진다
T = int(sys.stdin.readline())

# n개의 정수가 주어진다.
# 스티커 배열 생성
for p in range(T):
    # 테스트 케이스의 첫째 줄에는 n (1 ≤ n ≤ 100,000)이 주어진다.
    n = int(sys.stdin.readline())

    dp = []
    for q in range(2):
        dp.append(list(map(int, sys.stdin.readline().split())))
    
    # 개수가 1개보다 많을 때
    if n > 1:
        dp[0][1] += dp[1][0]
        dp[1][1] += dp[0][0]
    for i in range(2, n):
        dp[0][i] += max(dp[1][i-1], dp[1][i-2])
        dp[1][i] += max(dp[0][i-1], dp[0][i-2])

    print(max(dp[0][n-1], dp[1][n-1]))
