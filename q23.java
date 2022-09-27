package hackathonexam;

import java.util.Scanner;

public class q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE STRING :");
		String s = sc.next();
		System.out.println("THE REVERSED STRING :");
		for(int i=s.length();i>0;i--)
			System.out.print(s.charAt(i-1));

	}

}
