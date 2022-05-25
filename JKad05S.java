/*
課題名JKad05X
作成日:2022/04/25
作成者：ふじたのぼる
*/
import java.util.Scanner;
public class JKad05S{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			
			double d=Math.random();
					
			
			System.out.println("取得した乱数"+d);	
			
		
			
			System.out.println("１位で四捨五入"+(int)(d+0.5));
			System.out.println("２位で四捨五入"+((int)((d+0.05)*10))/(double)10);
			System.out.println(" 3位で四捨五入"+((int)((d+0.005)*100))/(double)100);
			
		}
}
			
			
			
					