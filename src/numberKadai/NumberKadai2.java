package numberKadai;

public class NumberKadai2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		double numberA = 10.4;
		double numberB = 19.6;
		double numberC = -15.2;
		double numberD = -26.7;

		System.out.println("1.変数の値");
		System.out.println("numberA = " + numberA);
		System.out.println("numberB = " + numberB);
		System.out.println("numberC = " + numberC);
		System.out.println("numberD = " + numberD + "\n");

		System.out.println("2.切り捨て");
		System.out.println("numberAの切り捨て = " + Math.floor(numberA));
		System.out.println("numberBの切り捨て = " + Math.floor(numberB));
		System.out.println("numberCの切り捨て = " + Math.floor(numberC));
		System.out.println("numberDの切り捨て = " + Math.floor(numberD) + "\n");

		System.out.println("3.切り上げ");
		System.out.println("numberAの切り上げ = " + Math.ceil(numberA));
		System.out.println("numberBの切り上げ = " + Math.ceil(numberB));
		System.out.println("numberCの切り上げ = " + Math.ceil(numberC));
		System.out.println("numberDの切り上げ = " + Math.ceil(numberD) + "\n");

		System.out.println("4.四捨五入");
		System.out.println("numberAの四捨五入 = " + Math.round(numberA));
		System.out.println("numberBの四捨五入 = " + Math.round(numberB));
		System.out.println("numberCの四捨五入 = " + Math.round(numberC));
		System.out.println("numberDの四捨五入 = " + Math.round(numberD));


	}

}
