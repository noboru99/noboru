/*
課題名JKad03B
作成日:2022/04/13
作成者：藤田　昇
*/
public class JKad03B{
	public static void main(String[] args){
		final int COFFEE = 290;	//コーヒーの値段
		final int DONUT =250;	//ドーナツの値段
		final int SALAD = 380;	//サラダの値段
		final int CAKE =420;	//ケーキの値段
		int i=0;
		
		System.out.println("ようこそ！ECCコーヒーへ");
		System.out.println("こちらでお召し上がりですね。");
		System.out.println("-----------");
		
		System.out.println("コーヒー\t"+(COFFEE)+"円\t小計:"+(i+=COFFEE)+"円");
		System.out.println("さくらドーナツ\t"+(DONUT)+"円\t小計:"+(i+=DONUT)+"円");
		System.out.println("チキンサラダ\t"+(SALAD)+"円\t小計:"+(i+=SALAD)+"円");
		System.out.println("チーズケーキ"+(CAKE)+"円\t"+"小計:"+(i+=CAKE)+"円");
		System.out.println("-----------");
		int x;
		x=i*1/10;

		System.out.println("消費税が"+(x)+"円で支払金額は"+(i+x)+"円になります！");
		System.out.println("ありがとうございました！");
		
	}
}
		