import java.util.Scanner;

public class AddTwoMatrix_32 {


	
	public static void main(String[] args) 
	{
		
		int m, n, i, j;
		
		System.out.println("Enter value of m, n");
		Scanner s = new Scanner(System.in);
		
		m = s.nextInt();
		n = s.nextInt();
		
		int[][] first = new int[m][n];
		int[][] second = new int[m][n];
		int[][] sum = new int[m][n];
		
		System.out.println("Enter Element in First matrix : ");
		
		for(i = 0; i<m; i++) {
			for(j=0; j<n; j++) {
				first[i][j] = s.nextInt();
			}
		}
		
		System.out.println("Enter Element in Second matrix : ");
		
		for(i = 0; i<m; i++) {
			for(j=0; j<n; j++) {
				second[i][j] = s.nextInt();
			}
		}
		
		// addition logics
		for(i = 0; i<m; i++) {
			for(j=0; j<n; j++) {
				sum[i][j] = first[i][j] + second[i][j];
			}
		}
		
		System.out.println("Sum of entered matrix : ");
		for ( i = 0 ; i < m ; i++ ){
			for ( j = 0 ; j < n ; j++ ){
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}	
	
	}

}
