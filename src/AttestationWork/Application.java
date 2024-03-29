package AttestationWork;

import AttestationWork.Parser.Parser;
import AttestationWork.View.Menu;

import java.util.Scanner;

public class Application {
    private Menu menu;

    public Application(Menu menu) {
        this.menu = menu;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        Parser parser = new Parser();
        MyFileWriter fileWriter = new MyFileWriter();
        String data;
        while (true) {
            menu.printMenu();
            data = sc.nextLine();
            fileWriter.write(parser.parsing(data),data);

        }
    }
}
