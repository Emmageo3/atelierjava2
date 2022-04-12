import java.util.Scanner;

public class Programme5 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez le dividende : ");
        int nbr1 = sc.nextInt();

        System.out.println("Saisissez le diviseur : ");
        int nbr2 = sc.nextInt();

        while(nbr2 == 0)
        {
            System.out.println("Le diviseur ne doit pas etre nul");
            System.out.println("Saisissez le diviseur : ");
            nbr2 = sc.nextInt();
        }

        int quotient = nbr1/nbr2;

        System.out.println(nbr1 + "/" + nbr2 + "=" + quotient);
    }
    
}
