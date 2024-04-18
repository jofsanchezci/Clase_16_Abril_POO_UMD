import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NotationValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número con notación científica o decimal:");
        String userInput = scanner.nextLine();

        if (validateNumber(userInput)) {
            System.out.println("El número ingresado es válido.");
        } else {
            System.out.println("El número ingresado no es válido.");
        }

        scanner.close();
    }

    public static boolean validateNumber(String input) {
        // Expresión regular que valida números en notación científica o decimal
        String numberPattern = "[-+]?[0-9]*\\.?[0-9]+([eEpP][-+]?[0-9]+)?";
        
        // Compilar la expresión regular en un objeto Pattern
        Pattern pattern = Pattern.compile(numberPattern);

        // Crear un objeto Matcher para hacer coincidir el patrón con la entrada del usuario
        Matcher matcher = pattern.matcher(input);

        // Devolver true si la entrada coincide con el patrón, de lo contrario, devolver false
        return matcher.matches();
    }
}
