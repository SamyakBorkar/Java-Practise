class AB{
	int a ;
	public void hey(){
		System.out.println("Inside the Main Class");
		}
		
	class BA{
	int b;
	public void hello(String x){
		System.out.println("Inside the inner class");
		
		}
	}
}

class ForMain{
	public static void main(String args[]){
		AB obj1 = new AB();
		obj1.hey();
		
		AB.BA obj2 = obj1.new BA();
		obj2.hello();
	}
}
