/*
‰Û‘è–¼JKad12A1
ì¬“ú:2022/05/19
ì¬ÒF‚Ó‚¶‚½‚Ì‚Ú‚é
*/
import java.util.Scanner;
	public class JKad12A1{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.print("‚Ğ‚Æ‚Â‚ß‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
			int a = in.nextInt();
			
			System.out.print("‚Ó‚½‚Â‚ß‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
			int b = in.nextInt();
						
			int change ;
			
			while (true){	
			 if(a>b){
			   	a=a-b;
			 } else {
			 	if (b>a){
					change = a;
					a=b;
					b=change;
					
					a=a-b;
				} if (a==b)break;
			 }
		}
			
			System.out.println("Å‘åŒö–ñ”‚Í"+a+"‚Å‚·I");
			
		}
	}
	
	
	/*
	change = a:
	b = change:
	a = b 
	
	*/