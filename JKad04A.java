/*
課題名JKad04A
作成日:2022/04/21
作成者：ふじたのぼる
*/
import java.util.Scanner;
public class JKad04A{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("教室番号を入力してください");
		int s = in.nextInt();
		
		System.out.print("一の位");	System.out.println(s%10-s%1);
		System.out.print("十の位");	System.out.println((s%100-s%10)/10);
		System.out.print("百の位");	System.out.println((s%1000-s%100)/100);
		System.out.print("千の位");	System.out.println((s%10000-s%1000)/1000);
						
	}
}
