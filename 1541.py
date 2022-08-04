# 백준 잃어버린 괄호 그리디 실버2
# +와 -로 된 사칙연산 식에 괄호를 적절히 쳐서 최소값 만들기
# 내 생각: -를 만나면 다음에 (를 넣고 또 -를 만나면 앞에 )를 친다
# 또한 -를 만났으나 마지막 숫자일 경우에도 괄호를 닫는다
import sys
# instr = sys.stdin.readline()
 
# start = 0 #괄호 시작위치
# for i in range(start, len(instr)):
#     if instr[i] == '-':
#         # a - b => a - ( b
#         instr = instr[:i+1] + '('+instr[i+1:]
#         print(instr)
#         start = i+1
#         print(start)

arr = sys.stdin.readline().split('-') #-로 쪼개기
sum = 0
for num in arr[0].split('+'):
    sum += int(num)

for num in arr[1:]:
    for i in num.split('+'):
        sum -= int(i)
print(sum)