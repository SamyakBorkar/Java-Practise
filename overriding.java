class A{
    public void meth1(){
        System.out.println("This is method 1 of class A");
    }
}

class B extends A{
    public void meth1(){
        System.out.println("This is method 1 of class B");
    }
}

public class overriding {
    public static void main(String[] args) {
        B obj =new B();
        obj.meth1();
        A obj2 =new A();
        obj2.meth1();
    }
}
