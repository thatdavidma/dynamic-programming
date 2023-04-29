# 509. Fibonacci Number

# The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

# F(0) = 0, F(1) = 1
# F(n) = F(n - 1) + F(n - 2), for n > 1.

# Given n, calculate F(n).

# Input: n = 2
# Output: 1
# Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

def fib(self, n: int) -> int:
    if n == 0: return 0
    if n == 1 or n == 2: return 1
    a, b = 0, 1
    for i in range(n):
        temp = b
        b = a + b
        a = temp
    return a