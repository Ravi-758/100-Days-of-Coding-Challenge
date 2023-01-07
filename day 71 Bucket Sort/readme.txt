In this tutorial, you will learn about the bucket sort algorithm and its implementation in Python, Java, C, and C++.

Bucket Sort is a sorting algorithm that divides the unsorted array elements into several groups called buckets. Each bucket is then sorted by using any of the suitable sorting algorithms or recursively applying the same bucket algorithm.

Finally, the sorted buckets are combined to form a final sorted array.

Scatter Gather Approach

The process of bucket sort can be understood as a scatter-gather approach. Here, elements are first scattered into buckets then the elements in each bucket are sorted. Finally, the elements are gathered in order.

Bucket Sort Working
Working of Bucket Sort
Working of Bucket Sort
Suppose, the input array is:
Bucket Sort Steps
Input array

Create an array of size 10. Each slot of this array is used as a bucket for storing elements.
Bucket Sort Steps
Array in which each position is a bucket
Insert elements into the buckets from the array. The elements are inserted according to the range of the bucket.

In our example code, we have buckets each of ranges from 0 to 1, 1 to 2, 2 to 3,...... (n-1) to n.
Suppose, an input element is .23 is taken. It is multiplied by size = 10 (ie. .23*10=2.3). Then, it is converted into an integer (ie. 2.3≈2). Finally, .23 is inserted into bucket-2.
Bucket Sort Steps
Insert elements into the buckets from the array

Similarly, .25 is also inserted into the same bucket. Everytime, the floor value of the floating point number is taken.

If we take integer numbers as input, we have to divide it by the interval (10 here) to get the floor value.

Similarly, other elements are inserted into their respective buckets.
Bucket Sort Steps
Insert all the elements into the buckets from the array
The elements of each bucket are sorted using any of the stable sorting algorithms. Here, we have used quicksort (inbuilt function).
Bucket Sort Steps
Sort the elements in each bucket
The elements from each bucket are gathered.

It is done by iterating through the bucket and inserting an individual element into the original array in each cycle. The element from the bucket is erased once it is copied into the original array.
Bucket Sort Steps
Gather elements from each bucket
