/*
課題名JKad06S1
作成日:2022/04/13
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad06S1{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("ひとつめの整数を入力してください＞");
		int n1 = in.nextInt();
		System.out.print("ふたつめの整数を入力してください＞");
		int n2 = in.nextInt();
		System.out.println("のび太が計算します！");
		System.out.println(n1+"÷"+n2+"は"+n1/n2+"です！");
		System.out.println("出木杉くんが計算します！");
		
		System.out.println(n1+"÷"+n2+"は"+(double)n1/(double)n2+"です！");
		in.close();
	}
}