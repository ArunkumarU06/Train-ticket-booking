package SampleApplication;

public class sampleprg
{
	public static void main(String[] args) 
	{
		int n = 5 , row = 0, col = 0 , boundary = n-1, nextBoundary = n-1 ;
		char direction = 'D';
		int[][] matrix = new int[n][n];
		for (int i = 1; i < (n*(n+1))/2 ; i++) 
		{
//			1)Assigning the value to matrix
				matrix[row][col] = i ;
//			2)Update row and column
				switch( direction )
				{
					case 'D' : col++; row++ ; break ;
					case 'U' : row-- ; break ;
					case 'L' : col-- ; break ;
				}
//			3)Check for Boundary. if reached
				if( i == boundary )
				{
//					a)change direction
						switch( direction )
						{
							case 'D' : direction = 'U' ; break;
							case 'U' : direction = 'L' ; break;
							case 'L' : direction = 'D' ; break;
						}
//					b)update boundary
						boundary += nextBoundary ;
//					c)update next Boundary
						nextBoundary-- ;
				}
		}
		printTriangleMatrix(matrix);
	}
	public static void printTriangleMatrix(int[][] matrix) 
	{
		for (int i = 0; i < matrix.length; i++) 
		{
			for (int j = 0; j < matrix[i].length; j++) 
			{
				int num = matrix[i][j] ;
				if( i <= j )
				{
					System.out.print( num < 10 ? " "+ num + " " : num + " ");
				}
				else 
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}
