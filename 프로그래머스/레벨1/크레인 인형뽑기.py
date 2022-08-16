def solution(board, moves):
    res = []
    answer = 0
    
    for move in moves:
        for i in range(0, len(board)): # 인형 담기
            if board[i][move-1] != 0: # move위치에서 열만 움직이면서 인형 뽑기
                res.append(board[i][move-1]) #결과 리스트에 담기
                board[i][move-1]=0 #인형 뽑힘(없어짐)
                
                if len(res)>1 and res[-1] == res[-2]: #인형 연속이면 없애고 answer+1
                    res = res[:-2]
                    answer += 2
                break
    return answer
