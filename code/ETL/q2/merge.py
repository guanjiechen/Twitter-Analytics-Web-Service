#!/usr/bin/python
# Filename: merge.py

i=0
j=0
inprefix = 'part-000'
outprefix = 'q2data'
while i<=42:
    fileNum = str(i)
    if i<10:
        fileNum = '0'+fileNum
    infile = inprefix + fileNum
    fin = open(infile)
    k=i%5
    if k == 0:
        if j > 0:
            fout.close()
        j+=1
        outfile = outprefix + str(j)
        fout = open(outfile, 'w')
    while True:
        line = fin.readline()
        if len(line) == 0:
            break
        fout.write(line)
    fin.close()    
    i+=1
    
fout.close()

  
