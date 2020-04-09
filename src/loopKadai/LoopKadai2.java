package loopKadai;

public class LoopKadai2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//1から100までの数値を足す
		int i = 0;
		int sum = 0;
		while (i < 100) {
			i++ ;
			sum = sum + i;
		}

		//結果を出力
		System.out.println("合計：" + sum);

	}

}
