/*
課題名JKad11S
作成日:2022/05/19
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad11S{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			System.out.println("三角形を作ります！");
			System.out.print("辺1の長さを入力してください＞");
			int n1 = in.nextInt();
			System.out.print("辺2の長さを入力してください＞");
			int n2 = in.nextInt();
			System.out.print("辺3の長さを入力してください＞");
			int n3 = in.nextInt();
			
			
			if (n1<n2+n3 && n2<n1+n3 && n3<n1+n2){
				if (n1==n2&&n2==n3){
					System.out.println("正三角形になります！");
				}else if (n1==n2||n1==n3||n2==n3){
					System.out.println("二等辺三角形を作ります！");
				}else {
					System.out.println("三角形になります！");
				}
			}else {
				System.out.println("三角形になりません！");
			}
			
		}
	}