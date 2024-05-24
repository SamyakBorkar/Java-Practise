class AnonomousOBJ{
	AnonomousOBJ(){
		System.out.println("Object Created");
	}
	
	public void show(){
		System.out.println("Show Method");
	}
	
	public static void main(String args[]){
		new AnonomousOBJ().show();
	}
}
