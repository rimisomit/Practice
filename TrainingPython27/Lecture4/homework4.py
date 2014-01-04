balance = float(raw_input('Enter the outstanding balance on your credit card: '))
interest_rate = float(raw_input('Enter the annual credit card interest rate as a decimal: '))
min_payment_rate = float(raw_input('Enter the minimum monthly payment rate as a decimal: '))

def finance(b, i, m, month):
    min_payment = b * m
    interest_paid = b * i
    principal_paid = min_payment - interest_paid
    rem_balance = b - principal_paid
    return rem_balance

#print finance(balance, interest_rate, min_payment_rate, 1)
total_paid = 0
for month in range(1,13):
    min_payment = balance * min_payment_rate
    interest_paid = balance * interest_rate/12
    principal_paid = min_payment - interest_paid
    balance = balance - principal_paid
    total_paid = total_paid + interest_paid + principal_paid 
    
    print 'Month', month
    print 'Minimum monthly payment', min_payment
    print 'Interest paid', interest_paid
    print 'Principle paid', principal_paid
    print 'Remaining balance:', balance
    
    if month == 12:
        print 'RESULT'
        print 'Total paid', total_paid
        print 'Remaining balance:', balance 
        