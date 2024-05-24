class example{
	public int add(int a , int b){
		return a+b;
	}

}

class Class_Object{
	public static void main(String args[]){
		example ex= new example();
		System.out.println(ex.add(5, 7));
	}
}
