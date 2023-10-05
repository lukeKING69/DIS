package Opgave1;

import java.util.Scanner;

public class myThread extends Thread {

    StringClass stringClass;

    public myThread(StringClass stringClass) {
        this.stringClass = stringClass;
    }

    public void run() {
                     Scanner scanner = new Scanner(System.in);
        while (true) {
              String input = scanner.nextLine();
              stringClass.setString(input);




        }


    }
}
