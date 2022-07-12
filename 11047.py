# 백준 11047 동전 0 / 실버4 / 그리디
import sys

# 동전의 종류 N과 가격K
N, K = map(int, sys.stdin.readline().split())

# coins
coins = []

# 동전 가격 입력
for i in range(N):
    coins.append(int(sys.stdin.readline())) 

# 그리디 시작
# K원을 만드는 데 필요한 최소한의 동전 개수는?
num_of_coins = 0 # 동전 개수
for coin in coins[ : : -1]: #큰 동전부터(내림차순)
    if coin <= K: #동전가격이 K보다 이하일 때만
        print("coin: ", coin)
        num_of_coins += K // coin #동전 개수 구하기
        print("num of: ", num_of_coins)
        K %= coin #남은 돈 구하기
        print("k:", K)

print(num_of_coins)