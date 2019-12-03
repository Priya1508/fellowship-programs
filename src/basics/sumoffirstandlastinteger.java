package basics;

public class sumoffirstandlastinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15635;
		int sum=0;
		
		int r=n%10;
		while(n>0) {
			sum=n;
			n=n/10;
		}
		System.out.println(r);
		System.out.println(sum);
		System.out.println(r+sum);

	}

}
