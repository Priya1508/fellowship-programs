package basics;

public class BubblesortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"E","D","C","B","A"};
		int i,j;
		String temp;
		
		for(i=0;i<str.length;i++) {
			for(j=0;j<str.length;j++) {
				if(str[i].compareTo(str[j])<0) {
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		for(i=0;i<str.length;i++) {
		System.out.print(str[i]+" ");
	}

	}

}
