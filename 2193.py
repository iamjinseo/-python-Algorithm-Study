# 백준 2193 이친수 / 실버3
# dp

# # 첫째 줄에 N이 주어진다. N은 0이상 90이하
# N = int(input())

# # dp 만들기
# # 이중 리스트로
# dp = [[0]*2 for _ in range(N+1)]

# # dp 값 넣어보기
# # 해설은 그림 참고
# dp[1][0]=0
# dp[1][1]=1

# for i in range(2, N+1):
#     for j in range(2):
#         dp[i][0] = dp[i-1][0]+dp[i-1][1]
#         dp[i][1] = dp[i-1][0]

# # 첫째 줄에 N자리 이친수의 개수를 출력한다.
# print(sum(dp[N]))

#이중리스트 없이 1차원으로도 가능
# 첫째 줄에 N이 주어진다. N은 0이상 90이하
N = int(input())

dp = [0]*91
dp[1]=1
dp[2]=1

for i in range(3, 91):
    dp[i]=dp[i-1]+dp[i-2]

print(dp[N])