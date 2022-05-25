/*
‰Û‘è–¼JKad04A
ì¬“ú:2022/04/21
ì¬ÒF‚Ó‚¶‚½‚Ì‚Ú‚é
*/
import java.util.Scanner;
public class JKad04A{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("‹³º”Ô†‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		int s = in.nextInt();
		
		System.out.print("ˆê‚ÌˆÊ");	System.out.println(s%10-s%1);
		System.out.print("\‚ÌˆÊ");	System.out.println((s%100-s%10)/10);
		System.out.print("•S‚ÌˆÊ");	System.out.println((s%1000-s%100)/100);
		System.out.print("ç‚ÌˆÊ");	System.out.println((s%10000-s%1000)/1000);
						
	}
}
