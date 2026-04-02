package First_Class;
import java.util.Scanner;

public class SaveData {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int Age = leer.nextInt();

        System.out.println("¡Genial! Tienes " + Age + " años.");

        leer.close();
    }
}