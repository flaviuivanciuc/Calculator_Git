import java.util.Scanner;

public class Operations {

    Scanner bucket = new Scanner(System.in);
    double a;
    double b;
    double result;


    public void addition() {
        System.out.println("Introduceti primul numar:");
        a = bucket.nextDouble();
        System.out.println("Introduceti al doilea numar:");
        b = bucket.nextDouble();
        result = a + b;
    }

    public void substraction() {
        System.out.println("Introduceti primul numar:");
        a = bucket.nextDouble();
        System.out.println("Introduceti al doilea numar:");
        b = bucket.nextDouble();
        result = a - b;
    }

    public void division() {
        System.out.println("Introduceti primul numar:");
        a = bucket.nextDouble();
        System.out.println("Introduceti al doilea numar:");
        b = bucket.nextDouble();
        result = a / b;
    }

    public void multiplication() {
        System.out.println("Introduceti primul numar:");
        a = bucket.nextDouble();
        System.out.println("Introduceti al doilea numar:");
        b = bucket.nextDouble();
        result = a * b;
    }

}
