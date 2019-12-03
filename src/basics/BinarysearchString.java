package basics;

public class BinarysearchString {

	public static void main(String[] args) {
		String[] str= {"A","B","C","D","E"};
		String key="C";
		int last=str.length-1;
		binarysearch(str,0,last,key);
	}

	private static void binarysearch(String[] str, int first, int last, String key) {
		// TODO Auto-generated method stub
		int mid=(first+last)/2;
		while(first<=last) {
			if(str[mid].compareTo(key)<0) {
				
				first=mid+1;
			}
			else if(str[mid].equals(key)) {
				System.out.println("Element found at index: "+mid);
				break;
			}
			else {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last) {
			System.out.println("Element not found");
		}
		
	}

}
