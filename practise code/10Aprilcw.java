abstract class CW{
	void play(){}
	abstract void bat();
}

class instance extends CW{
	void bat(){
		System.out.println("This is abstract class extending ");
	}	
}

class Demo23{
public static void main(String args[]){
		CW obj = new instance();
		obj.bat();
	}
}
