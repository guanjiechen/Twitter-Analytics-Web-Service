#! /usr/bin/python
# Filename: q3_reducer.py

import sys

current_origin = None
result = []

for line in sys.stdin:
    line = line.strip()
    origin, re = line.split('\t', 1)

    if current_origin == origin:
        if re not in result:
            result.append(re)
    else:
        if current_origin:
	    	result = current_origin + '\t' + ','.join(id for id in result)
            print result
        #switch to next origin
        current_origin = origin
        result = [re]


#for last origin
if current_origin:
    result = current_origin + '\t' + ','.join(id for id in result)
    print result