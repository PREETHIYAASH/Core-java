package iterativestatement;

public class CountWord {

	public static void main(String[] args) {
		String str = "ello everyone i am fine";
		str = str.trim();

		String[] words = str.split(" ");
		for(int i=0;i<words.length;i++) {
			System.out.println(i+"---"+words[i]);
		}
		int wordCount = words.length;
		System.out.println("number of words:" + wordCount);

	}

}
