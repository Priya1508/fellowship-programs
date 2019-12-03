package basics;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,1,2,5};
		int temp,i,j;
		
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
