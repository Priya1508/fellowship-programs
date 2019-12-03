package basics;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,4,1};
		int i,j,temp;
		
		for(i=1;i<arr.length;i++) {
			temp=arr[i];
			j=i-1;
			while(j>=0) {
				if(temp>arr[j]) {
					break;
				}
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
