public class SGGS {
    {
        System.out.println("This is init block "+this);
    }
    public SGGS(){
        System.out.println("This is Constructor"+this);
    }
    public static void main(String[] args) {
        SGGS o =new SGGS();
        System.out.println(o);
    }
    public String toString(){
        return "Samyak";
    }
}
