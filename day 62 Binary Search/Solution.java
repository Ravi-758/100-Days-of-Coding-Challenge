class Main{
    int binarySearch(int arr[],int key,int low,int high){
        while(low<=high){
            int mid= low+(high-low)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                low = mid+1;
            }
            else
            high = mid-1;
        }
        return -1;
    }
    public static void main(String[] args){
        Main  m = new Main();
        
        int arr[] ={2,3,4,5,6,7,8};
        int size = arr.length;
        int key=3;
        int result = m.binarySearch(arr,key,0,size-1);
        if(result==-1)
        System.out.println("not found");
        else
        System.out.println("element is found "+result);
    }
}
