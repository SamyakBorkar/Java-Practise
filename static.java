class statinit {
  
    statinit(){
        System.out.println("This is constructor");
    }
    {
        System.out.println("This is init block");
     }
    static{
        System.out.println("Hey this is static block");
    }
    public static void main(String[] args) {
        System.out.println("this is main method");
        statinit a =new statinit();

      
    }
}
