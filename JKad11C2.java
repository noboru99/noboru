/*
�ۑ薼JKad11C2
�쐬��:2022/05/19
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad11C2{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			System.out.println("�������I�������֍s�����I");
			System.out.print("���Ȃ��̔N�����͂��Ă���������");
			int a = in.nextInt();
			
			if (a<6){
				System.out.print("���A�w���F�����ł��I");
			}else if (a<15){
					System.out.print("�q�ǂ������F200�~�ɂȂ�܂��I");
				}
				else{
					System.out.print("��l�����F500�~�ɂȂ�܂��I");
				}
			
		
		}
	}