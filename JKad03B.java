/*
�ۑ薼JKad03B
�쐬��:2022/04/13
�쐬�ҁF���c�@��
*/
public class JKad03B{
	public static void main(String[] args){
		final int COFFEE = 290;	//�R�[�q�[�̒l�i
		final int DONUT =250;	//�h�[�i�c�̒l�i
		final int SALAD = 380;	//�T���_�̒l�i
		final int CAKE =420;	//�P�[�L�̒l�i
		int i=0;
		
		System.out.println("�悤�����IECC�R�[�q�[��");
		System.out.println("������ł������オ��ł��ˁB");
		System.out.println("-----------");
		
		System.out.println("�R�[�q�[\t"+(COFFEE)+"�~\t���v:"+(i+=COFFEE)+"�~");
		System.out.println("������h�[�i�c\t"+(DONUT)+"�~\t���v:"+(i+=DONUT)+"�~");
		System.out.println("�`�L���T���_\t"+(SALAD)+"�~\t���v:"+(i+=SALAD)+"�~");
		System.out.println("�`�[�Y�P�[�L"+(CAKE)+"�~\t"+"���v:"+(i+=CAKE)+"�~");
		System.out.println("-----------");
		int x;
		x=i*1/10;

		System.out.println("����ł�"+(x)+"�~�Ŏx�����z��"+(i+x)+"�~�ɂȂ�܂��I");
		System.out.println("���肪�Ƃ��������܂����I");
		
	}
}
		