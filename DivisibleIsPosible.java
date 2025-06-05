package Practice;

public class DivisibleIsPosible {
	
	public static int isPosible(int[] arr,int n)
	{
		int ans=0,rem=0;
		for(int i=0;i<n;i++)
		{
			rem+=arr[i]%n;
		}
		if(rem%n==0)
			return 1;
		return 0;
		
	}
	
	public static void main(String[] args)
	{
		int[] arr= {30,60,90};
		int n=arr.length;
		System.out.println(isPosible(arr,n));
	}

}
