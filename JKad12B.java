/*
課題名JKad12B
作成日:2022/05/23
作成者：ふじたのぼる
*/
import java.util.Scanner;
	public class JKad12B{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			int s=0;
			int i=0;
			int sum=0;
			//double average;
			while (s>=0){
				System.out.print((i+1)+"人目の点数を入力してください＞");
				s = in.nextInt();
				i++;
				sum=s+sum;
			}
			System.out.println((i-1)+"人の合計は"+(sum-s));
			 
			
			//sum--;
			//i--;
			double average;
			average=((sum-1)/(i-1));
			System.out.println((i-1)+"人の平均は"+average);
		}
	}