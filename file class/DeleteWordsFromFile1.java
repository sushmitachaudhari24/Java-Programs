import java.util.Scanner;
import java.io.*;

class DeleteWordsFromFile1{
	public static void main(String[] args) throws IOException{
		File f = new File("C:\\Test\\JavaDemo\\abc.txt");

		BufferedReader br = new BufferedReader(new FileReader(f));

		File temp = new File("C:\\Test\\JavaDemo\\temp.txt");

		PrintWriter out = new PrintWriter(new FileWriter(temp));

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the word you want to remove/delete : ");
		String word = in.nextLine();

		String s = br.readLine();
		while(s!=null){
			String modString = s.replaceAll("\\b"+ word +"\\b","");
			out.println(modString);
			s = br.readLine();
		}

		out.flush();
		out.close();

		if(f.delete()){
			temp.renameTo(f);
		}
	}
}