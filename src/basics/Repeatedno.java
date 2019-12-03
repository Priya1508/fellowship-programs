package basics;

public class Repeatedno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,2,3,4,5,5};
		int len=a.length;
		for(int i=0;i<len;i++) 
		{
			for(int j=0;j<len;j++)
			{
				if(i!=j && a[i]==a[j])
				{
					while(j<len)
					{
						a[i]=a[j];
						i++;
						j++;
					}
				}
			}
			len--;
		}
		for(int i=0;i<len;i++)
			System.out.print(a[i]+" ");

	}

}
