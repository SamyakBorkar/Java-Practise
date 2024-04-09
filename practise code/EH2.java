class Examplee{
private int a ;
private int b ;


	public void arithmeticException(int a , int b){
		this.a=a;
		this.b=b;
		
		try{
			int  result = a/b;
		}
		catch(Exception e){
			System.out.println("Cant divide by zero");
		}
	
	}
	public static void main(String ...args){
		try{
			System.out.println(args[0]);
		}
		catch(Exception e){
		
			Examplee e1 =new Examplee();
			System.out.println("We are indexing the 0 array");
			System.out.println("The Exception is  Due to:"+e);
			e1.arithmeticException(4,0);
			
			}
	}
}
