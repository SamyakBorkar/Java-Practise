class StudentClass{
  	public int roll_no ;
  	public int  marks ;
  	public String name ;
}
class TestArray{
	public static void main(String args[]){
			StudentClass s1 =new StudentClass();
			s1.roll_no =1;
			s1.name = "Samyak";
			s1.marks= 99;
			
			StudentClass s2 = new StudentClass();
			s2.roll_no = 2;
			s2.name = "Prathamesh";
			s2.marks = 98;
			
			StudentClass s3 = new StudentClass();
			s3.roll_no = 3;
			s3.name = "Kunal";
			s3.marks = 93;
			
			StudentClass student[] = new StudentClass[3];
			student[0]= s1;
			student[1]=s2;
			student[2]=s3;
			System.out.println("The Student Infornmation is :\n");
			for(int i=0 ; i< student.length; i++){
				System.out.println(student[i].name + student[i].marks + student[i].roll_no);
			}
		}
	}
	

