/*
課題名JKad12A2
作成日:2022/05/19
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad12A2{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			System.out.print("ひとつめの整数を入力してください＞");
			int a = in.nextInt();
			
			System.out.print("ふたつめの整数を入力してください＞");
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
			System.out.println("最小公倍数数は"+a+"です！");
		}	
	}