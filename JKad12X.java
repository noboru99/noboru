/*
�ۑ薼JKad12X
�쐬��:2022/05/19
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad12X {
		public static int calcGCD(int n1, int n2){
						
			int change ;
			
			while (true){	
			 if(n1>n2){
			   	n1=n2-n2;
			 } else {
			 	if (n2>n1){
					change = n1;
					n1=n2;
					n2=change;
					
					n1=n1-n2;
				} if (n1==n2)break;
			 }
		}return n1;		
		}
		
		
		
		public static int calcLCM(int n1, int n2){
			
		
			int num1;
			num1=n1;
			int num2;
			num2=n2;
			
			while (true){
				if(n2>n1){
				 	
				   	n1=n1+num1;
					
				 } else {
						
						n2=num2+n2;
					
				 }if (n2==n1)break;
			}
			return n2;
		}
		
		
		
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			System.out.print("�ЂƂ߂̐�������͂��Ă���������");
			int n1 = in.nextInt();
			System.out.print("�ӂ��߂̐�������͂��Ă���������");
			int n2 = in.nextInt();
			
			System.out.println("�ő���񐔂�" + calcGCD(n1, n2) + "�ł��I");
			System.out.println("�ŏ����{������" + calcLCM(n1, n2) + "�ł��I");
			in.close();
		}
	}