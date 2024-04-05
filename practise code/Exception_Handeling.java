class ExceptionHandeling{
	public static void main(String ...args){
		try{
			Thread.sleep(1000);
			System.out.println("Inside Try 1");
			Thread.sleep(3000);
			System.out.println("Inside Try 2");
			System.out.println(args[0]);
			Thread.sleep(2000);
			System.out.println("Inside Try 3");
		}
		
		catch(InterruptedException e){
			System.out.println("InterruptedException");
		}
		 
		catch(ArrayIndexOutOfBoundsException  e){
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		 finally{
			System.out.println("Inside Finally");
		}
		
		
	}
}
