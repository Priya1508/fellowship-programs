package basics;

public class fnoandsno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,50,60};
		int fno=0,sno=0;
		
		for(int num : arr) {
			if(fno<num) {
				sno=fno;
				fno=num;
			}
			else if(sno<num) {
				sno=num;
			}
		}
		//System.out.println(fno);
		System.out.println(sno);

	}

}
