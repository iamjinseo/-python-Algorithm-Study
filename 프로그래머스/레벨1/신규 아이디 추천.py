def solution(new_id):
    answer = ''
    
    for letter in new_id.lower(): #1, 2단계
        if letter.isalpha() or letter.isnumeric() or letter == '-' or letter == '_':
            answer += letter
        if letter == '.' and len(answer)!=0 and answer[-1]!='.': #3단계
            answer += letter 
    print(answer)

    if len(answer)!=0:
        if answer[0]=='.': #4단계
            answer = answer[1:]
        if answer[-1]=='.':
            answer=answer[:-1]
    print(answer)
        
    if answer == "": #5단계
        answer += "a"
    print(answer)
        
    if len(answer) >= 16: # 6단계
        answer = answer[0:15]
        if answer[0]=='.': #4단계
            answer = answer[1:]
        if answer[-1]=='.':
            answer=answer[:-1]
    print(answer)
    
    if len(answer) <=2 and len(answer)>0: #7단계
        while len(answer)<3 : 
            answer += answer[-1]
    print(answer)
    return answer
