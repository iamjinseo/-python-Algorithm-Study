#문자열분석
#문자열 N개가 주어진다. 이때, 문자열에 포함되어 있는 소문자,
# 대문자, 숫자, 공백의 개수를 구하는 프로그램을 작성하시오.
#각 문자열은 알파벳 소문자, 대문자, 숫자, 공백으로만 이루어져 있다.

#입력
#try except? => 문자열을 얼만큼 입력받는지 안알려줌
while True:
    try:
        str = input()
        lower , upper, num, blank = 0,0,0,0
        for letter in str:
            asciiNum = ord(letter) #문자 하나의 아스키코드
            #공백
            if asciiNum == 32:
                blank+=1
            #숫자
            elif asciiNum>=48 and asciiNum<=57:
                num+=1
            #대문자
            elif asciiNum >=65 and asciiNum<=90: 
                upper+=1
            #소문자
            elif asciiNum >= 97 and asciiNum <= 122:
                lower+=1
        print(lower, upper, num, blank)
    except EOFError:
        break


#배운 점
#끝없이 입력하기때문에 try except를 해야하는구나...
#굳이 이중리스트를 만들어서 각 문자열에 해당하는 소문자,대문자,공백,숫자 갯수를 일일이 세서 넣을 필요 없이 그때그때 구해서 출력하면 되는구나...
