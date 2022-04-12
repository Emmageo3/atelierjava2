import java.util.Scanner;

public class Programme8 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez un nombre : ");
        int nbr = sc.nextInt();

        for(int i = 0; i <= nbr; i++)
        {
            System.out.println(i);
        }
    }
    
}
