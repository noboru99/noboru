/*
�ۑ薼JKad10S
�쐬��:2022/05/16
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad10S{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			final int IE=1;
			final int SK=2;
			final int SE=3;
			System.out.println("����ɂ��́I");
			System.out.println("���̓X�[�p�[�e�B�[�`���[�AECC�G�N�Z���g��I");
			System.out.print("���Ȃ��̃R�[�X�������ĂˁI(1:IE, 2:SK, 3:SE)>");
			int a = in.nextInt();
			
			if ((a==IE)||(a==SK)||(a==SE)){
				
				System.out.print("�����N���H");
				int s = in.nextInt();
				
				if(a==IE){
					if(4>=s&&s>=1){		
				System.out.print("IT�̃J���b�W�̊w������A��낵���ˁI");
				}else {
				System.out.print("IE��4�N�̃R�[�X��I");
				}
				}
				
				if(a==SK){
					if(3>=s&&s>=1){
					System.out.print("IT�̃J���b�W�̊w������A��낵���ˁI");
				}else{ 
					System.out.print("SK��3�N�̃R�[�X��I");
				}
				}
				if(a==SE){
					if(2>=s&&s>=1){
					System.out.print("IT�̃J���b�W�̊w������A��낵���ˁI");
				}else{ 
					System.out.print("SE��2�N�̃R�[�X��I");
				}
				}
	
				
			}else{
				System.out.print("�����Ɠ����ĂˁI");
			}	
		}
	}