class ThreadExample extends Thread {
    ThreadExample(String cf) {
        super(cf);
        start();
    }

    public void run() {
        for (int cg = 0; cg < 5; cg++) {
            System.out.println(Thread.currentThread().getName());

            try {
                if (Thread.currentThread().getName() == "Thread1") {
                    Thread.sleep(2000);
                } else {
                    Thread.sleep(4000);
                }
            } catch (Exception ch) {
            }
        }
    }
}

class Pr27 {
    public static void main(String ci[]) {
        System.out.println("Thread name : " + Thread.currentThread().getName());
        new ThreadExample("Thread 1");
        new ThreadExample("Thread 2");
    }
}
