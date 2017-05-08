import java.io.*;
class newfile{
	public static void main(String args[]){


		//Sample code goes here
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(reader);
		int n=Integer.parseInt(in.readLine());
		System.out.println(n);


		System.out.println("Another Number Input will go here ..Some other Code changes");
	}
}