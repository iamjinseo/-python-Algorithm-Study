# 이코테 구현
# 알파벳 대문자와 0~9로만 구성된 문자열 입력 후 알파벳끼리 정렬하고 뒤에는 숫자 더한 값 출력
# K1KA5CB7 => ABCKK13

# 문자열의 문자를 하나하나 순회해서 문자열 리스트에 쑤셔넣은 뒤 숫자는 따로 count변수에 더하는 식으로 진행

instr = input()
count =0 #숫자 더하는 곳
result =[] #최종 문자열 리스트

for letter in instr:
    try: #글자를 숫자로 만들어서 1 더하기
        count+=int(letter)
    except: #글자가 숫자 아니면 걍 결과물에 더하기
        result.append(letter)
#알파벳 정렬
result.sort()
if count!=0: #숫자 있으면 리스트에 삽입
    result.append(count)
print(*result, sep="") #공백없이출력