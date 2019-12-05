package thread;

public class Thread1  extends Thread{

    private String myName;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public Thread1() {}

    public Thread1(String myName) {
        this.myName = myName;
    }

    @Override
    public void run() {
        sayMyName();
    }

    private void sayMyName() {
        for(int i =0;i < 5 ; i++){

        }
    }


    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.setMyName("Baldwin");
        thread1.start();
    }
}