class Examplee{
	public static void main(String ...args){
		try{
			System.out.println(args[0]);
		}
		catch(Exception e){
			System.out.println("We are indexing the 0 array");
			System.out.println("The Exception is  Due to:"+e);
			
			}
	}
}
