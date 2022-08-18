import java.util.Scanner;

public class Klub {
    public static void main(String[] args) {
        System.out.println("Jak masz na imie?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Czesc " + name + " ile masz lat?");
        int age = scanner.nextInt();
        if (age >= 21){
            System.out.println("Wchodzisz do klubu");
        } else {
            System.out.println("Nie wchodzisz do klubu");
        }

    }
}
