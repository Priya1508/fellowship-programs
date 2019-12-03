package basics;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			int no=i;
			for(int j=1;j<=i;j++) {
				System.out.print(no+" ");
				no=no+5-j;
			}
			System.out.println();
		}

	}

}
