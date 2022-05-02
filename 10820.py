#문자열분석
#문자열 N개가 주어진다. 이때, 문자열에 포함되어 있는 소문자,
# 대문자, 숫자, 공백의 개수를 구하는 프로그램을 작성하시오.
#각 문자열은 알파벳 소문자, 대문자, 숫자, 공백으로만 이루어져 있다.

#입력
#try except? => 문자열을 얼만큼 입력받는지 안알려줌
while True:
    try:
        str = input()
    except EOFError:
        break

#소문자, 대문자, 숫자, 공백 검사
for letter in str:
    asciiNum = ord(letter) #문자 하나의 아스키코드

    #공백
    if asciiNum == 32:
        output[index][3]+=1
    #숫자
    elif asciiNum>=48 and asciiNum<=57:
        output[index][2]+=1
    #대문자
    elif asciiNum >=65 and asciiNum<=90: 
        output[index][1]+=1
    #소문자
    elif asciiNum >= 97 and asciiNum <= 122:
        output[index][0]+=1
        

#이중리스트 출력
for x, y, z, q in output:
    print(x, y, z, q)