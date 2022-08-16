def solution(s):
    answer = s
    n = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine']
    for i in range(len(n)):
        answer = answer.replace(n[i], str(i))
    return int(answer)
