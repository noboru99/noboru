/*
�ۑ薼JKad05X
�쐬��:2022/04/25
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
public class JKad05S{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			
			double d=Math.random();
					
			
			System.out.println("�擾��������"+d);	
			
		
			
			System.out.println("�P�ʂŎl�̌ܓ�"+(int)(d+0.5));
			System.out.println("�Q�ʂŎl�̌ܓ�"+((int)((d+0.05)*10))/(double)10);
			System.out.println(" 3�ʂŎl�̌ܓ�"+((int)((d+0.005)*100))/(double)100);
			
		}
}
			
			
			
					