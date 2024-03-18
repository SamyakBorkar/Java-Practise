public class BinarySearch {
    public static int bs(int arr[],int left, int right,int x){
        while (right>left){
            int mid = (left+right)/2;
            if (arr[mid]==x) {
                return mid;
                }
            else if(arr[mid]>x){
                right =mid-1;

            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,12,14,15,58,94,104};
        int n= arr.length;
        int y= 94;
        int result = bs(arr, 0, n-1, y);
        System.out.println("Element"+y+"Found at position"+result);
    }
}
