/*
‰Û‘è–¼JKad06S2
ì¬“ú:2022/04/21
ì¬ÒF‚Ó‚¶‚½‚Ì‚Ú‚é
*/
import java.util.Scanner;
public class JKad06S2{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.print("”¼Œa‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„:");
		double r =in.nextDouble();
		final double PI = 3.14159265;
		double a=4*PI*r*r;
		double b=(double)4/3*PI*r*r*r;
		System.out.print("”¼Œa‚Ì"+r+"‹…‚Ì•\–ÊÏ‚Í"+a+"‘ÌÏ‚Í"+(((int)((b+0.00005)*10000))/(double)10000)+"‚Å‚·I");
	}
}