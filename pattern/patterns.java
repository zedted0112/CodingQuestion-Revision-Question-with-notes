package pattern;
import java.util.Scanner;
public class patterns {

	public static void main(String[] args) {
		
//		
//Scanner s= new Scanner(System.in);
//
//int n= s.nextInt();


//patternSquare(n);
//TriangularstarPatternNumRev(n);
increasingNumPatternRev(5);
	}
	
	static void patternSquare(int n)
	{
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(n+" ");
			}
			System.out.println();
				
		}
		
		
	}
	static void TriangularstarPattern(int n)
	{
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
	static void TriangularstarPatternNum(int n)
	{
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
	static void TriangularstarPatternNumRev(int n)
	{
		
		for(int i=1; i<=n; i++)
		{
			
			for(int j=i; j>=1; j--)
			{
				
				System.out.print(j+" ");
			
			}
			System.out.println();
		}
		
	}
	static void AlpaPattern(int n)
	{
		
		
		
		
		for(int i=0; i<n; i++)
		{
			
			for(int j=0; j<=i; j++)
			{
				
	char c=(char)('A'+j); 
		System.out.print(c);
			
			}
			System.out.println();
		}
		
	}
	
	
	static void increasingNumPattern(int n)/// if we add 'A' then it will will be increasing alphabetical order
	{
		
		
		for(int i=0; i<n; i++)
		{
			
			int k=i;
			for(int j=0; j<=i; j++)
			{
				char c= (char)('A'+k);
				System.out.print(c);
				k++;
			}
			System.out.println();
		}
	}
	static void increasingNumPatternRev(int n){
		
		for(int i=n; i>0; i--)
		{
			int k=i;
			for(int j=n; j>=i; j--)
			{
				
				char c= (char)('A'+k-1);
				System.out.print(c);
				k++;
				
				
			}
			System.out.println();
		}
		
		
	}


}
