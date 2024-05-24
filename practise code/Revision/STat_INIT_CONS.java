class EXAM{
	static {
		System.out.println("Inside Exam 1 st static block ");
		
	}
	static {
		System.out.println("Inside Exam 2 st static block ");	
	}
	
	EXAM(){
		System.out.println("Exam Class Constructor");		
	}
	
	{
		System.out.println("Inside exam INIT block");	
	}
} 

class MidTerm extends EXAM {
	static {
		System.out.println("Inside MIDTerm 1 st static block ");	
	}
	MidTerm(){
		System.out.println("Mid Term Constructor");
	}
	
	{
		System.out.println("Inside MidTerm INIt block ");
	}
	
	public static void main(String args[]){
	//	Class.forName("MidTerm");
		EXAM ex = new EXAM();
		System.out.println("Inside Main");
		MidTerm mt = new MidTerm();
	}
}
