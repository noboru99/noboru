/*
�ۑ薼JKad04X
�쐬��:2022/04/21
�쐬�ҁF�ӂ����̂ڂ�
*/
		import java.util.Scanner;
public class JKad04X1{
	public static void main(String[] args){
Scanner in = new Scanner(System.in);
		System.out.print("0����Q�T�T�܂ł̐�������͂��Ă���������");
		
		int s = in.nextInt();
			System.out.println("�ŏ�ʃr�b�g���珇�ɕ\�����܂��I");
			for(int a=0; a<9; a++){
			String i= "" + (s%2);
			s/=2;
			i= (s%2)+i;
				System.out.print(i);
			in.close();
			}
			
	}
}