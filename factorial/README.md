Write a method that calculates the factorial of a given number.
Factorial is the product of all positive integers less than or equal to n.
For example, factorial(4) = 4x3x2x1 = 24.

Solution:
LongStream.rangeClosed(2, n) method creates a Stream of longs from [2 to n].

Lambda function supplied for reduce (a,b) → a * b will multiply each pair of a and b and return the result.
The result then carries over to a for the next round.
The value of 1 is used in the reduction method as the starting value for variable a for the first iteration.

