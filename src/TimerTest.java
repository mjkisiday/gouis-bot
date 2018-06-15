public class TimerTest {
    public static void main(String[] args){
        Thread worker = new Thread(new Runner());
        while(true){
            try{
                Thread.sleep(2000);
                worker.start();
                worker.interrupt();
            }catch(Exception e){
                System.out.println("The whole thing died");
            }
        }
    }

    static class Runner implements Runnable{
        public void run(){
            System.out.println("I tweeted");
            System.out.println(Thread.activeCount());
        }
    }

}
