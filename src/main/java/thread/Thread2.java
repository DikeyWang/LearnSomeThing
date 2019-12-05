package thread;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Baldwin
 * \* E_Mail: baldwin@chancellorhk.com || DikeyWang@163.com
 * \* Date: 2019/12/4
 * \* Time: 19:56
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Thread2 extends Thread{
    private int threadNo;

    private static final Thread2 singleThread = new Thread2();

    public int getThreadNo() {
        return threadNo;
    }

    public void setThreadNo(int threadNo) {
        this.threadNo = threadNo;
    }

    private Thread2() {
    }

    public static Thread2 getSingleThread(){
        return singleThread;
    }

    @Override
    public void run() {
        for (int i =1;i<10001;i++){
            System.out.println("threadNo :"+this.threadNo+"=" +i);
        }
    }
}