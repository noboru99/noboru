/*
�ۑ薼JKad11B
�쐬��:2022/05/19
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad11A{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			System.out.println("�������I�������֍s�����I");
			System.out.print("���l�ōs���܂����H��");
			int n = in.nextInt();
			System.out.print("���Ȃ��̔N�����͂��Ă���������");
			int a= in.nextInt();
			
			if (a>=15){
				if (n>=50){
						System.out.print("��l�����F400�~�ɂȂ�܂��I");
				}else if (n>=30){
					System.out.print("��l�����F450�~�ɂȂ�܂��I");
				}else {
					System.out.print("��l�����F500�~�ɂȂ�܂��I");
				}
			}
			else if (a>=6){
					if (n>=50){
							System.out.print("�q�������F160�~�ɂȂ�܂��I");
					}else if (n>=30){
						System.out.print("�q�������F180�~�ɂȂ�܂��I");
					}else if (n<30){
						System.out.print("�q�������F200�~�ɂȂ�܂��I");
					}
				}else{
					System.out.print("���A�w���F�����ł��I");
				}
		
		}
	}