public class LRN1_Makhmutov {
	public static int symbolCount(String msg, char symbol) {
		int count = 0;
		for (char c : msg.toCharArray()) {
			if (c == symbol) count++;
		}
		return count;
	}
	public static void main(String[] args) {
		String msg = "Hello World!";
		System.out.println(msg);
		System.out.println(symbolCount(msg, 'l'));
	}
}