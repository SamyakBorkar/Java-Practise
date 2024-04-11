interface Computer{
	void Coding();
}

class Laptop implements Computer{
	public void Coding(){
		System.out.println("Coding in Laptop");
	}
}

class Desktop implements Computer{
	public void Coding(){
		System.out.println("Coding in Desktop");
	}
}
class Dev{
	public void DevApp(Computer obj){
		obj.Coding();
	}
}
class MoreInterface{
	public static void main(String args[]){
		Computer lapyy = new Laptop();
		Computer monitor= new Desktop();
		Dev Samy = new Dev();
		Samy.DevApp(monitor);
	
		
		}
}
