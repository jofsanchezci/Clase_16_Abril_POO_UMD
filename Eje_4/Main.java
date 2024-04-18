import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("Juan", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Yo, Juan Gallo de Andrada, escribano de Camara del Rey nuestro senor, de los que residen en su Consejo, certifico y doy fe que, habiendo visto por los senores del un libro intitulado El ingenioso hidalgo de la Mancha");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Se encontro");
    } else {
      System.out.println("NO se encontro");
    }
  }
}