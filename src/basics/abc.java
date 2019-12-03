package basics;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,0,1,0,0,1,1,1,0,1};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");

	}
	}
}
