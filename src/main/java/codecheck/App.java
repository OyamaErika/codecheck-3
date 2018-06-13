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


		}
	}
}
