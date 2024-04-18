import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddressValidator {
    private static final String IPV4_PATTERN =
            "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

    private static final String IPV6_PATTERN =
            "([0-9a-fA-F]{1,4}:){7}([0-9a-fA-F]{1,4}|:)|::([0-9a-fA-F]{1,4}:){0,5}([0-9a-fA-F]{1,4})?";

    private static final Pattern ipv4Pattern = Pattern.compile(IPV4_PATTERN);
    private static final Pattern ipv6Pattern = Pattern.compile(IPV6_PATTERN);

    public static boolean validateIPv4(final String ip) {
        Matcher matcher = ipv4Pattern.matcher(ip);
        return matcher.matches();
    }

    public static boolean validateIPv6(final String ip) {
        Matcher matcher = ipv6Pattern.matcher(ip);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] ips = {
                "192.168.1.1",
                "255.255.255.0",
                "2001:0db8:85a3:0000:0000:8a2e:0370:7334",
                "2001:0db8:85a3::8a2e:0370:7334",
                "fe80::226:55ff:fe5e:4c4d",
                "::1",
                "invalid_ip"
        };

        for (String ip : ips) {
            if (validateIPv4(ip)) {
                System.out.println(ip + " es una dirección IP v4 válida.");
            } else if (validateIPv6(ip)) {
                System.out.println(ip + " es una dirección IP v6 válida.");
            } else {
                System.out.println(ip + " no es una dirección IP válida.");
            }
        }
    }
}
