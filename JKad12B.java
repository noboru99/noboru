/*
�ۑ薼JKad12B
�쐬��:2022/05/23
�쐬�ҁF�ӂ����̂ڂ�
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
				System.out.print((i+1)+"�l�ڂ̓_������͂��Ă���������");
				s = in.nextInt();
				i++;
				sum=s+sum;
			}
			System.out.println((i-1)+"�l�̍��v��"+(sum-s));
			 
			
			//sum--;
			//i--;
			double average;
			average=((sum-1)/(i-1));
			System.out.println((i-1)+"�l�̕��ς�"+average);
		}
	}