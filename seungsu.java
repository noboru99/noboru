/*
課題名JKad12A2
作成日:2022/05/19
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class seungsu{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			int s;
			int i;
			i=0;
			while (true){
			
				s = in.nextInt();
			
			
				if (s%3==0||s%5==0){
				
				}else{
					i++;
				}
				if (s==0){
					break;
				
				}
			}
			System.out.println(i);
		}
	}