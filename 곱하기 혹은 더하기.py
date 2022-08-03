# 이코테 그리디 곱하기 혹은 더하기
# 숫자로 된 문자열이 있을 때 각 숫자를 곱하든 더하든 해서 최고값을 만들기
# 내가 처음에 한 생각은 0이면 무조건 더하기고 나머지를 곱하기라 생각함
# 알고보니 1이 나와도 더하기를 해야 유리함을 알아냄

# 숫자 문자열 입력
data = input()
# 결과 (프로그램 시작 시 결과는 맨 앞 수)
# 숫자 앞에서부터 연산해온 결과라고 볼 수 있음
result = int(data[0])

for i in range(1, len(data)):
    num = int(data[i])
    if num <=1 or result<=1 : #현재 수가 1 이하거나 앞 수가 1 이하일 때
        result += num
    else :
        result *= num

print(result)