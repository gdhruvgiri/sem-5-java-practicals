public class pr29 {
    public static void main(String[] cf) {
        final String cg = "abc";
        final String ch = "def";
        // t1 tries to lock cg then ch
        Thread t1 = new Thread() {
            public void run() {
                synchronized (cg) {
                    System.out.println("Thread 1: locked resource 1");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }

                    synchronized (ch) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };

        // t2 tries to lock ch then cg
        Thread t2 = new Thread() {
            public void run() {
                synchronized (ch) {
                    System.out.println("Thread 2: locked resource 2");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }

                    synchronized (cg) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}