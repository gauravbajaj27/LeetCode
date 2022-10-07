### Input: Two integers, num1 and num2.
### Output: An integer, x, such that number of set bits in num2 and x are same and XOR of x and num1 is minimal.

### Logical Explanation:
Let n1 and n2 be the no. of set bits of num1 and num2, respectively.
Consider the following 3 possible cases : -
    
    1. n1 == n2
        a. In this case, x = num1.
        b. x will have same no. of bits as num2.
        c. Since x == num1, x ^ num1 = 0 (minimum value of an XOR operation possible).
        
    2. n1 < n2
        a. In this case, we will initialize x = num1.
        b. Since, x and num2 should have equal no. of set bits, we have to add some extra set bits in x. At the same time, we need to minimize the XOR of x and num1.
        c. So, a better way would be to keep n1 set bits of x and num1 at the same corresponding locations.
        d. For the extra bits (n2-n1), we will set those many bits in x starting from the LSB position. Note: we will only add set bits to initially unset locations in x.
        
    3. n1 > n2
        a. In this case, we will initialize x = num1.
        b. Since x and num2 should have same no. of set bits, we have to remove some extra bits from x. And at the same time, we also have to minimize the XOR of num1 and x.
        c. Hence, it would be better to remove (n1-n2) no. of set bits starting from the LSB position in x.
        d. In this way, we would get minimum XOR of num1 and x possible.