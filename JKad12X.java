/*
課題名JKad12X
作成日:2022/05/19
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad12X {
		public static int calcGCD(int n1, int n2){
						
			int change ;
			
			while (true){	
			 if(n1>n2){
			   	n1=n2-n2;
			 } else {
			 	if (n2>n1){
					change = n1;
					n1=n2;
					n2=change;
					
					n1=n1-n2;
				} if (n1==n2)break;
			 }
		}return n1;		
		}
		
		
		
		public static int calcLCM(int n1, int n2){
			
		
			int num1;
			num1=n1;
			int num2;
			num2=n2;
			
			while (true){
				if(n2>n1){
				 	
				   	n1=n1+num1;
					
				 } else {
						
						n2=num2+n2;
					
				 }if (n2==n1)break;
			}
			return n2;
		}
		
		
		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			System.out.print("ひとつめの整数を入力してください＞");
			int n1 = in.nextInt();
			System.out.print("ふたつめの整数を入力してください＞");
			int n2 = in.nextInt();
			
			System.out.println("最大公約数は" + calcGCD(n1, n2) + "です！");
			System.out.println("最小公倍数数は" + calcLCM(n1, n2) + "です！");
			in.close();
		}
	}