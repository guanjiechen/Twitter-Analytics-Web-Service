#! /usr/bin/python
# Filename: q5place_reducer.py

import sys

current_place = None

for line in sys.stdin:
    place = line.strip('\n')

    if current_place != place:
        current_place = place
	print place
