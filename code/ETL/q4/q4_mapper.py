#!/usr/bin/python
# Filename:q4_mapper.py

import sys
import os
import json
import time

for line in sys.stdin:
	j = json.loads(line)
	timeString = j['created_at']
	timeString = timeString[0:-11]+timeString[-5:]	
	timeOrigin = time.strptime(timeString, "%a %b %d %X %Y")
	timeOutput = time.strftime("%Y-%m-%d %X", timeOrigin)
	tweetId = j['id_str']
	tweetText = j['text']	
	print timeOutput + '\t' + tweetId + ':' + tweetText.encode("unicode-escape")	