import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Marks in English = ");
        int English = sc.nextInt();
        System.out.print("Marks in Maths = ");
        int Maths = sc.nextInt();
        System.out.print("Marks in Physics = ");
        int Physics = sc.nextInt();
        System.out.print("Marks in Chemistry = ");
        int Chemistry = sc.nextInt();
        System.out.print("Marks in Computer science = ");
        int ComputerScience = sc.nextInt();
        System.out.print("Marks in Biology = ");
        int Biology = sc.nextInt();
        System.out.println("Total pecentage = "
                + (int) ((double) ((English + Maths + Physics + Chemistry + ComputerScience + Biology) / (double) 600)
                        * 100)
                + '%');

    }
}
