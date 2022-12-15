import java.util.Scanner;
class Marks{
	public static void main(String... args)
	{
		Scanner sc=new Scanner (System.in);
		int mark[][][]=new int[2][2][3];
		int sum[][]=new int[2][2];
		for(int i=0;i<mark.length;i++)
		{
			System.out.println("Department "+(i+1));
			for(int j=0;j<mark[i].length;j++)
			{
				System.out.println("Student "+(j+1));
				for(int k=0;k<mark[i][j].length;k++)
				{
					System.out.println("Mark "+(k+1));
					mark[i][j][k]=sc.nextInt();
					sum[i][j]+=mark[i][j][k];
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<sum.length;i++)
		{
			System.out.println("Department "+(i+1));
			for(int j=0;j<mark[i].length;j++)
			{
				System.out.println("Student "+(j+1)+" Total Mark is "+sum[i][j]);
			}
		}
	}
}