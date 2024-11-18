public class Worker implements Runnable {

    /* Burada bizim 5 task'ımız olacak. Bu 5 Task'ı 5 thread'e atayacağız. İlk önce
        ikisini çalıştıracağız, diğer threadler bekleyecek. Sonra iki farklı threadi
        çalıştıracağız ve diğerleri bekleyecek en sonda da 1 thread çalışarak program
        bitecek. Bunun amacı şudur:

        Bazı büyük projelerde yüzlerce thread olabilir. Yüzlerce thread'in aynı zamanda
        çalışması programa büyük yük oluşturur ve bellekte fazlaca yer kaplanır. Bunun
        için de ihtiyacımız olan threadleri çalıştırıp olmayanları bekletebiliriz. Bunu
        daha kolay yapmak için de "Executor Service" kullanırız. Thread Pools'un olayı
        budur. Peki bunu nasıl yapacağız ?? --->>       */


    private String isim;
    private int taskID;

    public Worker(String isim, int taskID) {
        this.isim = isim;
        this.taskID = taskID;
    }

    @Override
    public void run() {
        System.out.println("Worker " + isim + " " + taskID + ". işe başladı.");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Worker " + isim + " " + taskID + ". işi bitirdi.");
    }

}
