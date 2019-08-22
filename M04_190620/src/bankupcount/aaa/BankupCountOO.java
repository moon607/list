package bankupcount.aaa;

import java.util.Scanner;

public class BankupCountOO
{
	public static void main(String[] args) 
	{
		
		String source = "1 3 5";
		Scanner sc = new Scanner(source);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		
		Scanner Systemfn = new Scanner(System.in);
		int num11 = Systemfn.nextInt();
		int num12 = Systemfn.nextInt();
		int num13 = Systemfn.nextInt();
		Systemfn.close();
		System.out.println(num11);
		System.out.println(num12);
		System.out.println(num13);
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		
		
	}
}
