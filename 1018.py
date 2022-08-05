# 백준 체스판 다시 칠하기 브루트포스 실버4
import sys
input = sys.stdin.readline
N, M = list(map(int, input().split()))
board = [input() for _ in range(N)] # 보드 입력
res = []

for i in range(N-7):
    for j in range(M-7):
        w = 0 # 왼쪽 맨 위가 흰색일 때 경우의 수
        b = 0 # 왼쪽 맨 위가 검은색일 때 경우의 수 
        for p in range(i, i+8):
            for q in range(j, j+8):
                if (p+q)%2==0: # 왼쪽 위와 색이 같아야 하는 곳
                    #왼쪽 위가 흰색인 경우 해당 타일이 흰색이어야 되는데 그렇지 않을 때
                    if board[p][q] != 'W' :
                        w +=1
                    #왼쪽 위가 검은색인 경우 해당 타일이 검은색이어야 되는데 그렇지 않을 때
                    elif board[p][q] != 'B' : 
                        b += 1
                else :  # 왼쪽 위와 색이 달라야 하는 곳 검사
                    # 왼쪽 위가 흰색인 경우 해당 타일이 검은색이어야 되는데 그렇지 않을 때
                    if board[p][q] != 'B':
                        w += 1
                    elif board[p][q] != 'W':
                        b += 1
        res.append(w)
        res.append(b)
print(min(res))