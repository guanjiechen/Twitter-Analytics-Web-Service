#!/usr/bin/python
# Filename: merge.py

i=0
prefix = 'part-000'
fout = open('q3data', 'w')
while i<=25:
    fileNum = str(i)
    if i<10:
        fileNum = '0'+fileNum
    filename = prefix + fileNum
    fin = open(filename)
    while True:
        line = fin.readline()
        if len(line) == 0:
            break
        line, empty = line.split("\n")
        origin, rt = line.split("\t")
        retweets = rt.split(",")
        retweets.sort(key=int)
        result = origin + "\t" + ",".join(userid for userid in retweets) + "\n"
        fout.write(result)
    fin.close()
    i+=1

fout.close()
