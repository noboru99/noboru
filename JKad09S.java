/*
課題名JKad09S
作成日:2022/05/12
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad09S{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.print("のび太の点数を入力してください＞");
			int a = in.nextInt();
			System.out.print("しずかちゃんの点数を入力してください＞");
			int b = in.nextInt();
			System.out.print("ジャイアンの点数を入力してください＞");
			int c = in.nextInt();
			System.out.print("スネ夫の点数を入力してください＞");
			int d = in.nextInt();
			System.out.print("出木杉の点数を入力してください＞");
			int e = in.nextInt();
			int max = a;
			int max2;
				max2=b;
			
			
			if (b>max){
				max2=max;
				max=b;
					}
			if (c>max){
				max2=max;
				max=c;
					}else{
						if(c>max2){
							max2=c;
							}
					}
			
			if (d>max){
				max2=max;
				max=d;
					}else{
						if(d>max2){
							max2=d;
							}
					}
			
			if (e>max){
				max2=max;
				max=e;
				}else{
					if(e>max2){
							max2=e;
						}
				}
			System.out.print("二番高い点数は"+max2+"です");
		}
	}