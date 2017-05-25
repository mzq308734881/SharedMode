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
打印结果为：
true
true
false
false
false

分析：
    对于str1="abcd";对变量赋值的时候str1指向"abcd"此处的内存空间，当str2也赋值"abcd"的时候，str1和str2指向相同的内存区域"abcd",即"abcd"对str1和str2是共享的。至于str3，在赋值的时候通过字符串连接符不影响最终的结果，但是对于str4,相当于str4先指向"ab"内存区域，之后通过重新赋值，为其重新分配内存空间，所以str4与str1和str2指向的不是同一个内存区域。对于str5通过String("abcd")进行赋值，实际上是重新实例化一个对象，开辟了一个新的内存区域用于存放"abcd"。