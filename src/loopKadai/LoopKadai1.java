package loopKadai;

import java.util.Arrays;
import java.util.List;

public class LoopKadai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//同じ文字列を5回出力
		for(int i = 0; i < 5; i++) {
			System.out.println("SIシステム株式会社");
		}

		System.out.println();

		//リストの作成
		List<String> list = Arrays.asList("春","夏","秋","冬");

		//リストから値を取りだし出力

		for(int i = 0; i < list.size(); ++i) {
			String s = list.get(i);
			System.out.println(i+1 + "個目 " + s);
		}

		System.out.println();

		//九九の表を作成

		for(int i = 1; i <= 9; i++) {
			System.out.print(i + "の段：");
			for(int j = 1; j<=9; j++) {

				System.out.print(i * j + " " );
			}
			System.out.println();
		}

	}

}
