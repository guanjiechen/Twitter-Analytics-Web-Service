#!/usr/bin/python
# Filename: eg.py

i=0
prefix = "part-000"
fout = open('data', 'w')

while i<=14:
    num = str(i)
    if i < 10:
        num = '0' + num
    filename = prefix + num
    fin = open(filename, 'r')
    for line in fin:
	line = line.decode("unicode_escape").encode('utf-8');
	line += 'zhangnihqinghaohshengyiz'
        fout.write(line)
    fin.close()
    i+=1

fout.close()

