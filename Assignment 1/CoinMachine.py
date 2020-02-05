import sys
if(len(sys.argv)<3):
    raise Exception("You need to enter two arguments to this program. Try typing 'run CoinMachine 400 215' in Python, or python CoinMachine.py 400 215' on the command line.")
cash = int(sys.argv[1])
price = int(sys.argv[2])

#Determine the change required
change = cash - price
if(change<0):
    raise Exception('Not enough payment received')

#Change in toonies
numbOfToonies = int(change/200)

#change in loonies
changeinL = change - numbOfToonies*200
numbOfLoonies = int(changeinL/100)

#change in Quarters
changeinQ = changeinL - numbOfLoonies*100
numbOfQuart = int(changeinQ/25)

#change in dimes
changeinD = changeinQ - numbOfQuart*25
numbOfDimes = int(changeinD/10)

#change in nickels
changeinN = changeinD - numbOfDimes*10
numbOfNick = int(changeinN/5)

#Print Statements

print("Amount received: {}".format(cash))
print("Cost of Item: {}".format(price))
print("Required change: {}".format(change))
print("Change:")
print("toonies: {}".format(numbOfToonies))
print("loonies: {}".format(numbOfLoonies))
print("quarters: {}".format(numbOfQuart))
print("dimes: {}".format(numbOfDimes))
print("nickels: {}".format(numbOfNick))

