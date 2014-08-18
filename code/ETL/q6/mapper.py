__author__ = 'Zhang'
import sys
import os
import json
import time

# f = open('/Users/Zhang/Desktop/datasample').read()

json_data=open('/Users/Zhang/Desktop/datasample')

data = []
with open('/Users/Zhang/Desktop/datasample') as f:
    for line in f:
        j = json.loads(line)
        origin = j['user']['id_str']
        print str(origin) + '\t' + str('1')