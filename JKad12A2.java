/*
‰Û‘è–¼JKad12A2
ì¬“ú:2022/05/19
ì¬ÒF‚Ó‚¶‚½‚Ì‚Ú‚é
*/
import java.util.Scanner;
	public class JKad12A2{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			System.out.print("‚Ğ‚Æ‚Â‚ß‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
			int a = in.nextInt();
			
			System.out.print("‚Ó‚½‚Â‚ß‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
			int b = in.nextInt();
			
			int num1;
			num1=b;
			int num2;
			num2=a;
			
			while (true){
				if(a>b){
				 	
				   	b=b+num1;
					
				 } else {
						
						a=num2+a;
					
				 }if (a==b)break;
			}
			System.out.println("Å¬Œö”{””‚Í"+a+"‚Å‚·I");
		}	
	}