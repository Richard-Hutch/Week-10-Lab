public class Printer {
    int incrementer = 1;
    protected synchronized void print(ThreadTest tt){

        while(incrementer != tt.getID()){
            try{
                wait();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(tt.getID());
        incrementer++;

        notifyAll();
    }
}
