/*
課題名JKad05A
作成日:2022/04/25
作成者：ふじたのぼる
*/
import java.util.Scanner;
public class JKad05A{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
		System.out.print("半径を入力してください＞:");
		
		
		double r =in.nextDouble();
		double PI=3.14;
		double a=4*PI*r*r;
		double b=(double)4/3*PI*r*r*r;
		
		
		System.out.println("半径"+r+"の球の表面積は"+a+"体積は"+b+"です");
	}
}
		