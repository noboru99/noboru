/*
課題名JKad06S2
作成日:2022/04/21
作成者：ふじたのぼる
*/
import java.util.Scanner;
public class JKad06S2{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.print("半径を入力してください＞:");
		double r =in.nextDouble();
		final double PI = 3.14159265;
		double a=4*PI*r*r;
		double b=(double)4/3*PI*r*r*r;
		System.out.print("半径の"+r+"球の表面積は"+a+"体積は"+(((int)((b+0.00005)*10000))/(double)10000)+"です！");
	}
}