class X implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("in the run x " + i);
        }
        System.out.println("End of thread x");
    }
}

class Y implements Runnable {
    public void run() {
        for(int j = 1; j<=3;j++)
        {
            System.out.println("in the run y :" + j);
        }
        System.out.println("End of thread y ");
    }
}

class Inte1 {
    public static void main(String[] args) {
        X r = new X();
        Y u = new Y();
        Thread t = new Thread(r);
        Thread e = new Thread(u);
        t.start();
        e.start();
    }
}