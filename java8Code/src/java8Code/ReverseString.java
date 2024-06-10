package java8Code;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Anhishek";
		String reversedStr = reverseString(str);
		System.out.println("Reversed string: " + reversedStr);
	}

	public static String reverseString(String str) {
		// Using StringBuilder to reverse the string
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}

}
