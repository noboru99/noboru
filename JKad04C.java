/*
課題名JKad04C
作成日:2022/04/21
作成者：ふじたのぼる
*/
import java.util.Scanner;
public class JKad04C{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("年齢はいくつ？＞");
		int count = in.nextInt();	
		System.out.print(count+"歳なのね！");
		
		System.out.print("あなたのお名前は＞");
		String s=in.next();
		System.out.println(s+"さんこんにちは！");
		
	//	System.out.print("年齢はいくつ？＞");
	//	int count = in.nextInt();	
	//	System.out.print(count+"歳なのね！");
		
		in.close();
	}
}
