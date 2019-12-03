package basics;

public class Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,1,3,4,7};
		int sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;j<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]<12) {
						count++;
					}
				}
			}
		}
		System.out.println(count);

	}

}
