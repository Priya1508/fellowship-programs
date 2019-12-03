package basics;

public class primepascal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		boolean flag;
		
		for(int i=0;i<5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			int count=0;
			while(count<=i) {
			flag=true;
			for(int k=2;k<=n/2;k++) {
				if(n%k==0) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.print(n+" ");
				count++;
			}
			n++;
		}
		System.out.println();

	}

}
}
