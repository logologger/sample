import java.io.*;
class other_file{
	public static void main(String args[]){


		//Sample code goes here
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(reader);
		int n=Integer.parseInt(in.readLine());
		System.out.println(n);


		System.out.println("Other file");
	}
}