/*
‰Û‘è–¼JKad05A
ì¬“ú:2022/04/25
ì¬ÒF‚Ó‚¶‚½‚Ì‚Ú‚é
*/
import java.util.Scanner;
public class JKad05A{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
		System.out.print("”¼Œa‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„:");
		
		
		double r =in.nextDouble();
		double PI=3.14;
		double a=4*PI*r*r;
		double b=(double)4/3*PI*r*r*r;
		
		
		System.out.println("”¼Œa"+r+"‚Ì‹…‚Ì•\–ÊÏ‚Í"+a+"‘ÌÏ‚Í"+b+"‚Å‚·");
	}
}
		