package stringKadai;

public class StringKadai2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String s1 = "東京都杉並区";
		String s2 = "東京都練馬区";
		String s3 = "東京都杉並区";

		System.out.println("s1 =" + s1);
		System.out.println("s2 =" + s2);
		System.out.println("s3 =" + s3);

		System.out.println("s1とs2の比較結果 = "+ s1.equals(s2));
		System.out.println("s1とs3の比較結果 = "+ s1.equals(s3));

		System.out.println("2文字目は" + s1.charAt(1) + "です");

		System.out.println("3文字目から5文字目は" + s1.substring(2,5) + "です");



	}

}
