Java Program to Check Armstrong Number between Two Integers
 positive integer with digits p, q, r, s…, is known as an Armstrong number of order n if the following condition is fulfilled.

pqrs... = pn + qn + rn + sn +....
Example:

370 = 3*3*3 + 7*7*7 + 0 
   =  27 + 343 + 0
   =  370
Therefore, 370 is an Armstrong number.

Examples:
Input : 100 200
Output :153
Explanation : 100 and 200 are given  
two integers.
 153 = 1*1*1 + 5*5*5 + 3*3*3  
     = 1 + 125 + 27
     =  153
Therefore, only 153 is an Armstrong number between 100 and 200.
Approach:

Firstly, we will traverse through all the numbers in the given range. Then, for every number, we have to count the number of digits in it. If the number
of digits in the current number is n then, find the sum of (n-th) power of all the digits in the number stated. And if the sum is equal to the current number i
, then print the number
