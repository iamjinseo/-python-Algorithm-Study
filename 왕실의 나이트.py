# 이코테 구현
# 8x8 좌표 평면상에서 현재 나이트가 위치한 곳의 좌표는?
# 브루트포스

coor = input()
# "ord('a') == 97"
x, y = ord(coor[0])-96, int(coor[1]) #x좌표 영어를 아스키로 변환하여 a~h를 1~8로 만들기

steps = [(-2, -1), (-1, -2), (1, -2), (2, -1), (2, 1), (1, 2), (-2, 1)]
result =0

for step in steps :
    nx = x+step[0]
    ny = y+step[1]
    if nx >=1 and ny>=1 and nx<=8 and ny<=8:
        result +=1 

print(result)

# 스텝 좌표를 모두 리스트에 넣은 뒤 지금 좌표에 스텝의 좌표를 하나하나 계산하면 다음 좌표가 된다
# 다음 좌표가 유효한지 검사 후 유효하면 결과 +1