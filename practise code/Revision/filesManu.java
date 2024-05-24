import java.io.*;

class filesmanu{
	public static void main(String args[])throws IOException{
		String filename="Example.txt";
		File file = new File(filename);
		if(!file.exists()){
			file.createNewFile();
			System.out.println("File :"+ file.getName()+ "Created");
		}
		else{
			System.out.println("There is Already a File named "+ file.getName());
		}
		
		FileWriter fw = new FileWriter(filename);
		FileReader fr = new FileReader(filename);
		
		BufferedWriter bw =new BufferedWriter(fw);
		bw.write("Hey I am Samyak , Writing to the file");
		bw.close();
		
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		System.out.println(file.getAbsolutePath());
		
		
	}
}
