interface Company{
	void laptop();
	void Desktop();
	
}

class Laptop implements Company{
	public void laptop(){
		System.out.println("Coding in Laptop.....");
	}
	
	public void Desktop(){
		System.out.println("In Laptop Class.....");
			}
	
}

class Desktop implements Company{
	public void Desktop(){
		System.out.println("Coding in Desktop.....");
	}
	public void laptop(){
	
	      System.out.println("In Desktop Class.....");
	}
}

class DevS{
	public static void main(String args[]){
		Company lapy = new Laptop();
		Company Desk = new Desktop();
		lapy.laptop();
		lapy.Desktop();
		Desk.Desktop();
		Desk.laptop();
		
		
		
	}
}
