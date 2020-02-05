import sys

if(len(sys.argv)<4):
    raise Exception("You need to enter three arguments to this program. Try typing 'run InputAnalyzer 2.5 8 9' in Python, or 'java InputAnalyzer 2.5 8 9' on the command line.")

a = float(sys.argv[1])
b = float(sys.argv[2])
c = float(sys.argv[3])

# 1) Determining if a, b, and c are all non negative numbers
allPosNumbs = bool(0 <= a and 0 <= b and 0 <= c)
print("The numbers {}".format(a) + ", {}".format(b) + ", and {}".format(c) + " are all non-negative numbers: {}".format(allPosNumbs))

# 2) Determine if at least one of a, b, or c is an odd number

oneOddNumb = bool(bool(a - int(a) == 0 and a%2 != 0) or bool(b -int(b) == 0 and b%2 != 0) or bool(c-int(c) ==0 and c%2 != 0))

print("At lease one of {}".format(a) + ", {}".format(b) + ", or {}".format(c) + " is odd: {}".format(oneOddNumb))

# 3) Determine if a, b, and c were entered in decreasing order 

bInBetween = bool(a>b and b>c)

print("The numbers {}".format(a) + ", {}".format(b) + ", and {}".format(c) + " are in strictly decreasing order: {}".format(bInBetween))

# 4) Determine if a, b, and c, are all non-negative numbers or are entered in decending order

condition1and3 = bool(allPosNumbs or bInBetween)

print("The numbers {}".format(a) + ", {}".format(b) + ", and {}".format(c) + " are all non-negative numbers or are in strictly decreasing order: {}".format(condition1and3))

# 5) Determine if a, b, and c are all non-negative and none of them are odd

noOddNumbs = bool(bool(a - int(a) != 0 or a%2 == 0) and bool(b - int(b) != 0 or b%2 == 0) and bool(c - int(c) != 0 or c%2 == 0))

posAndEvenNumbs = bool(noOddNumbs and allPosNumbs)

print("The numbers {}".format(a) + ", {}".format(b) + ", and {}".format(c) + " are all non-negative numbers and none of them are odd: {}".format(posAndEvenNumbs)) 

