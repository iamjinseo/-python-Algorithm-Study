str = input()
for letter in str:
    if letter.isupper() :
        if ord(letter)+13>90:
            print(chr(ord(letter)+13-26), end='')
        else:
            print(chr(ord(letter)+13), end='')
    elif letter.islower():
        if ord(letter)+13>122:
            print(chr(ord(letter)+13-26), end='')
        else:
            print(chr(ord(letter)+13), end='')
    else : 
        print(letter, end='')