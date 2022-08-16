dis = {1:(0,0), 2:(0,1), 3:(0,2), 4:(1,0), 5:(1, 1), 6:(1, 2), 7:(2,0), 8:(2,1), 9:(2,2), -1:(3,0), 0:(3,1), -2:(3,2)}
def solution(numbers, hand):
    answer = ''
    l, r = -1, -2
    for n in numbers:
        if n==1 or n==4 or n==7:
            answer += 'L'
            l = n
        elif n==3 or n==6 or n==9 :
            answer += 'R'
            r = n
        else : 
            #거리 구하기
            disl = abs(dis[l][0]-dis[n][0])+abs(dis[l][1]-dis[n][1])            
            disr = abs(dis[r][0]-dis[n][0])+abs(dis[r][1]-dis[n][1])            
            if disl < disr: #왼손이 더 가까우면
                l = n
                answer += 'L'
            elif disl == disr: #같은거리면
                if hand=="right":
                    r=n
                    answer += 'R'
                else:
                    l=n
                    answer += 'L'
            else : #오른손이 더 가까우면
                r= n
                answer += 'R'                
    return answer
