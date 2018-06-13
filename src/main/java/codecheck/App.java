package codecheck;

public class App {
	public static void main(String[] args) {
		String comand = args[0];
		String str = args[1];
		StringBuffer ans = new StringBuffer();

		if ("encode".equals(comand)) {
			str = Integer.toString(Integer.parseInt(str),9);
			String[] splitStr = str.split("");

			for (int i = 0, l = splitStr.length; i < l; i++) {
				int num = Integer.parseInt(splitStr[i]);
				int a = (int)'A';
				String s =String.valueOf((char)(a + num));
				ans = ans.append(s);
			}
		}

		if ("decode".equals(comand)) {

		}
		System.out.println(ans);


	}


}
