public class Alu {
    public static int Add(int x, int y){
        return x+y;
    }

    public static int sub(int x,int y){
        return x-y;
    }

    public static int multiply(int x,int y){
        return x*y;
    }

    public static int divide(int x,int y){
        if(y==0){
            return -1;
        }
        else{
            return x/y;
        }
    }
    public static void main(String[] args) {
        int a = Add(5, 7);
        int b= sub(7, 4);
        int c= multiply(5, 7);
        int d= divide(12 , 6);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
