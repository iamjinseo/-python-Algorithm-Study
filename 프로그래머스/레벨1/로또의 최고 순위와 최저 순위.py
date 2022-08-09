def solution(lottos, win_nums):
    answer = []
    cnt1, cnt2 =0, 0
    for i in lottos :
        if i == 0: #0을 그냥 당첨으로 해버리기
            cnt1 += 1
        if i in win_nums: #맞는 거만 세기
            cnt2 += 1
    answer.append(cnt1+cnt2) #최고순위
    answer.append(cnt2) #최저순위
    
    for i in range(len(answer)):
        answer[i] -= 7
        answer[i] *= -1
        if answer[i] == 7:
            answer[i] = 6   
    return answer
