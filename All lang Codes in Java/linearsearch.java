public class linearsearch {
    public static int ls(int arr[], int x){
        for(int i=0;i<arr.length;i++){
        if(arr[i]==x){
            return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[]={10,30,50,44,79,49};
        int a = 44;

        int result = ls(array,a);
        System.out.println("The Element :"+ a + "is Found at Position "+ result);
    }
}
