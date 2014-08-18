#!/usr/bin/python
# Filename:parseJSON_mapper.py

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
	user = j['user']
	user_id = user['id_str']
	result = timeOutput + '\t' + user_id + '\t' + j['id_str']
	print result