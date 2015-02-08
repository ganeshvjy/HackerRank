def find_gcd(a,b):
    while b > 0:
        temp = b
        b = a % b
        a = temp
    return a

def gcd(num):
    result = num[0]
    i = 1
    while i < len(num):    
        result = find_gcd(result, num[i])
        i += 1
    return result

def sherlock_gcd(temp):
    l = [int(each) for each in temp.split()]
    result = gcd(l)
    status = 1
    if result > 1:
        status = 0
    return status
    
t = input()
output = []
for i in range(t):
    n = input()
    temp = raw_input()
    output.append(sherlock_gcd(temp))

for i in output:
    if i == 1:
        print "YES"
    else:
        print "NO"
