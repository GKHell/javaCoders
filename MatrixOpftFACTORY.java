class Main
{
	public static void main(String[] args) {
		
			Matrix A = new Matrix(3,5);
			Matrix B = new Matrix(3,5);

			A.print();
			B.print();

			Matrix C = A.sum(B); // this ?
			C.print();
		 
	}
}
class Matrix{

	int x[][];
	int i,j;
	int row,column;

	Matrix(int row,int column)
	{
		this.row = row;
		this.column = column;

		x = new int[row][column];

		for(i=0; i< row;i++)
		{
			for(j=0;j<column;j++)
			{
					x[i][j] = i;

			}
		}
	}
	void print()
	{
		System.out.println("\n--------------------------------\n");
		for(i=0; i< row;i++)
		{
			for(j=0;j<column;j++)
			{
					System.out.print(" "+x[i][j]);
			}
			System.out.println();
		}		
	}

	Matrix sum(Matrix B)
	{
		Matrix temp = new Matrix(row,column); 

		for(i=0; i< row;i++)
		{
			for(j=0;j<column;j++)
			{
					 
					 temp.x[i][j] = this.x[i][j]+B.x[i][j];

			}
		}

		return temp;
	}

}