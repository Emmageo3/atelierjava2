import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Programme7 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez le nombre : ");
        int nbr = sc.nextInt();

        if(nbr > 0)
        {
            System.out.println("Ce nombre est positif");
        } else if (nbr < 0)
        {
            System.out.println("Ce nombre est négatif");
        } else {
            System.out.println("Ce nombre est nul");
        }

    }
    
}
