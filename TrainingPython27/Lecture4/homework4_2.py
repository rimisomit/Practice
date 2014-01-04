initialbalance = 32000 #float(raw_input('balance: '))
rate = 0.2 #float(raw_input('rate: '))

month_rate = rate/12
payment = 0
balance = initialbalance
delta = 0.01
# 
# 
while balance > 0:
    payment = payment + delta
    month = 0
    balance = initialbalance
    while month < 12 and balance > 0:
        balance = balance*(1 + month_rate) - payment
        month = month +1
print 'Result'        
print 'Balance', balance 
print 'Payment', payment
print 'Month', month

    
