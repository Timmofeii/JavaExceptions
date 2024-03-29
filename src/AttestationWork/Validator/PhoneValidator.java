package AttestationWork.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator {
    public boolean isValidPhoneNumber(String phoneNumber){
        String regex= "^\\+[1-9]\\d{1,14}$";
        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
