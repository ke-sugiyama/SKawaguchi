package listKadai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListKadai2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// Listの宣言と初期化
		List<Integer> numberList = new ArrayList<Integer>();

		// リストに値を追加
		numberList.add(6);
		numberList.add(10);
		numberList.add(2);
		numberList.add(4);
		numberList.add(8);
		numberList.add(4);

		// リストから値を取り出し出力
		System.out.println("1個目：" + numberList.get(0));
		System.out.println("2個目：" + numberList.get(1));
		System.out.println("3個目：" + numberList.get(2));
		System.out.println("4個目：" + numberList.get(3));
		System.out.println("5個目：" + numberList.get(4));
		System.out.println("6個目：" + numberList.get(5) + "\n");

		// リストの値を昇順に並べ替えて出力
		Collections.sort(numberList);

		System.out.println("ソート後");
		System.out.println("1個目：" + numberList.get(0));
		System.out.println("2個目：" + numberList.get(1));
		System.out.println("3個目：" + numberList.get(2));
		System.out.println("4個目：" + numberList.get(3));
		System.out.println("5個目：" + numberList.get(4));
		System.out.println("6個目：" + numberList.get(5) + "\n");

		// リストの要素数を出力
		System.out.println("リストの要素数 = " + numberList.size() + "\n");

		// リストにある値をすべて削除
		numberList.clear();

		// 削除後のリストの要素数を出力
		System.out.println("消した後のリストの要素数 = " + numberList.size());


	}

}
