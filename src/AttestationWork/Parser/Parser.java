package AttestationWork.Parser;

public class Parser {
    ParserException exception = new ParserException();
    String dataArray[];

    public String[] parsing(String data) {
        dataArray = data.split(" ");
        checkCorrectData();
        return dataArray;
    }

    public boolean checkCorrectData() {
        exception.checkSize(dataArray);
        for (int i = 0; i < dataArray.length; i++) {
            switch (i) {
                case 0, 1, 2:
                    exception.checkFIO(dataArray[i]);
                    break;
                case 3:
                    exception.checkBirthday(dataArray[i]);
                    break;
                case 4:
                    exception.checkPhoneNumber(dataArray[i]);
                    break;
                case 5:
                    exception.checkGender(dataArray[i]);
                    break;
            }
        }
        return true;
    }

}
