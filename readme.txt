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
��ӡ���Ϊ��
true
true
false
false
false

������
    ����str1="abcd";�Ա�����ֵ��ʱ��str1ָ��"abcd"�˴����ڴ�ռ䣬��str2Ҳ��ֵ"abcd"��ʱ��str1��str2ָ����ͬ���ڴ�����"abcd",��"abcd"��str1��str2�ǹ���ġ�����str3���ڸ�ֵ��ʱ��ͨ���ַ������ӷ���Ӱ�����յĽ�������Ƕ���str4,�൱��str4��ָ��"ab"�ڴ�����֮��ͨ�����¸�ֵ��Ϊ�����·����ڴ�ռ䣬����str4��str1��str2ָ��Ĳ���ͬһ���ڴ����򡣶���str5ͨ��String("abcd")���и�ֵ��ʵ����������ʵ����һ�����󣬿�����һ���µ��ڴ��������ڴ��"abcd"��