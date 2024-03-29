package AttestationWork.Parser;

import AttestationWork.Validator.BirthdayValidator;
import AttestationWork.Validator.PhoneValidator;

import java.time.DateTimeException;
import java.util.zip.DataFormatException;

public class ParserException extends Exception {
    public void checkSize(String[] dataArray) {
        if (dataArray.length != 6) {
            throw new RuntimeException("Not correct count parameters");
        }

    }

    public void checkFIO(String fio) {
        if (fio.length() < 2) {
            throw new RuntimeException("Not correct length " + fio);
        }
    }

    public void checkBirthday(String s) {
        BirthdayValidator validator = new BirthdayValidator("dd.mm.yyyy");
      if(!validator.isValid(s)){
          throw new DateTimeException("Not correct date "+s);
      }
    }


    public void checkPhoneNumber(String s) {
        PhoneValidator phoneValidator = new PhoneValidator();
        if(!phoneValidator.isValidPhoneNumber(s)){
            throw new RuntimeException("Not correct phoneNumber format "+ s );
        }
    }

    public void checkGender(String s) {
        boolean isGender=s.equalsIgnoreCase("f") || s.equalsIgnoreCase("m");
       if(!isGender) {
           throw new RuntimeException("Not gender "+ s);
       }


    }
}
