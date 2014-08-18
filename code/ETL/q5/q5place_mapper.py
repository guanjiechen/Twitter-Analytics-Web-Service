#!/usr/bin/python
# Filename: q5place-mapper.py

import sys
import json
import re

regexp = re.compile("[^A-Za-z]+")

for line in sys.stdin:
    en = True
    j = json.loads(line)
    place = j['place']
    if place != None:
        name = place['name']
        words = name.split()
        if len(words) > 3:
            continue
        if len(words) == 1 and len(words[0]) < 2:
            continue
        for item in words:
            if regexp.search(item) is not None:
                en = False
                break
        if en:
            print name
