/*
�ۑ薼JKad12A2
�쐬��:2022/05/19
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad12A2{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			System.out.print("�ЂƂ߂̐�������͂��Ă���������");
			int a = in.nextInt();
			
			System.out.print("�ӂ��߂̐�������͂��Ă���������");
			int b = in.nextInt();
			
			int num1;
			num1=b;
			int num2;
			num2=a;
			
			while (true){
				if(a>b){
				 	
				   	b=b+num1;
					
				 } else {
						
						a=num2+a;
					
				 }if (a==b)break;
			}
			System.out.println("�ŏ����{������"+a+"�ł��I");
		}	
	}