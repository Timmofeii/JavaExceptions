package AttestationWork.Validator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BirthdayValidator implements DateValidator {
    private String dateFormat;

    public BirthdayValidator(String dateFormat) {
        this.dateFormat = dateFormat;
    }


    @Override
    public boolean isValid(String dateStr) {
        DateFormat sdf = new SimpleDateFormat(this.dateFormat);
        sdf.setLenient(false);
        try {

            sdf.parse(dateStr);

        } catch (ParseException ex) {
            ex.printStackTrace();
        }
return true;
    }
}
