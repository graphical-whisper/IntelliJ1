import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Calculator App");
        System.out.print("Insert the value");
        Scanner consola= new Scanner(System.in);
        var operator1 = Integer.parseInt(consola.nextLine());
        var operator2 = Integer.parseInt(consola.next());
        var answer= operator2+operator1;
    }
}