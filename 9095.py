# 1,2,3 더하기
# 다이나믹 프로그래밍
# 정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.
# 1+1+1+1
# 1+1+2
# 1+2+1
# 2+1+1
# 2+2
# 1+3
# 3+1

# 입력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
# 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. 
T = int(input())

# n은 양수이며 11보다 작다.
# Bottom-up으로 모든 경우의 수 구하기
dp = [0]*12
dp[1] = 1
dp[2]=2
dp[3] = 4
dp[4] = 7

#점화식은 D[N] = D[N-1]+D[N-2]+D[N-3]
for i in range(5, 12):
    dp[i] = dp[i-1]+dp[i-2]+dp[i-3]

#모든 경우의 수를 다 구했으므로 T번동안 원하는 숫자를 입력받아서
# 2xn의 경우의 수(dp[n])를 출력하자.
answer=""
for i in range(0, T):
    n = int(input())
    answer += str(dp[n])+"\n"

print(answer)
