import java.util.ArrayList;

public class ThreadTest extends Thread{
    private int id;
    private Printer printer;
    public ThreadTest(Printer p, int i){
        id = i;
        printer = p;
    }
    public synchronized void run(){
        printer.print(this);
    }
    public int getID(){
        return id;
    }
    public static void main(String[] args) {
        ArrayList<ThreadTest> threads = new ArrayList<>();
        Printer printer = new Printer();
        for (int i = 1; i <= 20; ++i){
            ThreadTest thread = new ThreadTest(printer, i);
            threads.add(thread);
        }
        for (ThreadTest t : threads){
            t.start();
        }

    }
}
