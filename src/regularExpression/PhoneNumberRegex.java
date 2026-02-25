package regularExpression;

import java.util.regex.Pattern;

public class PhoneNumberRegex {

    public static void main(String[] args) {
        System.out.println(phoneNumber("7736273202"));
        System.out.println(phoneNumber("123-456-0123"));
        System.out.println(emailNo("avinashsurwase60@gmail.com"));
    }

    static boolean phoneNumber(String number) {
        String indianPhoneNumber = "(\\+91)?[6-9]\\d{9}";
        String usaPhoneNumber = "^\\(?\\d{3}\\)?[-\\s]?\\d{3}[-\\s]?\\d{4}$";
        return Pattern.matches(indianPhoneNumber, number) || Pattern.matches(usaPhoneNumber, number);
    }
    ///     Indian PhoneNumber Regex:
    ///     ^ - starting string(optional)
    ///     $ - ending string(optional)
    ///     (\\+91) - starting with +91
    ///     ? - define or value/optional value
    ///     [6-9] - number start this number
    ///     \\d{9} or \\{10} - length of number;
    ///     \\d - digit
    /// note - regex serial maintain


    ///  US phone number of format (123)123-1234 -- true 123-123-1234 -- true



    static boolean emailNo(String email){

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+\\.(com|co\\.in|org)$";

//        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.(com|co\\.in|org)$";
//        return Pattern.matches(emailRegex, email);
        return Pattern.matches(regex,email);
    }

    String type = "Indian";
    String type2 = "USA";
    static boolean currency(String type){
        return Pattern.matches("\\d{10}", type);
    }
}

/// Pattern.matches();