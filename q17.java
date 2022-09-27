package hackathonexam;

import java.util.Scanner;

public class q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE YEAR:");
		int n = sc.nextInt();
		if((n%4==0 && n%100!=0)|n%400==0)
			System.out.println("this is a leap year");
		else
			System.out.println("this is not a leap year");
	}

}
