package loopKadai;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoopKadai3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//乱数を設定
		Random rnd = new Random();
		int randomValue = rnd.nextInt(11) + 2;

		//出力
		System.out.println("randomValue = " + randomValue);

		//リストの作成
		List<Integer> randomList = new ArrayList<Integer>();

		//リストに値を入れる
		for(int a = 1; a <= randomValue; a++) {
			randomList.add(a);
		}

		//リストの要素を出力
		for(int b : randomList) {
			System.out.println(b + "個");
		}

	}

}
