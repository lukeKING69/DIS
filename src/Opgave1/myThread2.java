package Opgave1;

public class myThread2 extends Thread{

    StringClass stringClass;

    public myThread2(StringClass stringClass) {
        this.stringClass = stringClass;
    }

    public void run() {
        try {
            while (true) {
                sleep(3000);
                System.out.println(stringClass.getString());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}
