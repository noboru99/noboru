/*
課題名JKad12A1
作成日:2022/05/19
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad12A1{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.print("ひとつめの整数を入力してください＞");
			int a = in.nextInt();
			
			System.out.print("ふたつめの整数を入力してください＞");
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
			
			System.out.println("最大公約数は"+a+"です！");
			
		}
	}
	
	
	/*
	change = a:
	b = change:
	a = b 
	
	*/