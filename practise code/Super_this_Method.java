class X{
	public X(){
		System.out.println("In A's Default Constructor");
	}
	
	public  X(int N){
		System.out.println("In A's Parameterized Constructor");
	}
	
}

class Y extends X{
	public Y(){
		System.out.println("In B's Default Constructor");
	}
	
	public Y(int N){
		System.out.println("In B's Parametrized Constructor");
	}
}

class Z{
	public static void main(String args[]){
		Y obj = new Y();
	}
}
