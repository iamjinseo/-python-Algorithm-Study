# 백준 11723 집합 실버5 / 비트마스킹
import sys

# 수행 연산 수
M = int(sys.stdin.readline())

#공집합 S
S = 0

for i in range(0, M):
    # 명령어 입력
    command = sys.stdin.readline()
    
    # all, empty 명령어때문에 추가한 부분임. 뒤에 숫자가 없으니 오류를 일으켜서 추가함
    # 입력된 명령어 숫자와 커맨드로 나누기
    if len(command.split()) >1:
        num = int(command.split()[1])-1 # x는 1이하 20이지만 이진수에서는 0의자리~19의자리로 나타내야 하므로 -1
    command = command.split()[0]

    # 명령 수행
    # add : S에 x 추가하기. 있으면 무시
    if command == "add" :
        S= S | (1<<num)
    # remove : S에서 X 제거하기. 없으면 무시
    elif command == "remove":
        S = S & ~(1<<num)
    # check : S에 X가 있으면 1, 없으면 0 출력
    elif command == "check" :
        print("1" if S & (1<<num) else "0")
    # toggle : S에 X가 있으면 제거하고 없으면 추가하기
    elif command == "toggle" : 
        S = S ^ (1<<num)
    # all : 전체집합으로 만들기
    elif command == "all" : 
        S = (1<<20)-1
    # empty : 공집합으로 만들기
    elif command == "empty" : 
        S = 0