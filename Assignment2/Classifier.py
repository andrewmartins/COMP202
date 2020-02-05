import sys

def isTypeA(b, c, colour):
    if (colour.lower() == "grey"):
        if(b == 1 and c == 0):
            return True
        elif(b == 2 and c ==1):
            return True
        elif b == 3 and c ==2:
            return True
        elif b == 4 and c ==3:
            return True
        elif (b == 4 or b == 5) and c == 4:
            return True
    return False

def isTypeB(b, c, color):
    if color.lower() == "blue" or color.lower() == "grey":
        if b == 4 and (c == 4 or c == 5):
            return True
        elif b == 5 and (c == 6 or c == 7):
            return True
        elif b == 6 and (c == 8 or c == 9):
            return True
        elif b == 7 and c == 10:
            return True
        elif b == 8 and c == 11:
            return True
    return False

def isTypeC(b, c, color):
    if color.lower() == "blue" or color.lower() == "green":
        if b == 5 and (c == 6 or c == 7):
            return True
        elif b == 6 and (c == 8 or c == 9):
            return True
        elif b == 7 and c == 10:
            return True
        elif b == 8 and c == 11:
            return True
        elif b == 9 and c == 12:
            return True
    return False

if len(sys.argv) < 2:
    print("You need to enter three arguments into this program. Try typing 'run Classifier 1 0 Grey on the command line.")
    exit
b = int(sys.argv[1])
c = int(sys.argv[2])
color = str(sys.argv[3])

if isTypeA(b, c, color) and isTypeB(b, c, color):
    print("The type of bird is A B")
elif isTypeB(b, c, color) and isTypeC(b, c, color):
    print("The type of bird is B C")
elif isTypeA(b, c, color) and isTypeC(b, c, color):
    print("The type of bird is A C")
elif(isTypeA(b, c, color)):
    print("The type of bird is A")
elif(isTypeB(b, c, color)):
    print("The type of bird is B")
elif(isTypeC(b, c, color)):
    print("The type of bird is C")
else:
    print("The bird is not part of the study")

