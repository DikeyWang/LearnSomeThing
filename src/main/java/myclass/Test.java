package myclass;

import thread.Thread1;
import thread.Thread2;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i<10;i++){
            Thread2 thread2 = Thread2.getSingleThread();
            thread2.start();
            Thread.sleep(1);
        }
    }
}
