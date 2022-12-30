1. First Iteration (Compare and Swap)

Starting from the first index, compare the first and the second elements.
If the first element is greater than the second element, they are swapped.
Now, compare the second and the third elements. Swap them if they are not in order.
The above process goes on until the last element.
Follow the below steps to solve the problem:

Run a nested for loop to traverse the input array using two variables i and j, such that 0 ≤ i < n-1 and 0 ≤ j < n-i-1
If arr[j] is greater than arr[j+1] then swap these adjacent elements, else move on
Print the sorted array
Below is the implementation of the above approach:
Output
Sorted array: 
1 2 4 5 8 
Time Complexity: O(N2)
Auxiliary Space: O(1) 

Optimized Implementation of Bubble Sort: 
The above function always runs O(N2) time even if the array is sorted. It can be optimized by stopping the algorithm if the inner loop didn’t cause any swap. 
