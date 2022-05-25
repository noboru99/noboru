/*
‰Û‘è–¼JKad12C
ì¬“ú:2022/05/23
ì¬ÒF‚Ó‚¶‚½‚Ì‚Ú‚é
*/
import java.util.Scanner;
	public class JKad12C{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			System.out.print("1‚æ‚è‘å‚«‚¢®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
			int s = in.nextInt();
			int i=0;
			while (s>0){
			 i=s+i;
			 s--;
			}
			System.out.print("‡Œv‚Í"+i+"‚Å‚·I");
		}
	}
