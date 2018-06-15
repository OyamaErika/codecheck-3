package codecheck;

public class App {
	public static void main(String[] args) {
		String comand = args[0];
		String str = args[1];
		StringBuffer sb = new StringBuffer();
		int a = (int)'A';

		if ("encode".equals(comand)) {
			str = Integer.toString(Integer.parseInt(str),9);
			String[] splitStr = str.split("");

			for (int i = 0, l = splitStr.length; i < l; i++) {
				int num = Integer.parseInt(splitStr[i]);
				String s =String.valueOf((char)(a + num));
				sb.append(s);
			}
			System.out.println(sb);

		} else if ("decode".equals(comand)) {
			String[] splitStr = str.split("");

			for (int i = 0, l = splitStr.length; i < l; i++) {
				String s = splitStr[i];
				char ch = s.toCharArray()[0];
				int num = (int)ch - a;
				sb.append(num);
			}

			int ans = Integer.parseInt(sb.toString(), 9);
			System.out.println(ans);


		} else if ("align".equals(comand)) {
			String[] splitStr = str.split("");

			for (int i = 0, l = splitStr.length; i < l; i++) {
				String s = splitStr[i];
				char ch = s.toCharArray()[0];
				int num = (int)ch - a;
				sb.append(num);
			}
			int sbLen = Integer.parseInt(sb.substring(0, 1));
			StringBuffer ans = new StringBuffer();
			int len = sb.length();
			if (8 ==sbLen) {
				len = len++;
			}

			for (int i = 0; i < len; i++) {
				ans.append(7);
			}
			String aa = sb.toString();
			int ia = Integer.parseInt(aa, 9);
			String b = ans.toString();

			int ib = Integer.parseInt(b,9);

			int intAns = ib - ia;
			String aAns = Integer.toString(intAns,9);

			String[] splitTr = aAns.split("");
			StringBuffer buffer = new StringBuffer();

			for (int i = 0, l = splitTr.length; i < l; i++) {
				int num = Integer.parseInt(splitTr[i]);
				String s =String.valueOf((char)(a + num));
				buffer.append(s);
			}
			StringBuffer sysAns = new StringBuffer();
			for (int i = 0; i < len; i++) {
				sysAns.append("H");
			}
			String sysC = sysAns.toString();
			String sys = buffer.toString();
			System.out.println(str + " + " + sys + " = " +  sysC);
		}
	}

}
