package basics;

public class InsertionsortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"E","D","C","B","A"};
		int i,j;
		String temp;
		for(i=1;i<str.length;i++) {
		temp=str[i];
		j=i-1;
		while(j>=0) {
			if(temp.compareTo(str[j])>0) {
				break;
			}
			str[j+1]=str[j];
			j--;
		}
		str[j+1]=temp;
	
		}
		for(i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
	}
	
}
