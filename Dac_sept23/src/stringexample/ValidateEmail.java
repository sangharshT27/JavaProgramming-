
public class ValidateEmail {
    public static boolean isValidEmail(String email) {
    
        if (email == null || email.isEmpty()) {
            return false;
        }


        int atIndex = email.indexOf('@');
        if (atIndex == -1 || atIndex == 0 || atIndex == email.length() - 1) {
            return false;
        }

        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1);


        if (isValidUsername(username) && isValidDomain(domain)) {
            return true;
        }

        return false;
    }

    private static boolean isValidUsername(String username) {
        for (char c : username.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '.' && c != '_' && c != '-') {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidDomain(String domain) {
        // Check if the domain contains only valid characters (alphanumeric and dot)
        for (char c : domain.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '.') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        
        String[] emails = {
            "tamgadgesangharsh123@gmail.com",
            "sjkjd.aj"
        };

        for (String email : emails) {
            if (isValidEmail(email)) {
                System.out.println(email + " is a valid email address.");
            } else {
                System.out.println(email + " is not a valid email address.");
            }
        }
    }
}
