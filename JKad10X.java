/*
�ۑ薼JKad10X
�쐬��:2022/05/16
�쐬�ҁF�ӂ����̂ڂ�
*/
import java.util.Scanner;
	public class JKad10X{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			
			int r=0;
			int s=1;
			int p=2;
			String r2 = "�O�[";
			String s2 = "�`���L";
			String p2 = "�p�[";
			System.out.println("����񂯂񂵂܂��I");
			System.out.print("���̎�������܂���(0:�O-1:�`���L2:�p-)");
			int a = in.nextInt();
			int c=(int)(Math.random()*3);
			
			if (a==r){
				System.out.println("���Ȃ���"+r2+"���o���܂����I");
			}
			if (a==s){
				System.out.println("���Ȃ���"+s2+"���o���܂����I");
			}
			if (a==p){
				System.out.println("���Ȃ���"+p2+"���o���܂����I");
			}
			
			if (c==r){
				System.out.println("�R���s���[�^�[��"+r2+"���o���܂����I");
			}
			if (c==s){
				System.out.println("�R���s���[�^�[��"+s2+"���o���܂����I");
			}
			if (c==p){
				System.out.println("�R���s���[�^�[��"+p2+"���o���܂����I");
			}
		
			
			
			
			if (a==c){
				System.out.print("��������");
				}else{
				if (a==r&&c==s){
					System.out.print("���Ȃ��̏���");
				}else{ 
					if (a==s&&c==p){
						System.out.print("���Ȃ��̏���");
					}else{
						if (a==p&&c==r){
							System.out.print("���Ȃ��̏���");
				    	}else{
							System.out.print("���Ȃ��̕���");
				    	}
					}
				}
			}
		}
	}