__author__ = 'Zhang'
f = open("/Users/Zhang/Desktop/outputdata", "r")


current_key = None
sum = 0

while True:
    line = f.readline()

    if line:
        line = line.strip()
        # key, value = line.split('\t', 1)
        s = line.split('\t')
        key=s[0]
        value=s[1]
        if current_key == key:
            sum += int(value)
        else:
            if current_key:
                result = current_key + '\t' + str(sum)
                print result
            #switch to next origin
            current_key = key
            sum = int(value)
    else:
        break

#for last key
if current_key:
    result = current_key + '\t' + str(sum)
    print result