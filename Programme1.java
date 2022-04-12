import java.util.Scanner;

public class Programme1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez le premier nombre : ");
        int nbr1 = sc.nextInt();
        System.out.println("Entrez le second nombre : ");
        int nbr2 = sc.nextInt();

        System.out.println(nbr1 + "+" + nbr2 + "=" + nbr1+nbr2);
    }
}