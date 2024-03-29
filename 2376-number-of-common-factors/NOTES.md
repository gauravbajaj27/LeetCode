### Input: 2 integers
### Output: Number of common factors between the 2 integers

### Logical Explanation: -
1. Largest number that can be a common factor of both a and b is min(a,b).
2. This is because a number which lies between a and b could divide either of a or b (whichever is bigger), but not both.
3. Hence, we run a loop starting from i = 1 to min(a,b).
4. At each iteration, we check if i divides both a and b.
5. If it does, we increment the count of total common factors found so far by 1. Else, we continue.
6. Our final answer is the value of the count after the loop ends.