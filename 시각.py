# 이코테 구현
# N시 59분 59초까지 모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수 구하기

#3이 들어가는 초와 분, 시각을 따져 열심히 생각해 보았으나
#그런거 없고 브루트 포스로 푸는 것이다.

H = int(input()) #시간 입력

count = 0 #경우의 수

for h in range(H+1) :  # 시간
    for m in range(60): # 분
        for s in range(60): # 초
            # 00 00 00
            if '3' in str(H)+str(m)+str(s):
                count+=1
print(count)