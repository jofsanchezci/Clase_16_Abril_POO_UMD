import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    private static final String EMAIL_PATTERN =
        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
        "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    public static boolean validate(final String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] emails = {"test@example.com", "invalid.email@umd.edu.co", "another@example", "user.com"};

        for (String email : emails) {
            if (validate(email)) {
                System.out.println(email + " es una dirección de correo electrónico válida.");
            } else {
                System.out.println(email + " no es una dirección de correo electrónico válida.");
            }
        }
    }
}


