/*
�ۑ薼JKad10C2
�쐬��:2022/05/16
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad10C2{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			final int IE=1;
			final int SK=2;
			final int SE=3;
			System.out.println("����ɂ��́I");
			System.out.println("���̓X�[�p�[�e�B�[�`���[�AECC�G�N�Z���g��I");
			System.out.print("���Ȃ��̃R�[�X�������ĂˁI(1:IE, 2:SK, 3:SE)>");
			int a = in.nextInt();
			
			if ((a!=IE)&&(a!=SK)&&(a!=SE)){
				System.out.print("�����Ɠ����Ă�");
			}else{
				
				System.out.print("IT�̃J���b�W�̊w���ˁI");
			}
		}
	}