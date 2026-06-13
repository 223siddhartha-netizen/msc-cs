import java.util.Scanner;


public class Main {
    public static void main (String[] args ) {
        // scanner to java 
        Scanner scanner = new Scanner(System.in);


        System.out.print(" What is your name ? :  ");
        String name = scanner.nextLine();

        System.out.print( " what is your age ? :");

        int age = scanner.nextInt();
        
        System.out.println("your are an adult" + " " + age +" "+ "years old" );
        System.out.println("Bonjour"+ " " + name);



        scanner.close();


    }
}