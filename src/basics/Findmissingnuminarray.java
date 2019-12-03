package basics;

public class Findmissingnuminarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,5,6,8};
		int i,j=1;
		for(i=0;i<arr.length;i++) {
			if(arr[i]!=j) {
				System.out.println("Missing number is: "+j+" ");
				j++;
			}
			j++;
		}

	}

}
