public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcd";
		String str2 = "abcd";
		String str3 = "ab" + "cd";
		String str4 = "ab";
		str4 += "cd";
		String str5=new String("abcd");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println(str1 == str5);
		System.out.println(str5 == str4);
	}
}
