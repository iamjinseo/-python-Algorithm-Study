# 이코테 그리디 모험가 길드
# 공포도가 높은 모험가를 모험에 내보내는 문제
# 공포도가 X면 모험가가 X명 이상인 곳에 포함시켜야함
# 모험을 보낼 수 있는 최대 그룹 수는?

#예를 들어 2 3 1 2 2 와 같이 5명의 공포도 주어짐
# 내가 한 생각은 그냥 각 모험가의 공포도만큼의 배열 생성
# 남는 배열 있으면 쑤셔넣기인데 그냥 말이 안됨(거의 생각 못함)

# 정답은 공포도를 오름차순 정렬하고 
# 공포도를 순회하면서 일단 현재 공포도를 갖고있는 사람을 그룹에 넣고
# 그룹 인원수가 현재 공포도 이상이면(내가 안쫄아도 되면)그룹 구성을 끝내고 그룹 수를 +1

#인원수 입력
n = int(input())

# 인원수만큼의 공포도 입력
data = list(map(int, input().split()))
# 공포도 오름차순 정렬
data.sort()

count =0 # 그룹 내 인원수 
result = 0 # 최종 그룹 수

# 공포도 순회
for i in range(len(data)):
    count +=1   # 현재 공포도의 사람을 그룹에 넣기
    if count >= i : # 그룹 인원수가 현재 공포도 이상이면
        result +=1   # 그룹 하나를 구성한다
        count =0 # 그룹의 인원수를 초기화한다(다음 그룹 구성으로 넘어간다)

print(result)