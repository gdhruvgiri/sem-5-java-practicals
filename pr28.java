public class pr28 extends Thread {
    volatile static int cf = 1;
    Object cg;

    pr28(Object cg) {
        this.cg = cg;
    }

    public static void main(String ch[]) {
        Object ci = new Object();
        pr28 cj = new pr28(ci);
        pr28 ck = new pr28(ci);
        cj.setName("Odd");
        ck.setName("Even");
        cj.start();
        ck.start();
    }

    @Override
    public void run() {
        while (cf <= 50) {
            if (cf % 2 == 0 && Thread.currentThread().getName().equals("Even")) {
                synchronized (cg) {
                    System.out.println(Thread.currentThread().getName() + " - " + cf);
                    cf++;
                    try {
                        cg.wait();
                    } catch (InterruptedException cl) {
                        cl.printStackTrace();
                    }
                }
            }
            if (cf % 2 == 1 && Thread.currentThread().getName().equals("Odd")) {
                synchronized (cg) {
                    System.out.println(Thread.currentThread().getName() + " - " + cf);
                    cf++;
                    cg.notify();
                }
            }
        }
    }
}
