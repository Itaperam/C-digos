// Runnable que executa duas tarefas, x e y

import java.util.concurrent.*;
public class RunnableTask implements Runnable {

    int r;

    // Construtor
    public RunnableTask(int r){
        this.r = r;
    }

    @Override
    public void run() {
        // Exibe o Nº do Thread e a tarefa que executou
        //System.out.println("T -- " + r + ": Tafefa x");
        //System.out.println("T -- " + r + ": Tafefa y");

        //try {
            System.out.println("T -- " + r + ": Tafefa x");
            //Thread.sleep(2000);
            System.out.println("T -- " + r + ": Tafefa y");
            //Thread.sleep(2000);
            //Thread.currentThread().stop();
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}

   }

}
