package try_with_resources;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Year?");
		int year=in.nextInt();
		if(year>0) {
			if(year%100==0&&year%400==0||year%100!=0&&year%4==0) {
				System.out.println("leap year");
			} 
			else { 
				System.out.println("not a leap year");
			}
		} else {
			System.out.println("I have no idea what you've entered!!!");
		}
		
		
		
		
	}
}
