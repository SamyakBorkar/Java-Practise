class InnerClassDemo {
	
public static void main(String args[]) {
String text = "Hello";
String txt = "Hello";

String sec = " ";
int length = text.length();
System.out.println("Length is :"+ text.length());
System.out.println("Length is :"+ text.charAt(0));
System.out.println("Length is :"+ text.getBytes());

System.out.println("bool :"+ text.isEmpty());
System.out.println("text :"+ sec.isEmpty());
System.out.println("equals :"+ text.equals(sec));
System.out.println("equals:"+ text.equals(txt));
System.out.println("equals:"+ sec.isBlank());


}
}
