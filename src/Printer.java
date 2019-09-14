/**
 * Created by Amila Wickramarathne.
 * Date: 9/14/2019
 * Time: 6:51 AM
 */
public class Printer extends Thread {

    @Override
    public void start(){
        super.start();
        System.out.println("this is a start method");
    }

    @Override
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println(i +"child");
        }

    }


}
