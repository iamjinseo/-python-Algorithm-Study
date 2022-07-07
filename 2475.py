# 5자리 수 + 검증수
# 검증수는 고유번호의 처음 5자리에 들어가는 5개의 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지이다.
import sys
nums = list(map(int, sys.stdin.readline().split()))
sum=0
for num in nums:
    sum+=(num^2)
    print(sum)
print(sum%10)