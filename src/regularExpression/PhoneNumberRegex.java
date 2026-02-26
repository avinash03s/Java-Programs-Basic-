package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


class RegularExpression {

    public static boolean verify(String regex, String check) {
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(check);
        return matcher.matches();
    }

    public static void checkIndianNumber(String indianPhoneNumber, String test) {
        if (verify(indianPhoneNumber, test)) {
            System.out.println("Phone Number Valid");
        } else {
            System.out.println("Phone Number Are not Valid");
        }
    }

    public static void checkUSANumber(String usaPhoneNumber, String testUsa) {
        if (verify(usaPhoneNumber, testUsa)) {
            System.out.println("Phone Number Valid");
        } else {
            System.out.println("Phone Number Are not Valid");
        }
    }

    public static void main(String[] args) {
        String indianPhoneNumber = "(\\+91)?[6-9]\\d{9}";
        String test = "8767622435";

        String usaPhoneNumber = "^\\(?\\d{3}\\)?[-\\s]?\\d{3}[-\\s]?\\d{4}$";
        String testUsa = "(123)123-1234";

        checkIndianNumber(indianPhoneNumber, test);
        System.out.println();
        checkUSANumber(usaPhoneNumber, testUsa);
    }
}

///     Indian PhoneNumber Regex:
///     ^ - starting string(optional)
///     $ - ending string(optional)
///     (\\+91) - starting with +91
///     ? - define or value/optional value
///     [6-9] - number start this number
///     \\d{9}  - 9 digit after 1 digit;
///     \\d - digit
/// note - regex serial maintain


///  US phone number of format (123)123-1234 -- true 123-123-1234 -- true


/// Pattern.matches();
