interface A2{
	int age=19;
	void fun();
	void play();
}

class implementation implements A2{
	public void fun(){
		System.out.println("Fun Method");
	}
	
	public void play(){
		System.out.println("Play method");
	}
}

class InterfaceDemo{
	public static void main(String args[]){
		A2 obj = new implementation();
		obj.fun();
		System.out.println(obj.age);
	}
}
