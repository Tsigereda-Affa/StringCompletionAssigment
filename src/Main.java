import java.util.Scanner;
public class Main {

        public static void main( String[] args )
        {
            Scanner sca = new Scanner(System.in);
            //

            String name;
            String breed;
            int age;



            System.out.print( "Greetings. What is your pet's name? " );

            name = sca.next();

            System.out.print( "What kind of animal is " + name + "? " );
            breed = sca.next();

            System.out.print( "How old is " + name + "? ");
            age = sca.nextInt();
            System.out.println( name + " is your " + breed + " and it is " + age );
        }
    }

