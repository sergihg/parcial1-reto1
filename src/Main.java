import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation;
        int parameter1;
        int parameter2;
        System.out.println("Captura operación: ");
        operation = scanner.nextLine();
        switch (operation) {
            case "SUMA" -> {
                System.out.println("Operando 1: ");
                parameter1 = scanner.nextInt();
                System.out.println("Operando 2: ");
                parameter2 = scanner.nextInt();
                System.out.println(parameter1 + " + " + parameter2 + " = " + (parameter1 + parameter2));
            }
            case "RESTA" -> {
                System.out.println("Operando 1: ");
                parameter1 = scanner.nextInt();
                System.out.println("Operando 2: ");
                parameter2 = scanner.nextInt();
                System.out.println(parameter1 + " - " + parameter2 + " = " + (parameter1 - parameter2));
            }
            case "MULTIPLICACION" -> {
                System.out.println("Operando 1: ");
                parameter1 = scanner.nextInt();
                System.out.println("Operando 2: ");
                parameter2 = scanner.nextInt();
                System.out.println(parameter1 + " * " + parameter2 + " = " + (parameter1 * parameter2));
            }
            case "DIVISION" -> {
                System.out.println("Operando 1: ");
                parameter1 = scanner.nextInt();
                System.out.println("Operando 2: ");
                parameter2 = scanner.nextInt();
                System.out.println(parameter1 + " / " + parameter2 + " = " + (parameter1 / parameter2));
            }
            default -> System.out.println("Operación no soportada");
        }
    }
}