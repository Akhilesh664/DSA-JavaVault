
public class GenerateAllSubstring 
{
	
	
	public static void main(String[] args) 
	{
		int arr[] = {10, 20, 30, 40, 50, 60}; 
		int n = 6;
		System.out.println("substring of Array {10, 20, 30, 40, 50, 60} are : ");
		
		findAllSubstring( arr, n );
	}

	public static void findAllSubstring(int arr[], int n) 
	{
		for(int i=0; i<=n-2; i++) 
		{
			for(int j=i; j<=n-1; j++) 
			{
				for(int k=i; k<=j; k++) 
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
		
	}

}
