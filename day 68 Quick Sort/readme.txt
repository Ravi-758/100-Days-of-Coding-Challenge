Like Merge Sort, QuickSort is a Divide and Conquer algorithm. It picks an element as a pivot and partitions the given array around 
the picked pivot. There are many different versions of quickSort that pick pivot in different ways. 

Always pick the first element as a pivot.
Always pick the last element as a pivot (implemented below)
Pick a random element as a pivot.
Pick median as the pivot.
The key process in quickSort is a partition(). The target of partitions is, given an array and an element x of an array as the pivot,
put x at its correct position in a sorted array and put all smaller elements (smaller than x) before x, and put all greater elements 
(greater than x) after x. All this should be done in linear time.


quicksort

Partition Algorithm: 

There can be many ways to do partition, following pseudo-code adopts the method given in the CLRS book. The logic is simple, we start 
from the leftmost element and keep track of the index of smaller (or equal to) elements as i. While traversing, if we find a smaller element,
we swap the current element with arr[i]. Otherwise, we ignore the current element. 

Pseudo Code for recursive QuickSort function:

/* low  –> Starting index,  high  –> Ending index */

quickSort(arr[], low, high) {

    if (low < high) {

        /* pi is partitioning index, arr[pi] is now at right place */

        pi = partition(arr, low, high);

        quickSort(arr, low, pi – 1);  // Before pi

        quickSort(arr, pi + 1, high); // After pi

    }

}

Pseudo code for partition()  

/* This function takes last element as pivot, places the pivot element at its correct position in sorted array, and places all smaller
(smaller than pivot) to left of pivot and all greater elements to right of pivot */

partition (arr[], low, high)
{
    // pivot (Element to be placed at right position)
    pivot = arr[high];  

    i = (low – 1)  // Index of smaller element and indicates the 
    // right position of pivot found so far

    for (j = low; j <= high- 1; j++){

        // If current element is smaller than the pivot
        if (arr[j] < pivot){
            i++;    // increment index of smaller element
            swap arr[i] and arr[j]
        }
    }
    swap arr[i + 1] and arr[high])
    return (i + 1)
}

Illustration of partition() : 

Consider: arr[] = {10, 80, 30, 90, 40, 50, 70}

Indexes:  0   1   2   3   4   5   6 
low = 0, high =  6, pivot = arr[h] = 70
Initialize index of smaller element, i = -1

 

Traverse elements from j = low to high-1
j = 0: Since arr[j] <= pivot, do i++ and swap(arr[i], arr[j])
i = 0 
arr[] = {10, 80, 30, 90, 40, 50, 70} // No change as i and j are same
j = 1: Since arr[j] > pivot, do nothing

 

j = 2 : Since arr[j] <= pivot, do i++ and swap(arr[i], arr[j])
i = 1
arr[] = {10, 30, 80, 90, 40, 50, 70} // We swap 80 and 30 

 

j = 3 : Since arr[j] > pivot, do nothing // No change in i and arr[]
j = 4 : Since arr[j] <= pivot, do i++ and swap(arr[i], arr[j])
i = 2
arr[] = {10, 30, 40, 90, 80, 50, 70} // 80 and 40 Swapped
