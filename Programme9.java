import java.util.Scanner;

public class Programme9 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisissez un entier : ");
        int entier = sc.nextInt();

        System.out.println("Saisissez un réel : ");
        float reel = sc.nextFloat();

        System.out.println("Saisissez une chaine de caracteres : ");
        String chaine = sc.nextLine();

        System.out.println(entier);
        System.out.println(reel);
        System.out.println(chaine);
    }
    
}
