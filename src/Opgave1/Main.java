package Opgave1;

public class Main {
    public static void main(String[] args) {
        StringClass stringObjekt = new StringClass("");
        myThread thread1 = new myThread(stringObjekt);
        myThread2 thread2 = new myThread2(stringObjekt);


        thread1.start();
        thread2.start();

        System.out.println("Write... ");

    }
}