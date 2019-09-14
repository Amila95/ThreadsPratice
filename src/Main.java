public class Main {

    public static void main(String[] args) throws InterruptedException {

//        Printer printer = new Printer();
//        printer.setDaemon(true);
//        printer.start();

        PrinterRun printerRun = new PrinterRun();
        Thread thread = new Thread(printerRun);
//        Thread.currentThread().setPriority(1);
//        System.out.println("Main" + Thread.currentThread().getPriority());
//        System.out.println("child" + thread.getPriority());

        thread.start();
//        thread.interrupt();
//        thread.join();

        for(int i=0; i<10; i++){
            System.out.println(i +"main");
        }
    }
}
