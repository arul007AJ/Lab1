import java.util.Scanner;

 class Exam {

    public static void main(String... args[])
       {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        int a = sc.nextInt();
        int b = 0;
    
        for(int i=0; i<a; i++)
        {
            if(i*(i+1) == a)
            {
                b = 1;
                break;
            }
        }
         
        if(b == 1)
            System.out.println("It is a Pronic Number");
        else
            System.out.println("It is not a Pronic Number");      
    }
}