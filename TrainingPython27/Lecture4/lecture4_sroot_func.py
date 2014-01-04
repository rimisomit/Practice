x = 100
divisors = ()
for i in range(1, x):
    if x%i == 0:
        divisors = divisors + (i,)

print divisors
print divisors[0] + divisors[1]
print divisors[2:4]
