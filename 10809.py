#알파벳 소문자로만 이루어진 단어 S가 주어진다.
# 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
# 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

word = input() #집어넣을 단어
output = [-1 for i in range(26)] #26가지 알파벳

#단어를 검사하며 집어넣음
for index, letter in enumerate(word): #enumerate()로 값과 인덱스 한번에 검사
    #예를들어 a가 나왔으면 a값-a값이므로
    #  0번째(a자리)에 나온 순서(index)가 들어갈 것임

    #조건문 쓰는 이유 = 중복제거
    if output[ord(letter)-ord('a')] == -1:
        output[ord(letter)-ord('a')] = index
    #예를 들어 a가 들어갈 위치(0번 인덱스)값이 -1이 아니라는 것은
    #이미 들어간 적이 있다는 뜻이므로 continue
    else : 
        continue

    #조건문을 안쓰면 aaple이라는 단어가 있을 때
    #  0번째 인덱스의 값이 0이 아닌 1이 나옴

#출력부분
for letter in output:
    print(letter, end=' ')
