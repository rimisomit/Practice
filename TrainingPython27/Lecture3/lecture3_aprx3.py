def withinEpsilon(x, y, epsilon):
    """x, y, epsilon all ints or floats
       returns true if x is within epsilon of y"""
    return abs(x - y) <= epsilon

if withinEpsilon(25, 26, 1):
    print 'yes'
else:
    print 'no'

if withinEpsilon(25, 26, 0.9):
    print 'yes'
else:
    print 'no'