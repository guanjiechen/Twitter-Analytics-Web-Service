#!/usr/bin/python
# Filename: q3-mapper.py

import sys
import os
import json
import time

for line in sys.stdin: 
    j = json.loads(line)
    if 'retweeted_status' in j:
        origin = j['retweeted_status']
        result =  origin['user']['id_str']
        result = result +'\t' +j['user']['id_str']
        print result
