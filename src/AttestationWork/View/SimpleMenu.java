package AttestationWork.View;

import AttestationWork.View.Menu;

public class SimpleMenu implements Menu {
   private String textMenu="Введите следующие данные, разделеные пробелом: ";
   private String textSimpleData="Фамилия Имя Отчество дата _ рождения номер _ телефона пол";
   private String simpleFIO ="фамилия, имя, отчество - строки";
   private String simpleBirthDay ="дата _ рождения - строка формата dd.mm.yyyy";
   private String simplePhoneNumber ="+123456789";
   private String simpleGender= "символ латиницей f или m";


    @Override
    public void printMenu( ) {
        System.out.println(textMenu);
        System.out.println(textSimpleData);
        System.out.println(simpleFIO);
        System.out.println(simpleBirthDay);
        System.out.println(simplePhoneNumber);
        System.out.println(simpleGender);
    }



}
