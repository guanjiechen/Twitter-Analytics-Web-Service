#!/usr/bin/python
# Filename: q5mapper.py

import sys
import json
import time
import re

regexp = re.compile("[^A-Za-z]+")
place = []
fin = open("place")
while True:
    line = fin.readline()
    if len(line) == 0:
        break
    line = line.strip()
    line = ' ' + line + ' '
    place.append(line)
fin.close()
    
for line in sys.stdin: 
    j = json.loads(line)
    
    timeString = j['created_at']
    timeString = timeString[0:-11]+timeString[-5:]	
    timeOrigin = time.strptime(timeString, "%a %b %d %X %Y")
    timeOutput = time.strftime("%Y-%m-%d %X", timeOrigin)

    tweetid = j['id_str']
    
    text = j['text']
    rtext = re.sub(regexp, ' ', text)
    rtext = ' ' + rtext + ' '
    for name in place:
        t = rtext.find(name)
        if t < 0:
            continue
        print timeOutput + "\t" + name + "\t" + tweetid
