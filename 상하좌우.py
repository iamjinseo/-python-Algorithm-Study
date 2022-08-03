# 이코테 구현
# L R U D 로 2차원 평면에서의 이동을 구현

# 내 생각은 좌표 밖을 빠져나갈 때의 예외처리가 중요한데
# 각 L R U D 이동 시마다 조건을 두는 것이다.
# 예를 들어 내가 완쪽 끝에 있을 땐 L을 무시하는 것이다.
# if 현재좌표 == (1, N) : continue

N = int(input()) # N 입력
plans = input().split() #이동 계획
x, y =1,1 #! 좌표

# ! L, R, U, D에 따른 이동방향
dy = [-1, 1, 0, 0]
dx = [0, 0, -1, 1]
move_types = ['L', 'R', 'U', 'D'] #이동 방향

for plan in plans:
    for i in range(len(move_types)): #이동 계획이 LRUD중 무엇인지 찾기
        if plan == move_types[i]:
            #좌표 계산
            nx = x + dx[i]
            ny = y + dy[i]
    if nx<1 or ny<1 or nx>N or ny>N: #예외처리
        continue
    #이동 수행
    x, y= nx, ny

print(x,y)
