package basics;

public class MaxOccurStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		char ch,c;
		int i;
		int count = 0;
		for (i = 0; i < str.length(); i++) {
			c = str.charAt(i);
		
		for (int j = 0; j < str.length(); j++) {
			ch = str.charAt(j);
			if (i != j && c==ch) 
			{
				System.out.print(ch);
				count++;
			}
		}
		}
		System.out.println(count);
	}
	

}
