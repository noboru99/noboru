/*
課題名JKad10X
作成日:2022/05/16
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad10X{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			int r=0;
			int s=1;
			int p=2;
			String r2 = "グー";
			String s2 = "チョキ";
			String p2 = "パー";
			System.out.println("じゃんけんします！");
			System.out.print("何の手をだしますか(0:グ-1:チョキ2:パ-)");
			int a = in.nextInt();
			int c=(int)(Math.random()*3);
			
			if (a==r){
				System.out.println("あなたは"+r2+"を出しました！");
			}
			if (a==s){
				System.out.println("あなたは"+s2+"を出しました！");
			}
			if (a==p){
				System.out.println("あなたは"+p2+"を出しました！");
			}
			
			if (c==r){
				System.out.println("コンピューターは"+r2+"を出しました！");
			}
			if (c==s){
				System.out.println("コンピューターは"+s2+"を出しました！");
			}
			if (c==p){
				System.out.println("コンピューターは"+p2+"を出しました！");
			}
		
			
			
			
			if (a==c){
				System.out.print("あいこだ");
				}else{
				if (a==r&&c==s){
					System.out.print("あなたの勝ち");
				}else{ 
					if (a==s&&c==p){
						System.out.print("あなたの勝ち");
					}else{
						if (a==p&&c==r){
							System.out.print("あなたの勝ち");
				    	}else{
							System.out.print("あなたの負け");
				    	}
					}
				}
			}
		}
	}