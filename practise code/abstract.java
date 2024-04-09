abstract class AbstractClassExample{
	public abstract void get();
	public abstract void fly();

	public void set(){
		System.out.println("Hey this is set method");
	}

}

class Implementation extends AbstractClassExample{
	public void get(){
		System.out.println("Hey this is get method");
	} 
	public void fly(){
		System.out.println("Udta hi firu in hawao mai kahi");
	} 
	
	
	
	
}

class Demo{
	public static void main(String args[]){
		AbstractClassExample obj = new Implementation();
		obj.get();
		obj.set();
		obj.fly();
	}
}
