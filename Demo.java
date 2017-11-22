public class Demo implements Runnable {

    public static void main(String[] args) throws InterruptedException{

            System.out.print("1");
            Thread t = new Thread(new Demo());
            t.start();
            System.out.print("2");
            t.join();
            System.out.print("3");
    }
    public void run() {
        System.out.print("A");
        System.out.print("B");
    }
}
