class STringBuff{
	public static void main(String args[]){
		StringBuffer sb = new StringBuffer("Samyak");
		System.out.println(sb.capacity());
		
		//String str = sb ;
		String str = sb.toString() ;
		sb.append("Borkar");
		System.out.println(sb);
	}
}
