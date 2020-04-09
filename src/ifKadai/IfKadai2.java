package ifKadai;

import java.util.ArrayList;
import java.util.List;

public class IfKadai2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//リストの作成
		List<String> languageList = new ArrayList<String>();

		//リストに値を追加
		languageList.add("日本語");
		languageList.add("英語");
		languageList.add("フランス語");
		languageList.add("スペイン語");

		//switch文で条件ごとに結果を出力
		for(int i = 0; i < languageList.size(); i++) {
			switch (languageList.get(i)) {
			case "日本語":
				System.out.println("日本語での挨拶は「こんにちは」");
				break;
			case "英語":
				System.out.println("英語での挨拶は「Hello」");
				break;
			case "フランス語":
				System.out.println("フランス語での挨拶は「Bonjour」");
				break;
			default:
				System.out.println("スペイン語での挨拶は「Buenas tardes」");
			}
		}

	}

}
