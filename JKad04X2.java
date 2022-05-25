/*
‰Û‘è–¼JKad04X2
ì¬“ú:2022/04/21
ì¬ÒF‚Ó‚¶‚½‚Ì‚Ú‚é
*/
import java.util.Scanner;
public class JKad04X2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("0‚©‚ç‚U‚T‚T‚R‚T‚Ü‚Å‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
			int s = in.nextInt();
			
			
			System.out.println("ÅãˆÊƒrƒbƒg‚©‚ç‡‚É•\¦‚µ‚Ü‚·I");
			String i="";
		
			while(s!=0){
					
					i = (s%2) + i;
					s/=2;
					
					}
			
			System.out.print(i);
			in.close();
	}
}