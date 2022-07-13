# 백준 / 1085 / 직사각형에서 탈출 / 브론즈3
import sys
coo = list(map(int, sys.stdin.readline().split())) # x, y, w, h
coo[2] -= coo[0] #w를 x와의 차이값으로 변화
coo[3] -= coo[1] #h를 y와의 차이값으로 변화
print(sorted(coo)[0])