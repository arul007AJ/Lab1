import java.util.Scanner;
class Temperature{
	public static void main(String... args)
	{
		Scanner sc=new Scanner(System.in);
		int city[][]=new int[2][6];
		int s[]=new int[2];
		for(int i=0;i<city.length;i++)
		{
			System.out.println("Enter City "+(i+1)+" Daily Temperature");
			for(int j=0;j<city[i].length;j++)
			{
				System.out.println("Enter Day "+j+" Temperature");
				city[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<city.length;i++)
		{
			for(int j=0;j<city[i].length;j++)
			{
				s[i]+=city[i][j];
			}
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Weekly Temperature of the City "+(i+1)+" is "+(s[i]/6));
		}
	}
}