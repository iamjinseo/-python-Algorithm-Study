# # 백준 주유소 그리디 실버4

# # 리터당 기름값이 가장 낮은 곳에서 다 사기
# # 1. 기름값 중에서 최저값 찾기
# # 2-1. 현재 장소가 최저값 장소면 거기서 남은 거리만큼 다 사기
# # 2-2. 현재 장소의 가격이 최저값은 아니지만 다음 장소보다 낮으면 다음 장소의 거리만큼 사기
# # 2-3. 현재 장소가 최저값 장소가 아니면 그 다음 장소로 건너갈 만큼의 기름 사기
# import sys
# n = int(sys.stdin.readline())
# dis = list(map(int, sys.stdin.readline().split()))
# charge = list(map(int, sys.stdin.readline().split()))
# result = 0 #드는 돈

# low = min(charge[:len(charge)-1]) #마지막 장소 기름값 제외한 최저 기름값

# # for i in range(0, n-1): #마지막에서 그 앞의 장소까지 여행하기
# #     if charge[i] == low: # 최저값일때 한방에 가기
# #         result += charge[i]*(sum(dis[i:])) # 남은 거리만큼의 기름 사기
# #         break
# #     elif charge[i] < charge[i+1] : #다음 장소보다 가격 낮을 때
# #         result += charge[i]*(dis[i]+dis[i+1]) # 두 거리를 더 갈만큼 사기
# #         # 예를들어 거리는 1 1 1이고 가격이 2 3 1 4면 2에서 3-1만큼의 거리도 같이 사는거임
# #     else: # 그냥 지나가기
# #         result += charge[i]*dis[i]

# i=0
# while True: #마지막에서 그 앞의 장소까지 여행하기
#     if charge[i] == low: # 최저값일때 한방에 가기
#         result += charge[i]*(sum(dis[i:])) # 남은 거리만큼의 기름 사기
#         break
#     elif charge[i] < charge[i+1] : #다음 장소보다 가격 낮을 때
#         result += charge[i]*(dis[i]+dis[i+1]) # 두 거리를 더 갈만큼 사기
#         # 예를들어 거리는 1 1 1이고 가격이 2 3 1 4면 2에서 3-1만큼의 거리도 같이 사는거임
#         i+=2
#     else: # 그냥 지나가기
#         result += charge[i]*dis[i]
#         i+=1


# print(result)


# 위에꺼 다 틀렸고 지금부터가 정답~!!
# 정답 코드 알고리즘 : 현재값과 최소값을 비교하여 현재가 최소일 때
# 현재값을 최소값으로 둔 다음 그 최소값으로 계산한다.
# ~~~그리디 마인드~~
import sys
input = sys.stdin.readline

n = int(input()) # 거리 개수
roads = list(map(int, input().split())) # 거리 값 
costs = list(map(int, input().split())) # 비용 입력

# 일단 첫번째 장소를 최소값 장소로 둠
min_cost = costs[0] # 최소 비용
res = 0 # 결과

for i in range(n-1):
    if costs[i] < min_cost : 
        min_cost = costs[i]
    res += min_cost * roads[i]
print(res)



