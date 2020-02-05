import sys

rows = int(sys.argv[1])

if rows >= 0:
    for i in range(1, rows+1):
        for j in range(0, rows-i):
            print(" ", end = "")
        for k in range(0, i):
            print("*", end = "")
        print("")
else:
    print("Error: input value must be >=0")