Characteristics of counting sort:
Counting sort makes assumptions about the data, for example, it assumes that values are going to be in the range of 0 to 10 or 10 – 99, etc, Some other assumption counting sort makes is input data will be all real numbers.
Like other algorithms this sorting algorithm is not a comparison-based algorithm, it hashes the value in a temporary count array and uses them for sorting.
It uses a temporary array making it a non-In Place algorithm.
Recommended Problem
Counting Sort
Sorting
Algorithms
Cisco
Goldman Sachs
+1 more
Solve ProblemSubmission count: 30.7K
Example:

For simplicity, consider the data in the range of 0 to 9. 
Input data: {1, 4, 1, 2, 7, 5, 2}
Take a count array to store the count of each unique object.
Follow the below illustration for a better understanding of the counting sort algorithm

Illustration:
scene00721


Now, store the count of each unique element in the count array
If any element repeats itself, simply increase its count.
scene00865

Here, the count of each unique element in the count array is as shown below:
Index:  0  1  2  3  4  5  6  7  8  9
Count: 0  2  2  0   1  1  0  1  0  0
scene01153

Modify the count array such that each element at each index stores the sum of previous counts.
Index:   0  1  2  3  4  5  6  7  8  9
Count:  0  2  4  4  5  6  6  7  7  7
The modified count array indicates the position of each object in the output sequence.
Find the index of each element of the original array in the count array. This gives the cumulative count.
scene01297

scene01369

Rotate the array clockwise for one time.
Index:  0 1 2 3 4 5 6 7 8 9 
Count: 0 0 2 4 4 5 6 6 7 7
  scene02881

  Output each object from the input sequence followed by increasing its count by 1.
  Process the input data: {1, 4, 1, 2, 7, 5, 2}. The position of 1 is 0.
  Put data 1 at index 0 in output. Increase count by 1 to place next data 1 at an index 1 greater than this index.
scene02521

After placing each element in its correct position, decrease its count by one.
