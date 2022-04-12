import java.util.Scanner;

public class Programme6 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez 5 nombres : ");
        int nbr1 = sc.nextInt();
        int nbr2 = sc.nextInt();
        int nbr3 = sc.nextInt();
        int nbr4 = sc.nextInt();
        int nbr5 = sc.nextInt();

        int moyenne = (nbr1 + nbr2 + nbr3 + nbr4 + nbr5)/5;

        System.out.println("La moyenne est : " + moyenne);
    }
    
}
