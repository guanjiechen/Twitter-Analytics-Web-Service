#!/usr/bin/python
# Filename: q5placecombine.py

i=46
prefix = "part-000"
fout = open('q5data4', 'w')

while i<=60:
    num = str(i)
    if i < 10:
        num = '0' + num
    filename = prefix + num
    fin = open(filename)
    while True:
        line = fin.readline()
        if len(line) == 0:
            break
        #tokens = line.split()
        #words = len(tokens)
        #if words < 2 or words > 3:
            #continue
        time, place, id = line.split('\t')
        place = place.strip()
        result = place + '\t' + time + '\t' + id
        fout.write(result)
    fin.close()
    i+=1

fout.close()
