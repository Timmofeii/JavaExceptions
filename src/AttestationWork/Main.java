package AttestationWork;

import AttestationWork.View.SimpleMenu;

public class Main {
    public static void main(String[] args) {

        Application app= new Application(new SimpleMenu());
        app.start();

    }
}
