package ifKadai;

import java.util.ArrayList;
import java.util.List;

public class IfKadai1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//リストの作成
		List<Integer> scoroList = new ArrayList<Integer>();

		//リストに値を追加
		scoroList.add(80);
		scoroList.add(75);
		scoroList.add(60);

		//リストの要素数分繰り返し処理を行い出力
		for(int i = 0; i < scoroList.size(); i++) {
			if(scoroList.get(i) >= 80)
				System.out.println(i+1 + "個目：合格");
			else
				System.out.println(i+1 + "個目：不合格");
		}

		System.out.println();

		//条件分岐を増やして結果を出力
		for(int j = 0; j < scoroList.size(); j++) {
			if(scoroList.get(j) >= 80) {
				System.out.println(j+1 + "個目：秀");
			}else if(scoroList.get(j) >= 61 && scoroList.get(j) <= 79) {
				System.out.println(j+1 + "個目：優");
			}else {
				System.out.println(j+1 + "個目：良");
			}
		}

	}

}
