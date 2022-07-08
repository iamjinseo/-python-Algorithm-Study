# 백준 2675 문자열 반복 브론즈2 / 문자열
import sys

#테스트케이스
T = int(sys.stdin.readline())

for i in range(T):
    # 한글자씩 반복할 숫자와 문자열 입력
    R, S = sys.stdin.readline().split();

    result ="" #결과로 보여줄 문자열
    for letter in S: #한 문자열의 문자를
        for j in range(int(R)): #num만큼 더하기
            result+=letter
    print(result)
