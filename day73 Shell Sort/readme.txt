Shell sort is a generalized version of the insertion sort algorithm. It first sorts elements that are far apart from each other and successively reduces the interval between the elements to be sorted.

The interval between the elements is reduced based on the sequence used. Some of the optimal sequences that can be used in the shell sort algorithm are:

Shell's original sequence: N/2 , N/4 , …, 1
Knuth's increments: 1, 4, 13, …, (3k – 1) / 2
Sedgewick's increments: 1, 8, 23, 77, 281, 1073, 4193, 16577...4j+1+ 3·2j+ 1
Hibbard's increments: 1, 3, 7, 15, 31, 63, 127, 255, 511…
Papernov & Stasevich increment: 1, 3, 5, 9, 17, 33, 65,...
Pratt: 1, 2, 3, 4, 6, 9, 8, 12, 18, 27, 16, 24, 36, 54, 81....
Note: The performance of the shell sort depends on the type of sequence used for a given input array.

Working of Shell Sort
Suppose, we need to sort the following array.
Shell sort step
Initial array
We are using the shell's original sequence (N/2, N/4, ...1) as intervals in our algorithm.

In the first loop, if the array size is N = 8 then, the elements lying at the interval of N/2 = 4 are compared and swapped if they are not in order.
The 0th element is compared with the 4th element.
If the 0th element is greater than the 4th one then, the 4th element is first stored in temp variable and the 0th element (ie. greater element) is stored in the 4th position and the element stored in temp is stored in the 0th position.
Shell Sort step
Rearrange the elements at n/2 interval

This process goes on for all the remaining elements.
Shell Sort steps
Rearrange all the elements at n/2 interval
In the second loop, an interval of N/4 = 8/4 = 2 is taken and again the elements lying at these intervals are sorted.
Shell Sort step
Rearrange the elements at n/4 interval

You might get confused at this point.
Shell Sort step
All the elements in the array lying at the current interval are compared.

The elements at 4th and 2nd position are compared. The elements at 2nd and 0th position are also compared. All the elements in the array lying at the current interval are compared.
The same process goes on for remaining elements.
Shell Sort step
Rearrange all the elements at n/4 interval
Finally, when the interval is N/8 = 8/8 =1 then the array elements lying at the interval of 1 are sorted. The array is now completely sorted.
Shell Sort step
Rearrange the elements at n/8 interval
